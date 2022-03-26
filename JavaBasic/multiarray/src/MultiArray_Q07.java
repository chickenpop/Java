import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MultiArray_Q07 {

	public static void main(String[] args) throws Exception {

		// 7번 문제 성적 그래프
		
		//객체, 변수
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[][] score = new String[10][3];
		int[] grade = new int[3];
		String[] gradeName = {"국어", "영어", "수학"};
		
		// 입력
		for(int i=0; i<grade.length; i++) {
			System.out.printf("%s 점수 : ", gradeName[i]);
			grade[i] = Integer.parseInt(reader.readLine());	
			
			for(int j=0; j<score.length; j++) {
				if(j<=grade[i]/10) {
					score[j][i] = " ■";
				}else {
					score[j][i] = " ";
				}
				
			}
			
		}
		// 데이터 출력
	
			
		for(int i=score.length-1; i>0; i--) {
			
			for(int j=0; j<score[i].length; j++) {
				
				System.out.printf(" %s\t", score[i][j]);
				
			}
			System.out.println();
		}
			
		
		
		
		// 출력		
		System.out.println("--------------------");
		for(int i=0; i<gradeName.length; i++) {
			System.out.printf(" %s\t", gradeName[i]);			
		}
		System.out.println();
	}

}
