import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NestingLoop_Q04 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.iteration_while > "Q04.java"
		
		// 4번 문제 영문자 찍기
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int star = 0;
		char alphabetStart = 'a';
		
		System.out.print("행: ");
		star = Integer.parseInt(reader.readLine());
		
		for(int i=0; i<star; i++) {
			
			for(int j=0; j<star-i-1; j++) {
				System.out.print(" ");
			}
			
			for(int k=0; k<=i; k++) {
				System.out.print((char)(alphabetStart+k));
			}
			
			for(int k=0; k<=i; k++) {
				System.out.print((char)(i+'a'-k));
			}
			
			System.out.println();
			
		}
		
	}

}
