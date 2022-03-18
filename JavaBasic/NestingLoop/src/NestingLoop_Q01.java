import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NestingLoop_Q01 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.iteration_while > "Q01.java"
		
		// 1번 문제 별찍기
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int star = 0;
	
		// 입력 행: 5
		System.out.print("행: ");
		star = Integer.parseInt(reader.readLine());
		
		for(int i=0; i<star; i++) {
			
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			
			for(int j=i; j<star; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		
	}

}
