public class GetterSetter_Q05 {

	public static void main(String[] args) {

		// 5번 문제 Box
		
		Box box1 = new Box();

		box1.cook();
		box1.check();
		box1.list();
		
		
	}

}

class Box {
	private Macaron[] list = new Macaron[10];
	private String[] QC = new String[10];
	private String[] colorList = { "red", "blue", "yellow", "white", "pink", "purple", "green", "black" };
	
	
	Box(){
		
		for(int i=0; i<list.length ; i++) {
			
			list[i] = new Macaron();
			
		}
		
	}
	
	
	public void cook() {
		
		for(int i=0; i<list.length; i++) {
			
			
			list[i].setSize((int)((Math.random()*10)+5));
			list[i].setColor(colorList[(int)(Math.random()*8)]);
			list[i].setThickness((int)((Math.random()*20)+1));
			
		}
		
		System.out.println("마카롱 10개를 만들었습니다.");
		System.out.println();
		
	}
	
	public void check() {
		
		int cnt = 0;
		for(int i=0; i<list.length; i++) {
			
			if(list[i].getSize() < 8 || list[i].getSize() > 14) {
				QC[i] = "불합격";
			}else if(list[i].getColor().equals("black")) {
				QC[i] = "불합격";
			}else if(list[i].getThickness() < 3 || list[i].getThickness() > 18) {
				QC[i] = "불합격";
			}else {
				QC[i] = "합격";
				cnt++;
			}
		}
		System.out.println("[박스 체크 결과]");
		System.out.printf("QC 합격 개수 : %d개\n", cnt);
		System.out.printf("QC 불합격 개수 : %d개\n", list.length-cnt);
		System.out.println();
	}
	
    public void list() {
    	
    	System.out.println("[마카롱 목록]");
    	for(int i=0; i<list.length; i++) {
    		
    		System.out.printf("%d번 마카롱 : %dcm(%s, %dmm):%s\n", 
    							i+1, 
    							list[i].getSize(),
    							list[i].getColor(),
    							list[i].getThickness(), 
    							QC[i]);
    		
    	}
    	
    }
    
}   
    
class Macaron {
    private int size;
    private String color;
    private int thickness;  
    
    public int getSize() {
    	return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getThickness() {
		return thickness;
	}
	public void setThickness(int thickness) {
		this.thickness = thickness;
	}
   
}