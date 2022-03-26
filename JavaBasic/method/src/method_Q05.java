import java.io.BufferedReader;
import java.io.InputStreamReader;

public class method_Q05 {

	public static void main(String[] args) throws Exception {
		
		// com.test.java.question.method > "Q05.java"
		
		// 5번 문제 짝수홀수
		
		// 메소드 선언
		// 이름 : getNumber, 반환형 : String, 매개변수 : int - 1개
		// getNumber 기능 : 숫자를 전달하면 '짝수' 혹은 '홀수'라는 단어 반환 
		
		// 입력을 위한 BufferedReader(bf) 객체 생성, import문, 예외처리 작성 - throws Exception
		// 숫자를 입력 받기 위한 int 변수 선언 - num 
		// getNumber 메소드 결과를 저장하기 위한 String 변수 선언 - result
		// 입력받아야할 곳 표시, '숫자:' num <- bf로 숫자 입력받고 바로 형변환
		// getNumber(num)의 결과를 result 반환받음 
		// result 결과 출력, 입력하신 숫자 'num'는(은) 'result'입니다.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		String result = "";
		
		System.out.print("숫자 : ");
		num  = Integer.parseInt(reader.readLine());
		
		result = getNumber(num);
		System.out.printf("입력하신 숫자 \'%d\'는(은) \'%s\'입니다.\n", num, result);
		
	}
	// 메소드 선언
	// 이름 : getNumber, 반환형 : String, 매개변수 : int - 1개
	// getNumber 기능 : 숫자를 전달하면 '짝수' 혹은 '홀수'라는 단어 반환
	public static String getNumber(int num) {
		return num % 2 == 0 ? "짝수" : "홀수";
	}
	
}
