public class MySet {

	private String[] list;
	private int index;
	private int nextId;
	
	public MySet() {
		this.index = 0;
		this.nextId = 0;
	}
	
	// 배열의 요소 추가
	public boolean add(String value) {
		
		init();
		
		if(checkLength()) {
			doubleList();
		}
		
		// indexOf으로 list에 없는 경우 add
		if(indexOf(value)==-1) {
			this.list[this.index] = value;
			this.index++;
			return true;
		}else {
			return false;
		}
		
	}

	// value가 존재하면 해당 index값 반환, 아니면 -1
	private int indexOf(String value) {
		for(int i=0; i<this.index; i++) {
			if(this.list[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}

	private void doubleList() {
		String[] temp = new String[this.list.length*2]; 
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
	
	private void init() {
		if(this.index == 0) {
			list = new String[4];
		}
	}
	
	// 요소의 개수를 반환
	public int size() {
		return this.index;
	}
	
	// 배열의 요소를 삭제함
	public boolean remove(String value) {
		
		int index = indexOf(value);
		
		if(index == -1) {
			return false;
		}
		
		for(int i=index; i<this.index-1;i++) {
			this.list[i] = this.list[i+1];
		}
		this.list[this.list.length-1] = null;
		this.index--;
		return true;
	}
	
	// 배열의 모든 요소 삭제 및 초기화
	public void clear() {
		this.index = 0;
		init();
	}
	
	// 다음 요소가 있는 지 확인
	public boolean hasNext() {
		if(this.nextId < this.index) {
			return true;
		}
		return false;
	}
	
	// 다음 요소를 반환
	public String next() {
		this.nextId++;
		return this.list[this.nextId-1];
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("length:"+this.list.length+"\n");
		sb.append("index:"+this.index+"\n");
		sb.append("[");
		for(int i=0; i<this.list.length;i++) {
			if(this.list[i] != null) {
				sb.append(this.list[i]+"\n");
			} else {
				sb.append("null\n");
			}
		}
		sb.append("]");
		return sb.toString();
	}
	
}






