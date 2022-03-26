public class MultiArray_Q03 {

	public static void main(String[] args) {

		// 3번 문제 숫자 출력
		// 세로 출력
		int[][] nums = new int[5][5];
		
		int n = 1;
		
		// 데이터 입력 
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				nums[j][i] = n;
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
