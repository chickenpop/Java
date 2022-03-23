public class MultiArray_Q10 {

	public static void main(String[] args) {

		// 10번 문제 숫자 출력
		// 마방진
		
		int[][] nums = new int[3][3];
		int n = nums.length;
		int x = 1; // BufferedReader 로 입력 받을 수 있음
		int y = 2;
		
		
		// 데이터 입력
		for(int i=0; i<n*n; i++) {
			
			nums[x][y] = i+1;
			
			if((i+1)%n == 0) {
				y--;
			} else {
				
				x--;
				y++;
				if(y>n-1) y=0;
				if(x<0) x = n-1;
				
			}
			
			
		}
		
		// 데이터 출력 
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%3d", nums[i][j]);
			}
			System.out.println();
		}
		
	}

}
