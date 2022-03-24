public class GetterSetter_Q01 {

	public static void main(String[] args) {

		// 1번 문제 Book
		
		Book b1 = new Book();

		b1.setTitle("자바의 정석");
		b1.setPrice(45000);
		b1.setAuthor("남궁성");
		b1.setPublisher("도우출판");
		b1.setIsbn("8994492038");
		b1.setPage(1022);

		System.out.println(b1.info());
		
	}

}


class Book {
	
	 private String title;
	 private int price;
	 private String author;
	 private String publisher;
	 private String pubYear = "2019";
	 private String isbn;
	 private int page;
	 
	 public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if(checkTitle(title)) this.title = title;
		else System.out.println("제목의 글자가 유효하지 않습니다.");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price >= 0 && price < Math.pow(10, 6)) this.price = price;
		else System.out.println("올바르지 않은 가격입니다.");
	}


	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	
	public String getPubYear() {
		return this.pubYear;
	}
	
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPage() {
		return page;
	}
	
	public void setPage(int page) {
		if(page > 0) this.page = page;
		else System.out.println("페이지 수가 최소 1장은 있어야합니다.");
	}

	
	private boolean checkTitle(String title) {
		
		boolean flag = false; 
		
		if(title.length() > 50 || title.length() < 1) return false;
		
		title = title.replace(" ", "");
		for(int i=0; i<title.length(); i++) {
			
			char c = title.charAt(i);
			
			if(c >= '가' && c <= '힣') {
				flag = true;
			} else if(Character.toUpperCase(c) >= 'A' && Character.toUpperCase(c) <= 'Z') {
				flag = true;
			}else if(Character.toUpperCase(c) >= '0' && Character.toUpperCase(c) <= '9') {
				flag = true;
			} else {
				return false;
			}
			
		}
		
		return flag;
	}


	public String info() {
		
		return "제목: " + this.title + "\n" + 
			   "가격: " + this.price + "원\n" + 
			   "저자: " + this.author + "\n" + 
			   "출판사: " + this.publisher + "\n" +
			   "발행년도: " + this.pubYear + "년\n" +
			   "ISBN: " + this.isbn + "\n" +
			   "페이지: " + this.page + "장\n";
		
		
		/*
		
			다른 방법 1
			String.format();
			
			다른 방법 2
			StringBuilder sb = new StringBuilder();
			sb.append("제목: " + this.title);
			sb.append("\r\n");
			...
			sb.append(문자열은 String.format()으로 가능);
		 	
		 	return sb.toString(); // StringBuilder -> String
		 	
		*/
		 
	 }
	
}