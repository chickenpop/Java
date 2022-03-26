import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array_Q01 {

	public static void main(String[] args) throws Exception {
		
		// com.test.java.question.array > "Q01.java"

		// 1번 문제 역순 출력
		
		// 객체, 변수 생성
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] nums = new int[5];
		
		// 입력
		for(int i=0; i<nums.length; i++) {
			
			System.out.print("숫자 : ");			
			nums[i] = Integer.parseInt(reader.readLine());
			
		}
		
		for(int i=0; i<nums.length; i++) {
			
			System.out.printf("nums[%d] = %d\n", nums.length-i-1, nums[nums.length-i-1]);
			
		}
		
	}

}
