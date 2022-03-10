import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {
	public static void main(String[] args) throws Exception {
		
		// com.test.java.question.operator > "Q01.java"
		
		// 1번 문제 나이 구하기
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int year = 2022;
		
		System.out.print("태어난 년도 : ");

		String ageIn = reader.readLine();
		
		int age = year - Integer.parseInt(ageIn) + 1;
		
		System.out.printf("나이 : %d세", age);
		
	}
}
