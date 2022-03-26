import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Iteration_Q09 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.iteration > "Q09.java"
		
		// 9번 문제 숫자 게임
		// 시도 횟수가 10회가 넘어가면 프로그램을 강제로 종료하시오.
		
		// 객체, 변수 생성
		// bf, 예외처리 Exception
		// 난수 정수 int(randomNum)
		// 정답 맞추는 데 사용한 횟수 int(cnt)
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int randomNum = (int)(Math.random()*10) + 1;
		int cnt = 0;
		
		System.out.println("컴퓨터가 1~10사이의 숫자를 1개 생각했습니다.");
		for(int i=0; i<10; i++) {
			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());
			
			if(num == randomNum) {
				cnt++;
				System.out.println("맞았습니다.");
				System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", randomNum);
				System.out.printf("정답을 맞추는 데 시도한 횟수는 %d회입니다.\n", cnt);
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("틀렸습니다.");
				cnt++;
			}
		}
		
	}

}
