import java.io.BufferedReader;
import java.io.InputStreamReader;

public class While_Q01 {

	public static void main(String[] args) throws Exception {
	
		// com.test.java.question.iteration_while > "Q01.java"
		
		// 1번 문제 숫자 합 구하기
		
		// 누적값이 100을 넘어가면 루프 종료
		// 짝수는 더하고 홀수는 빼기
		
		// bf, 예외처리 Exception
		// 숫자 입력 int(num)
		// 누적값 int(Sum)
		// 출력할 String(result)
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		int sum = 0;
		String result = "";
		
		// 입력(while)
		// 숫자 :
		
		while(sum<100) {
			
			System.out.print("숫자 : ");
			num = Integer.parseInt(reader.readLine());
				
			if(isEven(num)) {
				sum += num;
				result += evenPlus(num);
			} else {
				sum -= num;
				result += oddMinus(num);
			}
			
		}
		// 출력
		// 12 + 28 - 39 - 15 + 38 + 24 + 78 = 126
		System.out.printf("\b\b\b%s = %d\n", result, sum);
		
			
	} // main
	
	public static String evenPlus(int number) {
		
		return " + " + String.valueOf(number);
		
	}
	
	public static String oddMinus(int number) {
		
		return " - " + String.valueOf(number);
		
	}
	
	public static boolean isEven(int num) {
		
		if(num % 2 == 0)  return true;
		
		return false;

	}
	
}// clase
