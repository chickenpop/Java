public class MultiArray_Q06 {

	public static void main(String[] args) {

		// 6번 문제 숫자 출력
		// 행과 열의 합 출력
		
		int[][] nums = new int[5][5];
		int[] ySum = new int[5];
		int n = 1;
	
		
		// 데이터 입력 ***
		for(int i=0; i<5; i++) {
			int sum = 0;
			if(i==4) {
				for(int k=0; k<5; k++) {
					nums[4][k] = ySum[k];
				}
				break;
			}
			for(int j=0; j<4; j++) {
				
				nums[i][j] = n;
				sum += nums[i][j];
				ySum[j] += nums[i][j];
				n++;
				
			}
			nums[i][4] = sum;
			ySum[4] += sum;
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
