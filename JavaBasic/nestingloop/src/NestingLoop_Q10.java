public class NestingLoop_Q10 {

	public static void main(String[] args) {
		
		// 10번 문제 숫자 합 구하기
		
		//  1 ~  10 :  55
		// 11 ~  20 : 155
		// 21 ~  30 : 255
		// 31 ~  40 : 355
		// 41 ~  50 : 455
		// 51 ~  60 : 555
		// 61 ~  70 : 655
		// 71 ~  80 : 755
		// 81 ~  90 : 855
		// 91 ~ 100 : 955
		
		for(int i=0; i<10; i++) {
			
			System.out.printf("%2d ~ %3d : %4d\n", 10*i+1, (i+1)*10, sum(10*i+1, (i+1)*10));
		
		}
		
	}
	
	public static int sum(int startNum, int endNum) {
		
		int sum = 0;
		for(int i=startNum; i<=endNum; i++) {
			sum += i;
		}
		
		return sum;
	}
	
}
