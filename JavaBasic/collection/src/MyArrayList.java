// ArrayList와 동일한 동작을 하는 클래스를 선언하시오.
// 모든 기능의 디테일 > 실제 ArrayList와 비교
public class MyArrayList {

   private String[] list;  // ArrayList의 내부 배열(*****)
   private int index;      // ***** 가장 중요
   
   public MyArrayList() {
      this.index = 0;
   }

   // 2배 늘려서 더 많은 데이터 입력
   public boolean add(String value) {
      if(this.index == 0) {
         this.list = new String[4];
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
   
   public String get(int id) {
      // 없는 방번호 요청??
	  return this.list[id];		  

   }
   
   public int size() {
	   int cnt = 0;
	   for(String i : this.list) {
		   if(i != null)
			   cnt++;
	   }
	   return cnt;
   }
   
   public String set(int index, String value) {	   
	   return this.list[index] = value;
   }
   
   public String remove(int index) {
	   String remove = this.list[index];
	   for(int i=index; i<list.length-1;i++) {
		   this.list[i] = this.list[i+1];
	   }
	   this.list[list.length-1] = null;
	   this.index--;
	   return remove;
   }
   
   public boolean add(int index, String value) {
	   for(int i=list.length-1; i>index; i--) {
		   list[i] = list[i-1];
	   }
	   this.list[index] = value;
	   this.index++;
	   return true;
   }
   
   public int indexOf(String value) {
	   for(int i=0; i<this.list.length; i++) {
		   if(this.list[i] == null) {
			   break;
		   }
		   if(this.list[i].equals(value)) {
			   return i;
		   }
	   }
	   return -1;
   }
   
   public void clear() {
	   this.list = new String[this.list.length];
	   this.index = 0;
   }
   // 테스트 필요
   public void trimToSize() {
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
   
}








