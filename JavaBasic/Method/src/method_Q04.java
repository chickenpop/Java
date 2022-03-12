import java.io.BufferedReader;
import java.io.InputStreamReader;

public class method_Q04 {

	public static void main(String[] args) throws Exception {
		
		// com.test.java.question.method > "Q04.java"
		
		// 4번 문제 연산식
		
		// 메소드 선언
		// 메소드 공통 : n1 연산자 n2 = 결과 형태로 반환
		// 이름 : add, 		반환형 : String, 매개변수 : int - 2개
		// add 기능 : int형 값 두개를 더한 과정을 String으로 반환 
		// 이름 : subtract, 	반환형 : String, 매개변수 : int - 2개
		// subtract 기능 : int형 값 두개를 뺀 과정을 String으로 반환
		// 이름 : multiply, 	반환형 : String, 매개변수 : int - 2개
		// multiply 기능 : int형 값 두개를 곱한 과정을 String으로 반환
		// 이름 : divide, 	반환형 : String, 매개변수 : int - 2개
		// divide 기능 : int형 값 두개를 나눈 몫을 구하는 과정을 String으로 반환
		// 이름 : mod, 		반환형 : String, 매개변수 : int - 2개
		// mod 기능 : int형 값 두개를 나눈 나머지를 구하는 과정을 String으로 반환
		
		// 입력을 위한 BufferedReader 객체 생성, import문, 예외처리 작성 - throws Exception
		// 숫자 두개를 저장할 int 변수 선언, n1, n2
		// 메소드 결과를 저장할 String 변수 선언 result
		// 입력을 받아야하는 곳 표시, n번째 숫자 : 
		// int변수 n1, n2 각각 입력 숫자 저장, String을 int로 바로 반환
		// result는 메소드에 n1, n2를 넣은 결과값을 저장
		// result 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n1 = 0, n2 = 0;
		String result = "";
		
		// 입력
		System.out.print("첫번째 숫자 : ");
		n1 = Integer.parseInt(reader.readLine());
		
		System.out.print("두번째 숫자 : ");
		n2 = Integer.parseInt(reader.readLine());
		
		// 메소드값 반환
		// 메소드값을 반환받은 result 출력
		result = add(n1, n2);
		System.out.println(result);
		
		result = subtract(n1, n2);
		System.out.println(result);
		
		result = multiply(n1, n2);
		System.out.println(result);
		
		result = divide(n1, n2);
		System.out.println(result);
		
		result = mod(n1, n2);
		System.out.println(result);
		
		
		
	}
	// 메소드 선언
	// 메소드 공통 : n1 연산자 n2 = 결과 형태로 반환
	
	// 이름 : add, 		반환형 : String, 매개변수 : int - 2개
	// add 기능 : int형 값 두개를 더한 과정을 String으로 반환 
	public static String add(int n1, int n2) {
		
		return n1 + " + " + n2 + " = " + (n1 + n2);
		
	}
	
	// 이름 : subtract, 	반환형 : String, 매개변수 : int - 2개
	// subtract 기능 : int형 값 두개를 뺀 과정을 String으로 반환
	
	public static String subtract(int n1, int n2) {
		
		return n1 + " - " + n2 + " = " + (n1 - n2);
		
	}
	// 이름 : multiply, 	반환형 : String, 매개변수 : int - 2개
	// multiply 기능 : int형 값 두개를 곱한 과정을 String으로 반환
	
	public static String multiply(int n1, int n2) {
		
		return n1 + " * " + n2 + " = " + (long)(n1 * n2);
		
	}
	// 이름 : divide, 	반환형 : String, 매개변수 : int - 2개
	// divide 기능 : int형 값 두개를 나눈 몫을 구하는 과정을 String으로 반환
	// 소수점은 1번째 자리까지
	
	public static String divide(int n1, int n2) {
		
		return n1 + " / " + n2 + " = " + (double)n1/n2;
		
	}
	// 이름 : mod, 		반환형 : String, 매개변수 : int - 2개
	// mod 기능 : int형 값 두개를 나눈 나머지를 구하는 과정을 String으로 반환
	public static String mod(int n1, int n2) {
		
		return n1 + " % " + n2 + " = " + (n1 % n2);
		
	}
	
	
}
