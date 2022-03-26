import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Conditional_Q04 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.conditional > "Q04.java"

		// 4번 문제 개발자 경력

		// 객체 생성
		// bf, import, 예외처리
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 변수 생성
		// 개발자 연차 int(career)
		// 개발자 레벨 String(level)
		// 개발자 레벨 연수 int(beginner, middleClassFront, middleClassBack, advanced)
		// 1 ~ 4년차 : 초급 개발자
		// 5 ~ 9년차 : 중급 개발자
		// 10년차 이상 : 고급 개발자
		int career = 0;
		String level = "";
		int beginner = 4;
		int middleClassFrontYear = 5;
		int middleClassBackYear = 9;
		int advanced = 10;

		// 입력 표시
		// 근무 년수 : 'career'
		System.out.print("근무 년수 : ");
		career = Integer.parseInt(reader.readLine());

		// if 조건
		// 유효성 검사를 하시오.(1 미만 입력 예외 처리)
		if (career >= 1) {

			// 출력표시
			// 공통 'career'년차 'level' 개발자 입니다.
			// 초급, 앞으로 n년 더 근무를 하면 중급 개발자가 됩니다.
			// 중급, 당신은 n년전까지 초급 개발자였습니다.
			// 중급, 앞으로 n년 더 근무를 하면 고급 개발자가 됩니다.
			// 고급, 당신은 2년전까지 중급 개발자였습니다.
			// 당신은 '5-career'
			// 유효성 출력
			// 입력한 값이 올바르지 않습니다. 1이상의 값을 입력하시오.
			if (career <= beginner) {
				level = "초급";
				System.out.printf("%d년차 %s개발자입니다.\n", career, level);
				System.out.printf("앞으로 %d년 더 근무를 하면 중급 개발자가 됩니다.\n", middleClassFrontYear - career);
			} else if (career <= middleClassBackYear) {
				level = "중급";
				System.out.printf("%d년차 %s개발자입니다.\n", career, level);
				level = "초급";
				System.out.printf("당신은 %d년전까지 초급 개발자였습니다.\n", career - beginner, level);
				System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.\n", advanced - career);
			} else if (career >= advanced) {
				level = "고급";
				System.out.printf("%d년차 %s개발자입니다.\n", career, level);
				level = "중급";
				System.out.printf("당신은 %d년전까지 %s 개발자였습니다.\n", career - middleClassBackYear, level);
			}

		} else {
			System.out.println("입력한 값이 올바르지 않습니다. 1이상의 값을 입력하시오.\n");
		}

	}

}
