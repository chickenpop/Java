import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String_Q03 {

	public static void main(String[] args) throws Exception {
		
		// 3번 문제 수의 합
		
		// 객체, 변수 생성
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String word = "";
		int sum = 0;
		char sign = '+';
		
		// 입력
		System.out.print("숫자 : ");
		word = reader.readLine();
		
		int i = 0;
		// 데이터 추출
		while(i<word.length()) {
			
			if(i==word.length()-1) sign = '=';
			System.out.printf("%c %c ", word.charAt(i), sign);
			sum += word.charAt(i)-'0';
			i++;
			
		}
		System.out.println(sum);
		
	}
	
}
