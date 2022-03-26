import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String_Q01 {

	public static void main(String[] args) throws Exception {

		// 1번 문제 역순 출력
		
		// 객체, 변수 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String word = "";
		
		System.out.print("문장 입력 : ");
		word = reader.readLine();
		
		System.out.print("\"");
		for(int i=word.length()-1; i>=0; i--) {
			
			System.out.print(word.substring(i, i+1));
			
		}
		System.out.println("\"");
	}

}
