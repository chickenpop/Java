public class NestingLoop_Q06 {

	public static void main(String[] args) {

		// com.test.java.question.iteration_while > "Q06.java"
		
		// 6번 문제 소수
		// 2~100 사이의 소수
		
		for(int i=2; i<100; i++) {
			
			if(isPrime(i)) { // isPrime for문
				System.out.printf("%d, ",i);
				
			}			
		}
		System.out.print("\b\b");
		
	}
	
	public static boolean isPrime(int num) {
		
		if(num == 2) {
			return true;
		} else {
			for(int i=2; i<= Math.sqrt(num);i++) {
				if(num%i == 0) {
					return false;
				}
			}
			return true;
		}
	}

}
