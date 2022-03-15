import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Conditional_Q06 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.conditional > "Q06.java"

		// 6번 문제 대소문자 변환

		// 객체 생성
		// bf, import, 예외처리 Exception
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 변수 생성
		// 문자 입력 char(alphabet)
		// 문자 대소문자 변환할 int(alphabetUpper, alphabetLower)
		String alphabet = "";
		int alphabetUpper = ' ';
		int alphabetLower = ' ';

		// 입력 표시
		// 문자 : 'alphabet'
		System.out.print("문자 : ");
		alphabet = reader.readLine();

		// if
		// 유효성(영문자만 입력 가능)
		// 그 외 출력표시, 영문자만 입력하시오.
		// 알파벳 대소문자 구별
		// 출력 표시
		// 'alphabetUpper/alphabetLower'의 대/소문자는 'alphabetLower/alphabetUpper'입니다.
		if (alphabet.charAt(0) >= 65 && alphabet.charAt(0) <= 90) {
			alphabetUpper = alphabet.charAt(0);
			alphabetLower = alphabet.charAt(0) + 32;
			System.out.printf("%c의 소문자는 %c입니다.\n", alphabetUpper, alphabetLower);
		} else if (alphabet.charAt(0) >= 97 && alphabet.charAt(0) <= 122) {
			alphabetUpper = alphabet.charAt(0) - 32;
			alphabetLower = alphabet.charAt(0);
			System.out.printf("%c의 대문자는 %c입니다.\n", alphabetLower, alphabetUpper);
		} else {
			System.out.println("영문자만 입력하시오.");
		}

	}

}
