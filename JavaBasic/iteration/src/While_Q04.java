import java.io.BufferedReader;
import java.io.InputStreamReader;

public class While_Q04 {

	public static void main(String[] args) throws Exception{

		// com.test.java.question.iteration_while > "Q04.java"
		
		// 4번 문제 숫자 합 구하기
		
		// 조건
		// 최대 9자리 정수를 입력받아 각자리의 홀수 숫자합과 짝수 숫자합을 구하시오.
		// Math.pow() 메소드 사용(제곱값 구하는 메소드)
		
		// 객체, 변수
		// bf, 예외처리 Exception
		// 최대 9자리 정수 int(num)
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String in = "";
		int num = 0;
		int remainder = 0;
		int evenSum = 0, oddSum = 0;
		
		
		// 입력
		// 숫자 입력 : 273645281
		System.out.print("숫자 입력 : ");
		in = reader.readLine();
		num = Integer.parseInt(in);
		
		for(int i=0; i<in.length(); i++) {
			
			remainder = (int)(num % Math.pow(10, 1));
			num /= Math.pow(10, 1);
			
			if(isEven(remainder)) {
				evenSum += remainder;
			} else {
				oddSum += remainder;
			}
			
			
		}
		
		// 출력
		// 짝수의 합 : 22
		// 홀수의 합 : 16
		System.out.printf("짝수의 합 : %d\n", evenSum);
		System.out.printf("홀수의 합 : %d\n", oddSum);
		
		
	}
	
	public static boolean isEven(int number) {
		
		if(number % 2 == 0) return true;
		
		return false;
	}
	

}
