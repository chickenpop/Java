import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Conditional_Q05 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.conditional > "Q05.java"

		// 5번 문제 연산식

		// 객체 생성
		// bf, import, 예외처리 Exception
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 변수 생성
		// 연산할 두 정수 int(num1, num2)
		// 산술 연산자 String(operator)
		int num1 = 0, num2 = 0;
		String operator = "";

		// 입력표시
		// 첫번째 숫자 : 'num1'
		// 두번째 숫자 : 'num2'
		// 연산자 : 'operator'
		System.out.print("첫번째 숫자 : ");
		num1 = Integer.parseInt(reader.readLine());
		System.out.print("두번째 숫자 : ");
		num2 = Integer.parseInt(reader.readLine());
		System.out.print("연산자 : ");
		operator = reader.readLine();

		// if
		// 유효성 연산자는 산술 연산자(+, -, *, /, %)만 입력하시오.
		// 유효성 외 출력 표시, 연산이 불가능합니다.
		// 출력 표시
		// 나머지 연산 결과는 소수 이하 첫째 자리까지
		// 'num1' 'operator' 'num2' = num1 operator num2

		if (operator.equals("+") || operator.equals("-") || operator.equals("*")
				|| operator.equals("/") || operator.equals("%")) {

			if (operator.equals("+")) {
				System.out.printf("%d %s %d = %d\n", num1, operator, num2, num1 + num2);
			} else if (operator.equals("-")) {
				System.out.printf("%d %s %d = %d\n", num1, operator, num2, num1 - num2);
			} else if (operator.equals("*")) {
				System.out.printf("%d %s %d = %d\n", num1, operator, num2, num1 * num2);
			} else if (operator.equals("/")) {
				System.out.printf("%d %s %d = %.1f\n", num1, operator, num2, (double) num1 / num2);
			} else if (operator.equals("%")) {
				System.out.printf("%d %s %d = %d\n", num1, operator, num2, num1 % num2);
			}

		} else {
			System.out.println("연산이 불가능합니다.");
		}

	}

}
