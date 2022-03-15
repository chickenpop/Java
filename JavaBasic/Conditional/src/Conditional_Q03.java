import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Conditional_Q03 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.conditional > "Q03.java"

		// 3번 문제 문자 조건 출력

		// 객체 생성
		// bf, import, 예외처리 Exception
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 변수 생성
		// 가족 구성원 String (family) - 대문자로 변환
		String familyUpper = "";

		// 입력 표시
		// 문자 : 'family'
		System.out.print("문자 : ");
		familyUpper = reader.readLine();
		familyUpper = familyUpper.toUpperCase();

		// if문
		// F, M, S, B의 아닌 문자는
		// 출력 표시
		// 입력한 문자가 올바르지 않습니다.
		// 그 이외 출력 표시
		// f, F = Father
		// m, M = Mother
		// s, S → Sister
		// b, B → Brother
		if (familyUpper.equals("F") || familyUpper.equals("M") || familyUpper.equals("S")
				|| familyUpper.equals("B")) {
			if (familyUpper.equals("F")) {
				System.out.println("Father");
			} else if (familyUpper.equals("M")) {
				System.out.println("Mother");
			} else if (familyUpper.equals("S")) {
				System.out.println("Sister");
			} else if (familyUpper.equals("B")) {
				System.out.println("Brother");
			}

		} else {
			System.out.println("입력한 문자가 올바르지 않습니다.");
		}


	}

}
