public class Array_Q04 {

	public static void main(String[] args) {

		// com.test.java.question.array > "Q04.java"
		
		// 4번 문제 최대 최소
		
		// 객체, 변수 생성
		int[] nums = new int[20];
		int maxNum = 0;
		int minNum = 0;
		String result = "";
		
		// 난수 넣기
		for(int i=0; i<nums.length; i++) {
			
			nums[i] = (int)(Math.random()*20) + 1;
	
		}
		
		maxNum = max(nums);
		minNum = min(nums);
		result = dump(nums);
		
		System.out.printf("원본 : %s\n", result);
		System.out.printf("최대값 : %d\n", maxNum);
		System.out.printf("최소값 : %d\n", minNum);
		
		
		// 출력
		
	} // main

	public static int min(int[] nums) {
		
		int min = nums[0];
		
		for(int i=0; i<nums.length; i++) {
			
			if(min > nums[i]) {

				min = nums[i];
				
			}
			
		}
		
		return min;
	}
	
	public static int max(int[] nums) {
		
		int max = nums[0];
		
		for(int i=0; i<nums.length; i++) {
			
			if(max < nums[i]) {

				max = nums[i];
				
			}
			
		}
		
		return max;
	}

	public static String dump(int[] list) {
	
		String result = "";
		
		for(int i=0; i<list.length; i++) {
			
			if(i == list.length-1) {
			
				result += list[i];
				break;
		
			}
			
			result += list[i] + ", ";
	
		}
		
		return result;
	
	}
	
} // class







