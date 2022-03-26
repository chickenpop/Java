public class MultiArray_Q04 {

	public static void main(String[] args) {

		// 4번 문제 숫자 출력
		// 역삼각형 응용하여 출력
	
		int[][] nums = new int[5][5];
		
		int n = 1;
		
		// 데이터 입력 
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				nums[i][j] = n;
				n++;
			}
		}
		
		// 데이터 출력 
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
		
	}

}
