public class MyHashMap {
	private Dictionary[] list;
	private int index;
	
	public MyHashMap() {
		this.index = 0;
	}
	
	// 키와 값을 요소로 추가
	public String put(String key, String value) {
		
		int index = indexOf(key);
		
		init();
		
		// list에 중복되는 키값 있으면 해당 요소 수정
		if(index > -1) {
			String temp = this.list[index].getValue();
			this.list[index] = new Dictionary(key, value);
			return temp;
		}
		
		if(checkLength()) {
			doubleList();
		}
		
		
		this.list[this.index] = new Dictionary(key, value);
		this.index++;
		return null;
	}

	// 초기화
	private void init() {
		if(this.index == 0) {
			list = new Dictionary[4];
		}
	}

	// 동일한 키가 존재하면 인덱스값 반환, 아니면 -1
	private int indexOf(String key) {
		
		for(int i=0; i<this.index; i++) {
			if(this.list[i].getKey().equals(key)) {
				return i;
			}
		}
		return -1;
	}

	private void doubleList() {
		Dictionary[] temp = new Dictionary[this.list.length*2]; 
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
	
	// 키에 대응하는 요소의 값을 가져옴
	public String get(String key) {
		for(int i=0; i<this.index; i++) {
			if(this.list[i].getKey().equals(key)) {
				return this.list[i].getValue();
			}
		}
		
		return null;
	}
	
	// 요소의 개수를 반환함
	public int size() {
		return this.index;
	}
	
	// 원하는 키의 요소를 삭제함
	public String remove(String key) {
	
		int index = indexOf(key);
		
		if(index == -1) {
			return null;
		}
		String temp = this.list[index].getValue();
		for(int i=index; i<this.index-1; i++) {
			this.list[i] = this.list[i+1];
		}
		this.index--;
		return temp;
	}
	
	// 해당 키가 존재하는 지 확인
	public boolean containKey(String key) {
		for(int i=0; i<this.index; i++) {
			if(this.list[i].getKey().equals(key)) {
				return true;
			}
		}
		return false;
	}
	
	// 해당 값이 존재하는 지 확인
	public boolean containsValue(String value) {
		for(int i=0; i<this.index; i++) {
			if(this.list[i].getValue().equals(value)) {
				return true;
			}
		}
		return false;
	}
	
	// 모든 요소 삭제 및 초기화
	public void clear() {
		this.index = 0;
		init();
	}
	
	// 배열의 요소 개수만큼 배열의 길이를 줄임
	public void trimTosize() {
		Dictionary[] temp = new Dictionary[this.index];
		for(int i=0; i<this.index; i++) {
			temp[i] = this.list[i];
		}
		this.list = temp;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("length:"+this.list.length+"\n");
		sb.append("index:"+this.index+"\n");
		sb.append("[");
		for(int i=0; i<this.list.length;i++) {
			if(this.list[i] != null) {
				sb.append(this.list[i].getKey()+","+this.list[i].getValue()+"\n");
			} else {
				sb.append("null, null\n");
			}
		}
		sb.append("]");
		return sb.toString();
	}
	
}

class Dictionary {
	private String key;
	private String value;
	
	public Dictionary(String key, String value) {
		this.key = key;
		this.value = value;
	}
	
	public String getKey() {
		return this.key;
	}

	public String getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return String.format("[key: %s, value: %s]", key, value);
	}
	
}