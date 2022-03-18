import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NestingLoop_Q02 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.iteration_while > "Q02.java"
		
		// 2번 문제 별찍기
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int star = 0;
	
		// 입력 행: 5
		System.out.print("행: ");
		star = Integer.parseInt(reader.readLine());
		
		for(int i=0; i<star; i++) {
			
			for(int k=0; k<star-i-1; k++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
	}

}
