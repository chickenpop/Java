public class NestingLoop_Q11 {

	public static void main(String[] args) {

		// com.test.java.question.iteration_while > "Q11.java"
		
		// 11번 숫자 합 구하기
		String result = "";
		int sum = 0;
		int num = 1;
		
		for(int i=0;;i++) {
			
			num += i;
			if(num>100) {
				result += "\b\b= " + sum;
				break;
			}
			sum += num;
			result += num + " + ";
			
		}
		
		System.out.println(result);
		
	}

}
