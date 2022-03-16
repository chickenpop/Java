import java.util.Calendar;

public class DateTime_Q02 {

	public static void main(String[] args) {

		// com.test.java.question.datetime > "Q02.java"

		// 2번 문제 백일과 첫돌

		// Calendar 객체 생성, import, 현재 시각 입력
		Calendar now = Calendar.getInstance();

		// 객체명.add(date, 100)
		// 출력 표시, 백일 : yyyy-mm-dd
		now.add(Calendar.DATE, 100);
		System.out.printf("백일 : %tF \n", now);

		// 현재 시각 재입력
		now = Calendar.getInstance();
		// 객체명.add(year, 1)
		// 출력 표시, 첫돌 : yyyy-mm-dd
		now.add(Calendar.YEAR, 1);
		System.out.printf("첫돌 : %tF \n", now);


	}

}
