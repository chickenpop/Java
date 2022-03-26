public class MultiArray_Q08 {

	public static void main(String[] args) {

		// 8번 문제 숫자 출력
		// 사선 출력
		
		int[][] nums = new int[5][5];
		
		int n = 1;
		
		// 0 == [0] + [0]
		// 1 == [1] + [0]
		// 1 == [0] + [1]
		
		// 데이터 입력 
		// 사선 [5]+[5]-2 = 8
		for(int i=0; i<=8; i++) {
			for(int j=0; j<5; j++) {
				for(int k=0; k<5; k++) {
					if(j+k == i) {
						nums[j][k] = n;
						n++;
						break;
					}
				}
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
