import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array_Q08 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.array > "Q08.java"
		
		// 8번 문제 삭제

		
		// 객체, 변수 생성
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] list = { 5, 6, 1, 3, 2, 8, 7, 4, 10, 9};
		int deleteIndex = 0;
		
		
		// 입력
		
		System.out.print("삭제 위치 : ");
		deleteIndex = Integer.parseInt(reader.readLine());
		
		System.out.printf("원본 : %s\n", dump(list));
		// 삭제 
		for(int i=deleteIndex; i<list.length-1; i++) {
			
			list[i] = list[i+1];
			
		}
		list[list.length-1] = 0;
		
		// 출력
		System.out.printf("결과 : %s\n", dump(list));
		
		
	}
	
	public static String dump(int[] list) {
		
		String result = "[";
		
		for(int i=0; i<list.length; i++) {
			
			if(i==list.length-1) {
				
				result += list[i] + "]";
				break;
				
			}
			result += list[i] + ", ";
				
			}
			
			return result;
		}
	
	
}

