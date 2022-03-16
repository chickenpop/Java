import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DateTime_Q06 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.datetime > "Q06.java"

		// 6번 문제 배달 주문 전화

		// 객체 생성
		// bf, import, 예외처리 Exception
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 변수
		// 시간, 분 int 변수 (hour, min)
		// 짜장면, 치킨, 피자 시간 int 변수 (JajangmyeonTime, chickenTime, pizzaTime) - 10, 18, 25
		// 마감 시간 int 변수(endHour) - 23시
		int hour = 0, min = 0;
		int JajangmyeonTime = 10;
		int chickenTime = 18;
		int pizzaTime = 25;
		int endHour = 23;

		// 입력 표시
		// 음식을 받기 원하는 시각
		// 시 : 'hour', endHour 이상이면 주문을 받을 수 없음
		// 23시 이후 입력하면 -1시로 출력됨
		System.out.println("음식을 받기 원하는 시각");
		System.out.print("시 : ");
		hour = Integer.parseInt(reader.readLine());
		hour = hour < endHour ? hour : -1;
		// 분 : 'min'
		System.out.print("분 : ");
		min = Integer.parseInt(reader.readLine());

		// 출력
		// 짜장면(치킨, 피자) : 'hour'시 'min'분
		hour(hour, min, JajangmyeonTime, "짜장면");

		// 치킨 : 'hour'시 'min'분
		hour(hour, min, chickenTime, "치킨");

		// 피자 : 'hour'시 'min'분
		hour(hour, min, pizzaTime, "피자");


	}
	
	public static void hour(int hour, int min, int MenuTime, String menu) {
		min -= MenuTime;
		hour = hour == 23 ? -1 : hour;
		hour = min < 0 ? hour - 1 : hour;
		min = min < 0 ? min + 60 : min;
		System.out.printf("%s : %d시 %d분\n", menu, hour, min);
	}

}
