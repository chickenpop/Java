import java.io.BufferedReader;
import java.io.InputStreamReader;

public class While_Q03 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.iteration_while > "Q03.java"
		
		// 3번 문제 369
		
		// 조건 최대 3자리까지만 입력하시오.
		
		// 객체, 변수 생성
		// bf, 예외처리 Exception
		// 최대 숫자 int(maxNumber)
		// 결과 출력 String(result)
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int maxNumber = 0;
		String result = "";
		
		// 입력(while)
		// 최대 숫자 : 50
		System.out.print("최대 숫자 : ");
		maxNumber = Integer.parseInt(reader.readLine());
		
		int cnt = 0;
		while(cnt < maxNumber) {
			
			cnt++;
			String game369 = String.valueOf(cnt);
			result += game369(game369) + " ";
			if(cnt % 20 == 0) result += "\n";
		}
		// 출력
		// 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 14 15 짝 17 18 짝 20 
		// 21 22 짝 24 25 짝 27 28 짝 짝 짝 짝 짝 짝 짝 짝 짝 짝 짝 짝 짝 짝 40 
		// 41 42 짝 44 45 짝 47 48 짝 50
		System.out.println(result);
	} // main

	public static String game369(String number) {
		
		for(int i=0; i<number.length(); i++) {
			if((number.charAt(i)) == '3'  // .charAt(0)
			|| (number.charAt(i)) == '6' 
			|| (number.charAt(i)) == '9') {
				return "짝";
			} 
		}
		
		return number;
	}
	
	
} // class









