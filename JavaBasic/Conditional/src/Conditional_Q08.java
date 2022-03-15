import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Conditional_Q08 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.conditional > "Q08.java"

		// 8번 문제 주차 요금

		// 객체 생성
		// bf, import, 예외처리 Exception
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 변수 생성
		// 시, 분 계산용 int(hour, min)
		// 들어온 시간 int(entryHour, entryMin)
		// 나간 시간 int(parkingHour, parkingMin)
		// 무료 주차 시간 int(freeParkingTime)
		// 주차 요금 int(parkingFee)
		// 10분당 요금 int(Surcharge)
		int hour = 0, min = 0;
		int entryHour = 0, entryMin = 0;
		int parkingHour = 0, parkingMin = 0;
		int freeParkingTime = 30;
		int parkingFee = 0;
		int Surcharge = 2000;


		// 입력 표시
		// [들어온 시간/나간 시간]
		// 시(분) :
		System.out.println("[들어온 시간]");
		System.out.print("시 : ");
		entryHour = Integer.parseInt(reader.readLine());
		System.out.print("분 : ");
		entryMin = Integer.parseInt(reader.readLine());
		System.out.println("[나간 시간]");
		System.out.print("시 : ");
		parkingHour = Integer.parseInt(reader.readLine());
		System.out.print("분 : ");
		parkingMin = Integer.parseInt(reader.readLine());

		hour = parkingHour - entryHour;
		min = parkingMin - entryMin;

		// if(요금 계산)
		// 무료 주차 : 30분
		// 초과 10분당 : 2,000원
		// 출력
		// 주차 요금은 'parkingFee'원입니다.
		if (min < 0) {
			min += 60;
			hour -= 1;

			parkingFee = ((min + hour * 60) - freeParkingTime) / 10 * Surcharge;
			System.out.printf("주차 요금은 %,d원입니다.\n", parkingFee);

		} else {

			parkingFee = ((min + hour * 60) - freeParkingTime) / 10 * Surcharge;
			System.out.printf("주차 요금은 %,d원입니다.\n", parkingFee);

		}


	}

}
