import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Conditional_Q10 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.conditional > "Q10.java"

		// 10번 문제 날짜 계산

		// 객체 생성
		// bf, import, 예외처리 Exception
		// Calendar, import
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Calendar now = Calendar.getInstance();

		// 변수 생성
		// 연월일 int(year, month, day)
		// 평일인가 휴일인가 String(weekday_holiday)
		// 평일 int(weekday)
		// 토요일 int(weekdayEnd)
		// 휴일 int(holiday)
		int year = 0, month = 0, day = 0;
		String weekday_holiday = "";
		int weekday = 0;
		int weekdayEnd = 7;
		int holiday = 1;

		// 입력표시
		// 년(월/일) : 'year/month/day'
		System.out.print("년 : ");
		year = Integer.parseInt(reader.readLine());
		System.out.print("월 : ");
		month = Integer.parseInt(reader.readLine());
		System.out.print("일 : ");
		day = Integer.parseInt(reader.readLine());

		// set(year, month, day)
		// 요일 상수 : Calendar.DAY_OF_WEEK; // 1(일)~7(토)
		now.set(year, month - 1, day);
		weekday = now.get(Calendar.DAY_OF_WEEK);


		// if
		// 평일 출력표시
		// 입력하신 날짜는 '평일'입니다.
		// 해당 주의 토요일로 이동합니다.
		// 이동한 날짜는 '2022-03-19' 입니다.
		// 일요일 출력표시
		// 입력하신 날짜는 '휴일'입니다.
		// 결과가 없습니다.
		if (weekday > holiday) {

			weekday_holiday = "평일";
			System.out.printf("입력하신 날짜는 %s입니다.\n", weekday_holiday);
			System.out.println("해당 주의 토요일로 이동합니다.");

			// 토요일과 평일간의 차이 날짜 계산
			// 토-평일간 차이 더하기

			now.add(Calendar.DATE, weekdayEnd - weekday);
			year = now.get(Calendar.YEAR);
			month = now.get(Calendar.MONTH) + 1;
			day = now.get(Calendar.DATE);
			System.out.printf("이동한 날짜는 %d-%02d-%02d 입니다.\n", year, month, day);

		} else if (weekday == holiday) {

			weekday_holiday = "휴일";
			System.out.printf("입력하신 날짜는 %s입니다.\n", weekday_holiday);
			System.out.println("결과가 없습니다.");

		}

	}

}
