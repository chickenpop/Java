import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Iteration_Q06 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.iteration > "Q05.java"
		
		// 5번 문제 숫자 합 구하기
		
		// 객체 생성
		// bf, 예외처리 Exception
		// 시작 숫자 int(startNum)
		// 종료 숫자 int(endNum)
		// 시작~종료 숫자 사이의 합 int(sum)
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int startNum = 0;
		int endNum = 0;
		
		// 입력
		// 시작(종료) 숫자 : startNum(endNum)
		System.out.print("시작 숫자 : ");
		startNum = Integer.parseInt(reader.readLine());
		System.out.print("종료 숫자 : ");
		endNum = Integer.parseInt(reader.readLine());
		
		// 메소드
		// 출력
		// 1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 + 9 - 10 = -5
		sum(startNum, endNum);
	}

	public static void sum(int startNum, int endNum) {
		int sum = 0;
		int cnt = 1;
		for(int i=startNum; i<=endNum; i++) {
			
			if(cnt % 2 == 1) {
				if(i == endNum) {System.out.printf("%d = %d\n", i, sum+i); break;}
				sum += i;
				System.out.printf("%d - ", i); 
			} else {
				if(i == endNum) {System.out.printf("%d = %d\n", i, sum-i); break;}
				sum -= i;
				System.out.printf("%d + ", i);				
			} 
			cnt++;
			
		}
	}

}
