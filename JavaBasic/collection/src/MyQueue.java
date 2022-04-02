public class MyQueue {

	private String[] list;
	private int index;
	
	public MyQueue() {
		this.index = 0;
	}
	
	// 값을 순차적으로 추가한다.
	public boolean add(String value) {
		try {
			init();
			
			if(checkLength()) {
				doubleQueue();
			}
			
			this.list[this.index] = value;
			this.index++;
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	private void doubleQueue() {
		String[] temp = new String[this.list.length * 2];
		for(int i=0; i<this.list.length; i++) {
			temp[i] = this.list[i];
		}
		this.list = temp;
	}

	private boolean checkLength() {
		if(this.index == this.list.length) {
			return true;
		}
		return false;
	}

	public void init() {
		if(index == 0) {
			this.list = new String[4];
		}
	}
	
	// 값을 순차적으로 가져온다.
	public String poll() {
		String temp = this.list[0];
		for(int i=0; i<this.list.length-1; i++) {
			this.list[i] = this.list[i+1];
		}
		this.list[this.list.length-1] = null;
		this.index--;
		return temp;
	}
	
	// 요소의 개수를 반환한다.
	public int size() {
		return this.index;
	}
	
	// 이번에 가져올 값을 확인한다.
	public String peek() {
		return this.list[0];
	}
	
	// 배열안의 요소의 개수만큼 배열의 길이를 줄인다.
	public void trimToSize() {
		String[] temp = new String[this.index];
		for(int i=0; i<this.index; i++) {
			temp[i] = this.list[i];
		}
		this.list = temp;
	}
	
	// 배열의 모든 요소를 삭제한다.
	public void clear() {
		this.index = 0;
		init();
	}
	
	
	@Override
	public String toString() {
		String temp = "[";
		for(int i=0; i<this.list.length; i++) {
			temp += this.list[i] +"\n";
		}
		temp += "]";
		return String.format("length : %d\nindex : %d\n%s", this.list.length, this.index, temp);
	}
	
	
}








