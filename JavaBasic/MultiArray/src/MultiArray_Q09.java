public class MultiArray_Q09 {

	public static void main(String[] args) {

		// 9번 문제 숫자 출력
		// 달팽이 배열
		
		int[][] nums = new int[5][5];
		
		int n = 1;
		int x = 0, y = 0;
		int sign = 1;
		
		// 데이터 입력
		for(int i=nums.length; i>0; i--) {
			if(i==nums.length) {
				for(int k=0; k<5; k++) {
					nums[x][y] = n++;
					y += sign;
				}
				y -= sign;
				continue;
			}
			// x, y로 방향전환
			for(int j=0; j<i; j++) {
				x += sign;
				nums[x][y] = n++;
			}
			sign *= -1;
			for(int k=0; k<i;k++) {
				y += sign;
				nums[x][y] = n++;
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
