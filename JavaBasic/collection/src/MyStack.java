public class MyStack {

	private String[] list;  
	private int index;     
	   
	public MyStack() {
		this.index = 0;
	}
	
	public boolean push(String value) {
		if(this.index == 0) {
			list = new String[4];
		} else if(this.index >= list.length) {
    	  String[] copyList = this.list;
    	  this.list = new String[list.length*2];
    	  for(int i=0; i<copyList.length; i++) {
    		  this.list[i] = copyList[i];
    	  }
    	}
		
		this.list[this.index] = value;
		this.index++;
		return true;
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
		String[] copyList = this.list;
		  int cnt = 0;
		   for(String i : this.list) {
			   if(i != null)
				   cnt++;
		   }
		  this.list = new String[cnt];
		  for(int i=0; i<this.list.length; i++) {
			  this.list[i] = copyList[i];
		  }
	}
	
	public void clear() {
		this.list = new String[4];
		this.index = 0;
	}
	
	
}
