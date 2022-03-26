import java.util.Calendar;

public class DateTime_Q01 {

	public static void main(String[] args) {

		// com.test.java.question.datetime > "Q01.java"

		// 1번 문제 현재 시간

		// 이름 : nowTime 접근지정자: public 반환형 : void 매개변수 : void
		// nowTime 기능 : 현재 시간을 24시간으로 출력, (오전/오후)12시간으로 출력
		// 출력 표시, 현재 시간 : 24H 10시 30분 25초
		// 출력 표시, 현재 시간 : 12H 오전 10시 30분 25초

		// 호출 nowTime()
		nowTime();

	}

	// 이름 : nowTime 접근지정자: public 반환형 : void 매개변수 : void
	// nowTime 기능 : 현재 시간을 24시간으로 출력, (오전/오후)12시간으로 출력
	// 출력 표시, 현재 시간 : 24H 10시 30분 25초
	// 출력 표시, 현재 시간 : 12H 오전 10시 30분 25초
	public static void nowTime() {

		Calendar now = Calendar.getInstance();

		String AM_PM = now.get(Calendar.AM_PM) == 0 ? "오전" : "오후";
		int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
		int hour = now.get(Calendar.HOUR);
		hour = (AM_PM.equals("오후")) && hour == 0 ? 12 : hour;
		int min = now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);


		System.out.printf("현재시간 : %d시 %d분 %d초\n", hourOfDay, min, sec);
		System.out.printf("현재시간 : %s %d시 %d분 %d초\n", AM_PM, hour, min, sec);

	}

}
