import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array_Q07 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.array > "Q07.java"
		
		// 7번 문제 삽입
		
		// 객체, 변수 생성
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] list = { 5, 6, 1, 3, 2, 8, 7, 4, 10, 9};
		int insertIndex = 0;
		int insertNum = 0;
		
		
		// 입력
		System.out.print("삽입 위치 : ");
		insertIndex = Integer.parseInt(reader.readLine());
		System.out.print("값 : ");
		insertNum = Integer.parseInt(reader.readLine());
		
		System.out.printf("원본 : %s\n", dump(list));

		for(int i=list.length-1; i>insertIndex; i--) {
			
			list[i] = list[i-1];
			
		}
		list[insertIndex] = insertNum;
		
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
