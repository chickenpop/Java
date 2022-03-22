import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String_Q07 {

	public static void main(String[] args) throws Exception {

		// 7번 문제 자릿수
		
		// 객체, 변수 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String num = "";
		
		System.out.print("숫자 : ");
		num = reader.readLine();
		StringBuilder number = new StringBuilder(num);
		
		int cnt = number.length()/4;
		while(cnt>0) {
			
			number.insert((number.length()-(3*cnt)), ",");
			cnt--;
			
		}
		
		System.out.printf("결과 : %s\n", number);
	}

}
