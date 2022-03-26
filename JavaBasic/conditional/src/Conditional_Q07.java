import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Conditional_Q07 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.conditional > "Q07.java"

		// 7번 문제 짝수 홀수

		// 객체 생성
		// bf, import, 예외처리 Exception
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 변수 생성
		// 숫자 int(num)
		// 짝수갯수 int(evenCnt)
		// 홀수갯수 int(oddCnt)
		// 짝수/홀수 구분 String(even_odd)
		int num = 0;
		int evenCnt = 0;
		int oddCnt = 0;

		// 입력표시 x 5개의 정수 입력(1~10)사이
		// 숫자 입력 :
		System.out.print("숫자 입력 : ");
		num = Integer.parseInt(reader.readLine());
		if (num >= 1 && num <= 10) {
			evenCnt += num % 2 == 0 ? 1 : 0;
			oddCnt += num % 2 == 1 ? 1 : 0;
		}
		System.out.print("숫자 입력 : ");
		num = Integer.parseInt(reader.readLine());
		if (num >= 1 && num <= 10) {
			evenCnt += num % 2 == 0 ? 1 : 0;
			oddCnt += num % 2 == 1 ? 1 : 0;
		}
		System.out.print("숫자 입력 : ");
		num = Integer.parseInt(reader.readLine());
		if (num >= 1 && num <= 10) {
			evenCnt += num % 2 == 0 ? 1 : 0;
			oddCnt += num % 2 == 1 ? 1 : 0;
		}
		System.out.print("숫자 입력 : ");
		num = Integer.parseInt(reader.readLine());
		if (num >= 1 && num <= 10) {
			evenCnt += num % 2 == 0 ? 1 : 0;
			oddCnt += num % 2 == 1 ? 1 : 0;
		}
		System.out.print("숫자 입력 : ");
		num = Integer.parseInt(reader.readLine());
		if (num >= 1 && num <= 10) {
			evenCnt += num % 2 == 0 ? 1 : 0;
			oddCnt += num % 2 == 1 ? 1 : 0;
		}


		// if
		// 출력 표시
		// 짝수는 n개 홀수는 5-n개 입력했습니다.
		// 짝수/홀수가 홀수/짝수보다 m개 더 많습니다.

		if (evenCnt + oddCnt == 5) {
			if (evenCnt > oddCnt) {
				System.out.printf("짝수가 %d개 홀수는 %d개 입력했습니다.\n", evenCnt, oddCnt);
				System.out.printf("짝수가 홀수보다 %d개 더 많습니다.\n", evenCnt - oddCnt);
			} else if (evenCnt < oddCnt) {
				System.out.printf("짝수가 %d개 홀수는 %d개 입력했습니다.\n", evenCnt, oddCnt);
				System.out.printf("홀수가 짝수보다 %d개 더 많습니다.\n", oddCnt - evenCnt);
			}
		} else {
			System.out.println("정수 입력 시 1~10이외에 값을 입력하셨습니다.");
		}


	}



}
