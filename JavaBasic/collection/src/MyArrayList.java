// ArrayList와 동일한 동작을 하는 클래스를 선언하시오.
// 모든 기능의 디테일 > 실제 ArrayList와 비교
public class MyArrayList {

	private String[] list; 	// ArrayList의 내부 배열(*****)
	private int index; 		// ***** 가장 중요

	public MyArrayList() {
		this.index = 0;
	}

	public boolean add(String value) {
		// return문이 필요한 경우 try-catch 둘다 return문을 적어야한다
		try {
			init();

			if (checkLength()) {
				doubleList();
			}

			this.list[this.index] = value;
			this.index++;

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// 배열의 공간이 모자르면 원래 크기의 2배로 만들어주고 값을 복사함
	private void doubleList() {

		String[] copyList = this.list;
		this.list = new String[list.length * 2];
		for (int i = 0; i < copyList.length; i++) {
			this.list[i] = copyList[i];
		}

	}

	// 인덱스로 배열의 크기 이상인지는 않나 점검
	private boolean checkLength() {

		if (this.index == this.list.length) {
			return true;
		}

		return false;
	}

	// 처음 배열의 크기는 4로 고정, 초기화 메소드
	private void init() {
		if (this.index == 0) {
			this.list = new String[4];
		}
	}

	public String get(int id) {
		// try-catch없이도 if문을 활용해 에러 방지
		if (!checkIndex(index)) {
			throw new IndexOutOfBoundsException();
		}
		return this.list[id];

	}

	public int size() {
		return this.index;
	}


	public String set(int index, String value) {

		if (!checkIndex(index)) {
			throw new IndexOutOfBoundsException();
		}

		String temp = this.list[index];
		this.list[index] = value;

		return temp;
	}

	private boolean checkIndex(int index) {

		if (index >= 0 && index < this.index) {
			return true;
		}
		return false;
	}

	public String remove(int index) {
		String remove = this.list[index];
		for (int i = index; i < list.length - 1; i++) {
			this.list[i] = this.list[i + 1];
		}
		this.list[list.length - 1] = null;
		this.index--;
		return remove;
	}

	public boolean add(int index, String value) {
		try {
			if (checkLength()) {
				doubleList();
			}
			for (int i = list.length - 1; i > index; i--) {
				list[i] = list[i - 1];
			}
			this.list[index] = value;
			this.index++;
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public int indexOf(String value) {
		for (int i = 0; i < this.index; i++) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}

	public int lastIndexOf(String value) {
		for (int i = this.index - 1; i >= 0; i--) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}

	public void clear() {
		// this.list = new String[this.list.length];
		this.index = 0;
	}

	public void trimToSize() {
		String[] copyList = new String[this.index];

		for (int i = 0; i < this.index; i++) {
			copyList[i] = this.list[i];
		}

		this.list = copyList;

	}

}


