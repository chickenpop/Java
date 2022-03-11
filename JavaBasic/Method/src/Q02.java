public class Q02 {

	public static void main(String[] args) {
		
		// com.test.java.question.method > "Q02.java"
		
		// 2번 문제 고객명
		
		// 메소드 선언 
		// 메소드 이름 getName 매개변수 String name, 반환형 String
		// 메소드 기능 (name + "님") 붙여서 반환
		// 출력하고 싶은 이름을 저장할 변수 선언 name 초기화 ""
		// getName(name)의 반환값 저장할 변수 선언 result 초기화 ""
		// name값 원하는 이름으로 변경 
		// result에 getName(변경한 이름) 다시 저장
		// result 결과를 출력
		// name값 원하는 이름으로 변경 
		// result에 getName(변경한 이름) 다시 저장
		// result 결과를 출력
		
		String name = "";
		String result = "";
		
		name = "홍길동";
		result = getName(name);
		System.out.printf("고객: %s\n", result);
		
		name = "아무개";
		result = getName(name);
		System.out.printf("고객: %s\n", result);
		
	}
	
	// getName 메소드 선언
	public static String getName(String name) {
		return name+"님";
	}
	
}
