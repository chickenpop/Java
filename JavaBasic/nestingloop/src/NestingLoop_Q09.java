public class NestingLoop_Q09 {

	public static void main(String[] args) {

		// 9번 문제 숫자 합 구하기
		
		// 1 ~  10 :   55
		// 1 ~  20 :  210
		// 1 ~  30 :  465
		// 1 ~  40 :  820
		// 1 ~  50 : 1275
		// 1 ~  60 : 1830
		// 1 ~  70 : 2485
		// 1 ~  80 : 3240
		// 1 ~  90 : 4095
		// 1 ~ 100 : 5050
		
		for(int i=0; i<10; i++) {
			
			System.out.printf("1 ~ %3d : %4d\n", (i+1)*10, sum((i+1)*10));
		
		}
		
	}
	
	public static int sum(int num) {
		
		int sum = 0;
		for(int i=0; i<num; i++) {
			sum += i+1;
		}
		
		return sum;
	}

}
