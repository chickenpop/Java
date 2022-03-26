public class method_Q03 {

	public static void main(String[] args) {
		
		// com.test.java.question.method > "Q03.java"
		
		// 3번 문제 자릿수
		
		// 메소드 선언
		// 메소드 이름 : digit, 반환형 : void, 매개변수 : int - 1개
		// 메소드 기능 입력한 숫자가 4자리 자릿수에 빈공간 0으로 채우거나 4자리 이상이면 그대로 출력한다.
		// 숫자를 저장할 변수 num을 선언한다
		// num에 출력하고 싶은 값을 넣는다
		// 메소드에 num을 넣어 출력한다 
		
		int num = 0;
		
		num = 1;
		digit(1);
		
		num = 12;
		digit(num);
		
		num = 321;
		digit(num);
		
		num = 5678;
		digit(num);
		
		num = 98765;
		digit(num);
		
	}
	
	public static void digit(int num) {
		
		System.out.printf("%d -> %04d\n", num, num);
		
	}
	
}
