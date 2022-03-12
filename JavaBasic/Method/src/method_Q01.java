public class method_Q01 {

	public static void main(String[] args) {
		
		// com.test.java.question.method > "Q01.java"
		
		// 1번 문제 인삿말
		
		// public class 안에 인삿말 메소드 3개 선언
		// 메소드 3개 인사(첫인사) > 소개 > 인사(끝인사) 호출
		hello();
		introduce();
		bye();
		
	}
	
	// 인삿말 메소드 선언
	// 안녕하세요. 출력하는 method
	public static void hello() {
		
		System.out.println("안녕하세요.");
		
	}
	
	// 저는 홍길동입니다. 출력하는 method
	public static void introduce() {
		
		System.out.println("저는 홍길동입니다.");
		
	}
	// 안녕히가세요. 출력하는 method
	public static void bye() {
		
		System.out.println("안녕히가세요.");
		
	}
	
}
