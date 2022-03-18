public class NestingLoop_Q07 {

	public static void main(String[] args) {
		
		// com.test.java.question.iteration_while > "Q07.java"
		
		// 7번 문제 완전수
		
		for(int i=1; i<=100; i++) {
			String result = " = [";
			int sum = 0;
			for(int j=1; j<i; j++) {
				
				if(i%j == 0) {
					result += j + ",";
					sum += j;
				}
				
			}
			if(sum == i) {
				System.out.print(i);
				System.out.println(result+"\b]");
			}
			
		}
		
	} // main


}
