import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String_Q02 {

	public static void main(String[] args) throws Exception {

		// 2번 문제 이메일
		
		// 객체, 변수 생성
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String email = "";
		int atIndex = -1;
		
		System.out.print("이메일 : ");
		email = reader.readLine();
		
		atIndex = email.indexOf("@");
		
		System.out.printf("아이디 : %s\n", email.substring(0, atIndex));
		System.out.printf("도메인 : %s\n", email.substring(atIndex+1, email.length()));
				
		
	}

}
