import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NestingLoop_Q08 {

	public static void main(String[] args) throws Exception {
		
		// com.test.java.question.iteration_while > "Q08.java"
		
		// 8번 문제 공약수
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num1 = 0, num2 = 0;
		String result = "";
		// 입력
		// 첫번째 숫자: 12 
		// 두번째 숫자: 8 
		System.out.print("첫번째 숫자: ");
		num1 = Integer.parseInt(reader.readLine());
		System.out.print("두번째 숫자: ");
		num2 = Integer.parseInt(reader.readLine());
		
		// 출력
		// 12의 약수: 1, 2, 3, 4, 6, 12
		// 8의 약수: 1, 2, 4, 8
		// 12와 8의 공약수: 1, 2, 4
		System.out.printf("%d의 약수: ", num1); 
		result = divisor(num1, result);
		System.out.println(result);
		
		result = "";
		System.out.printf("%d의 약수: ", num2); 
		result = divisor(num2, result);
		System.out.println(result);
		
		result = "";
		System.out.printf("%d와 %d의 공약수: ", num1, num2);
		result = divisor(gcd(num1, num2), result);
		System.out.println(result);
		
		
	}

	private static String divisor(int num, String result) {
		for(int i=1; i<=num; i++) {
			if(i==num) {
				result += num;
				break;
			}
			if(num%i == 0) {
				result += i + ", ";
			}
		}
		return result;
	}
	
	public static int gcd(int x, int y) {
		while(y!=0){
			int temp = x%y;
			x = y;
			y = temp;
		}
		return x;
	}
	
}
