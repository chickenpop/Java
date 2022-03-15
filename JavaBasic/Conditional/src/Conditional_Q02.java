import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Conditional_Q02 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.conditional > "Q02.java"

		// 2번 문제 성적처리

		// 객체 생성
		// bf, import, 예외처리 Exception
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 변수 생성
		// 점수 int 변수 (score) 100, 80..
		// 점수 String 변수(grade) A, B, C..
		int score = 0;
		String grade = "";

		// 입력 표시
		// 점수 : 'score'
		System.out.print("점수 : ");
		score = Integer.parseInt(reader.readLine());

		// if
		// 0~100 데이터 유효성 이외 값이라면
		// 출력 표시
		// 점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.
		// 90 ~ 100 : A, 80 ~ 89 : B..0 ~ 59 : F
		// 출력 표시
		// 입력한 'score'점은 성적'grade'입니다.
		if (score >= 0 && score <= 100) {

			if (score >= 90) {
				grade = "A";
				System.out.printf("입력한 %d점은 성적%s입니다.\n", score, grade);
			} else if (score >= 80) {
				grade = "B";
				System.out.printf("입력한 %d점은 성적%s입니다.\n", score, grade);
			} else if (score >= 70) {
				grade = "C";
				System.out.printf("입력한 %d점은 성적%s입니다.\n", score, grade);
			} else if (score >= 60) {
				grade = "D";
				System.out.printf("입력한 %d점은 성적%s입니다.\n", score, grade);
			} else {
				grade = "F";
				System.out.printf("입력한 %d점은 성적%s입니다.\n", score, grade);
			}

		} else {

			System.out.println("점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.");

		}

	}

}
