public class MultiArray_Q05 {

	public static void main(String[] args) {

		// 5번 문제 숫자 출력
		// 다이아몬드 모양으로 출력
		
		int[][] nums = new int[5][5];
		
		int n = 1;
		int start = 5/2;
		
		// 데이터 입력 ***
		for(int i=-start; i<=start; i++) {
			for(int j=Math.abs(i); j< 5-Math.abs(i); j++) {
				nums[i+start][j] = n;
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
