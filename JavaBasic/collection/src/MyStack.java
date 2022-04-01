public class MyStack {

	private String[] list;  
	private int index;     
	   
	public MyStack() {
		this.index = 0;
	}
	
	public boolean push(String value) {
		
		init();
		
		if(checkLength()) {
			doubleStack();
		}
		
		this.list[this.index] = value;
		this.index++;
		return true;
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
	
	private void doubleStack() {
		if(this.index == list.length) {
			String[] temp = new String[this.list.length * 2];
    	  	for(int i=0; i<this.list.length; i++) {
    		  temp[i] = this.list[i];
    	 	 }
    	  	this.list = temp;
    	}
	}
	
	public String pop() {
		this.index--;
		String tmp = this.list[this.index];
		this.list[this.index] = null;
		return tmp;
	}
	
	public int size() {
	   int cnt = 0;
	   for(String i : this.list) {
		   if(i != null)
			   cnt++;
	   }
	   return cnt;
	}
	
	public String peek() {
		this.index--;
		String tmp = this.list[this.index];
		this.index++;
		return tmp;
	}
	
	public void trimToSize(){
		String[] temp = new String[this.list.length];
		for(int i=0; i<this.list.length; i++) {
			temp[i] = this.list[i];
		}
		this.list = temp;
		
	}
	
	public void clear() {
		this.list = new String[4];
		this.index = 0;
	}
	
	
}
