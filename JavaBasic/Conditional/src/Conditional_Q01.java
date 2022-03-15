import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Conditional_Q01 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.conditional > "Q01.java"

		// 1번 문제 숫자 비교

		// 객체 생성
		// bf, import, 예외처리 Exception
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 변수 생성
		// 큰수 int maxNum
		// 작은수 int minNum
		int num1 = 0, num2 = 0;
		int maxNum = 0, minNum = 0;

		// 입력 표시, if에서 max, min 판별
		// 첫번째 숫자 : 'maxNum'
		// 두번째 숫자 : 'minNum'
		System.out.print("첫번째 숫자 : ");
		num1 = Integer.parseInt(reader.readLine());
		System.out.print("두번째 숫자 : ");
		num2 = Integer.parseInt(reader.readLine());


		// if문에서 큰수, 작은 수를 판별해서 차이를 표시 또는 동일한 경우 표시
		// 출력 표시
		// 차이나는 경우,
		// 큰수는 'Maxnum'이고, 작은수는 'minNum'입니다. 두 숫자는 'maxNum-minNum'(가)이 차이납니다.
		// 동일한 경우,
		// 두 숫자는 동일합니다.

		maxNum = num1 > num2 ? num1 : num2;
		minNum = num1 < num2 ? num1 : num2;

		if (maxNum > minNum) {
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.", maxNum, minNum,
					maxNum - minNum);
		} else {
			System.out.println("두 숫자는 동일합니다.");
		}


	}

}
