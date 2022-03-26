public class NestingLoop_Q05 {

	public static void main(String[] args) {

		// com.test.java.question.iteration_while > "Q05.java"
		
		// 5번 문제 구구단
		
		for(int i=0; i<2; i++) {
			
			for(int j=1; j<10; j++) {
				
				for(int k=2+(4*i);k<=5+(4*i);k++) {
					System.out.printf("%d x %d = %2d\t", k, j, k*j);
				}
				System.out.println();
			}
			System.out.println();
			
		}
		
	}

}
