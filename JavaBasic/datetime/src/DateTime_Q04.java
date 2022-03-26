import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class DateTime_Q04 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.datetime > "Q04.java"

		// 4번 문제 커플 기념일

		// 객체 생성
		// Calendar, import, 현재 시각
		// bf, import, 예외처리 Exception
		Calendar now = Calendar.getInstance();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 변수 생성
		// 남녀 이름 String (manName, womanName)
		// 연, 월, 일 int (year, month, day)
		String manName = "";
		String womanName = "";
		int year = 0;
		int month = 0;
		int day = 0;

		// 입력 표시
		// 남자 이름 :
		System.out.print("남자 이름 : ");
		manName = reader.readLine();
		// 여자 이름 :
		System.out.print("여자 이름 : ");
		womanName = reader.readLine();
		// 만난날(년) :
		System.out.print("만난날(년) : ");
		year = Integer.parseInt(reader.readLine());
		// 만난날(월) :
		System.out.print("만난날(월) : ");
		month = Integer.parseInt(reader.readLine());
		// 만난날(일) :
		System.out.print("만난날(일) : ");
		day = Integer.parseInt(reader.readLine());


		// 출력 표시
		// '남자이름'과(와) '여자이름'의 기념일
		System.out.printf("%s과(와) %s의 기념일\n", manName, womanName);

		// 100일 : yyyy-mm-dd
		now.set(year, month - 1, day);
		now.add(Calendar.DATE, 100);
		System.out.printf("100일 : %tF\n", now);

		// 200일 : yyyy-mm-dd
		now.set(year, month - 1, day);
		now.add(Calendar.DATE, 200);
		System.out.printf("200일 : %tF\n", now);

		// 300일 : yyyy-mm-dd
		now.set(year, month - 1, day);
		now.add(Calendar.DATE, 300);
		System.out.printf("300일 : %tF\n", now);

		// 500일 : yyyy-mm-dd
		now.set(year, month - 1, day);
		now.add(Calendar.DATE, 500);
		System.out.printf("500일 : %tF\n", now);

		// 1000일 : yyyy-mm-dd
		now.set(year, month - 1, day);
		now.add(Calendar.DATE, 1000);
		System.out.printf("1000일 : %tF\n", now);

	}

}
