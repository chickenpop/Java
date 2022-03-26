import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class DateTime_Q03 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.datetime > "Q03.java"

		// 3번 문제 나이 구하기

		// Calendar 객체 생성, import
		// bf 객체 생성, imoprt, 예외 처리 Exception
		Calendar now = Calendar.getInstance();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 입력 표시, 태어난 년도 :
		// 태어난 년도 int 변수 (birthYear)
		// 나이 int 변수(age)
		System.out.print("태어난 년도 : ");
		int birthYear = Integer.parseInt(reader.readLine());
		int age = 0;

		// 현재 - 태어난 연도 = 나이
		age = now.get(Calendar.YEAR) - birthYear + 1;

		// 출력 표시, 나이 : 'age'세
		System.out.printf("나이 : %d세\n", age);

	}

}
