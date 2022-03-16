import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Iteration_Q04 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.iteration > "Q04.java"
		
		// 4번 문제 짝수 홀수 합 구하기
		
		// bf, 예외처리 Exception
		// 입력 횟수 int(cnt)
		// 입력 숫자 int(num)
		// 짝수 합 int(evenSum), 홀수 합 int(oddSum)
		// 짝수 갯수 int(evenCnt), 홀수 갯수 int(oddCnt)
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		int num = 0;
		int evenSum = 0;
		int evenCnt = 0;
		int oddSum = 0;
		int oddCnt = 0;
		
		// 입력 
		// 입력 횟수 : 'cnt'
		// 숫자 : 'num'
		System.out.print("입력 횟수 : ");
		cnt = Integer.parseInt(reader.readLine());
		
		for(int i=0; i<cnt; i++) {
			System.out.print("숫자 : ");
			num = Integer.parseInt(reader.readLine());
			if(num % 2 == 0) {
				evenSum += num;
				evenCnt++;
			} else {
				oddSum += num;
				oddCnt++;
			}
		}
		
		// 출력
		// 짝수 evenCnt개의 합 : evenSum
		// 홀수 oddCnt개의 합 : oddSum
		System.out.printf("짝수 %d개의 합 : %d\n", evenCnt, evenSum);
		System.out.printf("홀수 %d개의 합 : %d\n", oddCnt, oddSum);
	}

}
