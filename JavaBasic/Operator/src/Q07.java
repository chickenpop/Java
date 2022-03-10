import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {
	public static void main(String[] args) throws Exception {
		
		// com.test.java.question.operator > "Q07.java"
		
		// 7번 문제 대소문자 변환
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자 입력 : ");
		String alphabetInput = reader.readLine();
		
		char alphabet = alphabetInput.charAt(0);
		int alphabetUpper = (int)alphabet-32;
		
		System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다.", alphabet, (char)alphabetUpper);
		
	}
}
