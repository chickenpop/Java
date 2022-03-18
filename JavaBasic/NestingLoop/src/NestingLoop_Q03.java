import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NestingLoop_Q03 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.iteration_while > "Q03.java"
		
		// 3번 문제 별찍기(피라미드)
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int star = 0;
		
		System.out.print("행: ");
		star = Integer.parseInt(reader.readLine());
		
		for(int i=0; i<star; i++) {
			
			for(int j=0; j<star-i-1; j++) {
				System.out.print(" ");
			}
			
			for(int k=0; k<2*(i+1)-1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		
	}

}



