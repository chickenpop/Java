import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {
	public static void main(String[] args) throws Exception {
		
		// com.test.java.question.operator > "Q02.java"
		
		// 2번 문제 연산식 만들기
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자:");
		String in1 = reader.readLine();
		
		System.out.print("두번째 숫자:");
		String in2 = reader.readLine();
		
		int num1 = Integer.parseInt(in1);
		int num2 = Integer.parseInt(in2);
		
		System.out.printf("%,d + %,d = %,d\n", num1, num2, num1+num2);
		System.out.printf("%,d - % ,d = %,d\n", num1, num2, num1-num2);
		System.out.printf("%,d * %,d = %,d\n", num1, num2, (long)num1*num2);
		System.out.printf("%,d / %,d = %.1f\n", num1, num2, (double)num1/num2);
		System.out.printf("%,d %% %,d = %,d\n", num1, num2, num1%num2);
		
	}
}
