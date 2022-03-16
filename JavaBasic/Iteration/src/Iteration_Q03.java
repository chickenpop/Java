import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Iteration_Q03 {

	public static void main(String[] args) throws Exception {
		
		// com.test.java.question.iteration > "Q03.java"
		
		// 3번 문제 범위 합 구하기
		
		// 객체 생성
		// bf
		// 숫자 한개 int(num)
		// 1~num까지 합계 int(sum)
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		int sum = 0;
		
		// 입력
		// 숫자 : 'num'
		System.out.print("숫자 : ");
		num = Integer.parseInt(reader.readLine());
		
		// 출력
		// 1~num = sum
		sum = sum(num);
		System.out.printf("1 ~ %d = %d\n", num, sum);
	}
	
	public static int sum(int num) {
		int sum = 0;
		
		for(int i=0; i<num; i++) {
			sum += (i+1); 
		}
		
		return sum;
	}
	
}
