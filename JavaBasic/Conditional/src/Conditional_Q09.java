import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Conditional_Q09 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.conditional > "Q09.java"

		// 9번 문제 윤년 검사

		// 객체 생성
		// bf, import, 예외처리 : Exception
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 변수 생성
		// 입력받은 연도 int(inputYear)
		// 출력할 연도가 평년인지 윤년인지 String(leapOrCommonYear)
		int inputYear = 0;
		String leapOrCommonYear = "";


		// 입력 표시
		// 년도 입력 : 'inputYear'
		System.out.print("년도 입력 : ");
		inputYear = Integer.parseInt(reader.readLine());

		// if
		// a. 년도를 4로 나눈다.
		// 떨어지면 b 검사
		// 떨어지지 않으면 "평년"
		// b. 년도를 100으로 나눈다.
		// 떨어지면 c 검사
		// 떨어지지 않으면 "윤년"
		// c. 년도를 400으로 나눈다.
		// 떨어지면 "윤년"
		// 떨어지지 않으면 "평년"
		// 출력표시
		// 'inputYear'년은 'leapOrCommonYear'입니다.
		if (inputYear % 4 != 0) {
			leapOrCommonYear = "평년";
			System.out.printf("%d년은 %s입니다.\n", inputYear, leapOrCommonYear);
		} else if (inputYear % 100 != 0) {
			leapOrCommonYear = "윤년";
			System.out.printf("%d년은 %s입니다.\n", inputYear, leapOrCommonYear);
		} else if (inputYear % 400 != 0) {
			leapOrCommonYear = "평년";
			System.out.printf("%d년은 %s입니다.\n", inputYear, leapOrCommonYear);
		} else {
			leapOrCommonYear = "윤년";
			System.out.printf("%d년은 %s입니다.\n", inputYear, leapOrCommonYear);
		}


	}

}
