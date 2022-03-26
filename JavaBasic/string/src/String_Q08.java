import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String_Q08 {

	public static void main(String[] args) throws Exception {

		// 8번 문제 합성어 
		
		// 객체, 변수
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String word = "";
		
		// 입력
		System.out.print("단어 : ");
		word = reader.readLine();
		StringBuilder words = new StringBuilder("");
		
		for(int i=0; i<word.length(); i++) {
			
			if(i!=0) {
				if(word.charAt(i)>='A' && word.charAt(i)<='Z') {
					words.append(" ");
				}
			}
			
			words.append(word.charAt(i));
			
		}
		
		// 출력
		System.out.printf("결과 : %s\n", words);
	}

}
