public class Array_Q03 {

	public static void main(String[] args) {

		// com.test.java.question.array > "Q03.java"
		
		// 3번 문제 덤프
		
		int[] list = new int[4];
		
		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = 40;
		
		String result = dump(list);
		System.out.printf("nums = %s"
				+ "\n", result);
		
	}

	public static String dump(int[] list) {
		
		String result = "[";
		
		for(int i=0; i<list.length; i++) {
			
			if(i == list.length-1) {
				result += list[i] + "]";
				break;
			}

			result += list[i] + ", ";
			
		}
		
		return result;
	}
	
}








