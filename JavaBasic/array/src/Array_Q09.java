import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array_Q09 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.array > "Q09.java"
		
		// 9번 문제 요소 더하기
		
		// 객체, 변수 생성
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int arrayLength = 0;
		int[] list;
		int[] listPlus;
		
		// 입력
		System.out.print("배열 길이 : ");
		arrayLength = Integer.parseInt(reader.readLine());
		
		// 배열 초기화
		list = new int[arrayLength];
		for(int i=0; i<list.length; i++) {
			
			list[i] = (int)(Math.random()*9)+1;
			
		}
		System.out.printf("원본 : %s\n", dump(list));
		
		// 요소 더하기 
		listPlus = new int[(int)(Math.round(arrayLength/2.0))];
		for(int i=0; i<listPlus.length; i++) {
			
			if(i == listPlus.length-1) {
				if(list.length%2 == 1) {
					listPlus[listPlus.length-1] = list[list.length-1];
				} else {
					listPlus[i] = list[i+i] + list[i+i+1];
				}
				break;
			}
			listPlus[i] = list[i+i] + list[i+i+1];
			
		}
		
		System.out.printf("결과 : %s\n", dump(listPlus));
		
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




