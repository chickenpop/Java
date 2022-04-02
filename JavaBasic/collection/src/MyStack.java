public class MyStack {

	private String[] list;  
	private int index;     
	   
	public MyStack() {
		this.index = 0;
	}
	
	// 값을 순차적으로 추가함
	public boolean push(String value) {
		
		init();
		
		if(checkLength()) {
			doubleStack();
		}
		
		this.list[this.index] = value;
		this.index++;
		return true;
	}
	
	// 배열 범위 이상의 길이인지 확인
	private boolean checkLength() {
		
		if(this.index == this.list.length) {
			return true;
		}
		
		return false;
	}

	// 배열 생성
	private void init() {
		if(this.index == 0) {
			list = new String[4];
		}
	}
	
	// 배열 2배로 생성 및 교체
	private void doubleStack() {
		if(this.index == list.length) {
			String[] temp = new String[this.list.length * 2];
    	  	for(int i=0; i<this.list.length; i++) {
    		  temp[i] = this.list[i];
    	 	 }
    	  	this.list = temp;
    	}
	}
	
	// 값을 순차적으로 가져옴
	public String pop() {
		this.index--;
		String tmp = this.list[this.index];
		this.list[this.index] = null;
		return tmp;
	}
	
	// 요소의 개수를 반환함
	public int size() {
	   int cnt = 0;
	   for(String i : this.list) {
		   if(i != null)
			   cnt++;
	   }
	   return cnt;
	}
	
	// 이번에 가져올 값을 확인
	public String peek() {
		this.index--;
		String tmp = this.list[this.index];
		this.index++;
		return tmp;
	}
	
	// 배열의 요소의 수만큼 배열의 길이를 줄임
	public void trimToSize(){
		String[] temp = new String[this.list.length];
		for(int i=0; i<this.list.length; i++) {
			temp[i] = this.list[i];
		}
		this.list = temp;
		
	}
	
	// 배열의 모든 요소 삭제함
	public void clear() {
		this.list = new String[4];
		this.index = 0;
	}
	
	
}
