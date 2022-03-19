import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array_Q05 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.array > "Q05.java"
		
		// 5번 최대 최소
		
		// 객체, 변수 생성
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int maxRange = 0, minRange = 0;
		int[] nums = new int[20];
		
		// 난수 생성(20, 1~20)
		for(int i=0; i<nums.length; i++) {
			
			nums[i] = (int)(Math.random()*20)+1;
			
		}
		
		// 입력
		System.out.print("최대 범위 : ");
		maxRange = Integer.parseInt(reader.readLine());
		System.out.print("최소 범위 : ");
		minRange = Integer.parseInt(reader.readLine());
		
		// 출력
		System.out.printf("원본 : %s\n", dump(nums));
		System.out.printf("결과 : %s\b\b\n", arrayRange(nums, minRange, maxRange));

	} // main
	
	public static String arrayRange(int[] list, int minRange, int maxRange) {
		
		String result = "";
		
		for(int i=0; i<list.length; i++) {
			
			if(minRange <= list[i] && list[i] <= maxRange) {
				result += list[i] + ", ";
			}
			
		}
		
		return result;
	}
	
	public static String dump(int[] list) {
		
		String result = "";
		
		for(int i=0; i<list.length; i++){
			
			if(i==list.length-1) {
				
				result += list[i];
				break;
			}
			
			result += list[i] + ", ";
			
		}
		
		return result;
	}

}




