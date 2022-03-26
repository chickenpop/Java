public class NestingLoop_Q12 {

	public static void main(String[] args) {

		// com.test.java.question.iteration_while > "Q12.java"
		
		// 12번 숫자 합 구하기
		
		int sum = 0;
		int num = 1;
		int lastNum = 0;
		String result = "1 + ";
		
		while(num<100) {

			sum += num + lastNum;
			
			lastNum += num;
			if(sum > 100) {
				result += "\b\b = " + sum;
				break;
			}
			result += lastNum + " + ";
			num += lastNum;
			result += num + " + ";
			
		}
		
		System.out.println(result);
		

	}


}
