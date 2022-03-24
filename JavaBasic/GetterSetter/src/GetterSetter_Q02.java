public class GetterSetter_Q02 {

	public static void main(String[] args) {

		// 2번 문제 Note
		
		// 테스트
		Note note = new Note();

		note.setSize("A5");
		note.setColor("흰색");
		note.setPage(10);
		note.setOwner("아무개");

		System.out.println(note.info());

		Note note2 = new Note();
		
		note2.setSize("A4");
		note2.setColor("검정색");
		note2.setPage(100);

		System.out.println(note2.info());
		
	} 

} // public class


class Note  {
	private String size;
	private String color;
	private int page;
	private String owner;
	private int price;

	// 변수
	private String[] sizeType = { "A3", "A4", "A5", "B3", "B4", "B5" };
	private String[] colorType = { "검정색", "흰색", "노란색", "파란색" };
	
	// getter, setter
	public void setSize(String size) {
		if(checkNote(size)) this.size = size;
		else System.out.println("유효하지 않은 크기입니다.");
	}

	public void setColor(String color) {
		if(checkColor(color)) this.color = color;
		else System.out.println("유효하지 않은 색상입니다.");
	}

	public void setPage(int page) {
		if(page < 10 || page > 200) System.out.println("페이지 수가 입력범위를 초과했습니다.");
		else {
			this.page = page;
		}
	}

	public void setOwner(String owner) {
		
		if(checkOwner(owner)) this.owner = owner;
		
	}

	private int getPrice(String size, String color, int page) {

		// 기본 노트 A5, 흰색, 10페이지
		this.price = 500;
		
		// 크기
		if(size.equals(sizeType[0])) {
			this.price += 400;
		} else if(size.equals(sizeType[1])) {
			this.price += 200;
		} else if(size.equals(sizeType[2])) {
			this.price += 0;
		} else if(size.equals(sizeType[3])) {
			this.price += 500;
		} else if(size.equals(sizeType[4])) {
			this.price += 300;
		} else if(size.equals(sizeType[0])) {
			this.price += 100;
		}
		
		
		// 색깔
		if(color.equals(colorType[0])) {
			this.price += 100;
		} else if(color.equals(colorType[1])) {
			this.price += 0;
		} else if(color.equals(colorType[2])) {
			this.price += 200;
		} else if(color.equals(colorType[3])) {
			this.price += 200;
		} 
		
		// 페이지 수
		this.price += (page-10) *10;
		
		return price;
	}
	
	// check 
	
	// 소유자
	private boolean checkOwner(String owner) {
		
		if(owner.length() < 2 || owner.length() > 5) return false;
		
		for(int i=0; i<owner.length(); i++) {
			char c = owner.charAt(i);
			if(c < '가' || c > '힣') {
				return false;
			}
		}
		
		return true;
	}

	// 노트 크기
	private boolean checkNote(String size) {
		
		for(int i=0; i<sizeType.length; i++) {
			if(sizeType[i].equals(size)) return true;
		}
		
		return false;
	}
	
	// 노트 색상
	private boolean checkColor(String color) {
		
		for(int i=0; i<colorType.length; i++) {
			if(colorType[i].equals(color)) return true;
		}
		
		return false;
	}
	
	
	// 페이지 특성 
	private String selectPageType(int page) {
		if(this.page >= 10 && this.page <= 50) {
			return "얇은";
		} else if(this.page >= 51 && this.page <= 100) {
			return "보통";
		} else {
			return "두꺼운";
		}
	}
	
	
	// info
	public String info() {
		if(this.owner == null) {
			this.owner = "주인 없는 노트";
			return  "■■■■■■ 노트 정보 ■■■■■■\n" +
					 this.owner+"\n" +
					"■■■■■■■■■■■■■■■■■■■■■■";
		}else{ 
			price = getPrice(size, color, page);
			return "■■■■■■ 노트 정보 ■■■■■■\n" + 
				    "소유자 : " + owner + "\n" +
				    "특성 : " + color + " "+ selectPageType(page) + " "+ size+"노트\n" +
				    "가격 : " + price + "원\n" +
				    "■■■■■■■■■■■■■■■■■■■■■■";
		}
	
	}
	
} // Note






