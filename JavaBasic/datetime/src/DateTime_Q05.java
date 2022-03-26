import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class DateTime_Q05 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.datetime > "Q05.java"

		// 5번 문제 아빠와 딸

		// 객체 생성
		// Calendar, import, getInstance
		// bf, import, 예외처리 Exception
		Calendar dadCal = Calendar.getInstance();
		Calendar daughterCal = Calendar.getInstance();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 변수 생성
		// 아빠와 딸의 연월일 int 변수 (총 6개 - dad(연월일), daughter(연월일))
		int dadYear = 0, dadMonth = 0, dadDay = 0;
		int daughterYear = 0, daughterMonth = 0, daughterDay = 0;
		// 입력 표시
		// 아빠 생일(년) :
		System.out.print("아빠 생일(년) : ");
		dadYear = Integer.parseInt(reader.readLine());
		// 아빠 생일(월) :
		System.out.print("아빠 생일(월) : ");
		dadMonth = Integer.parseInt(reader.readLine());
		// 아빠 생일(일) :
		System.out.print("아빠 생일(일) : ");
		dadDay = Integer.parseInt(reader.readLine());
		// 딸 생일(년) :
		System.out.print("딸 생일(년) : ");
		daughterYear = Integer.parseInt(reader.readLine());
		// 딸 생일(월) :
		System.out.print("딸 생일(월) : ");
		daughterMonth = Integer.parseInt(reader.readLine());
		// 딸 생일(일) :
		System.out.print("딸 생일(일) : ");
		daughterDay = Integer.parseInt(reader.readLine());

		// 아빠 - 딸 = date로 출력
		dadCal.set(dadYear, dadMonth - 1, dadDay);
		daughterCal.set(daughterYear, daughterMonth - 1, daughterDay);

		long dadTick = dadCal.getTimeInMillis();
		long daughterTick = daughterCal.getTimeInMillis();

		double totalDay = (daughterTick - dadTick) / 1000 / 60 / 60 / 24;
		// 출력 표시
		// 아빠는 딸보다 총 'totalDay'일을 더 살았습니다.
		System.out.printf("아빠는 딸보다 총 %.0f일을 더 살았습니다.", totalDay);

	}

}
