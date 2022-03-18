import java.io.BufferedReader;
import java.io.InputStreamReader;

public class While_Q02 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.iteration_while > "Q02.java"
		
		// 2번 문제 한글 숫자
		
		// 숫자 10개 입력 받아 한글 변환 후 출력
		
		// 객체,변수
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String result = "";
		
		// 입력(while)
		// 숫자 : 'num'
		int cnt = 0;
		while(cnt<10) {
			
			System.out.print("숫자 : ");
			String num = reader.readLine();
			
			result += korNumber(num);
			cnt++;
			
		}
		
		// 출력
		// 오칠사삼오칠육이일삼
		System.out.println(result);
	}
	
	public static String korNumber(String number) {
		
		if(number.equals("1")) {
			return "일";
		} else if(number.equals("2")) {
			return "이";
		} else if(number.equals("3")) {
			return "삼";
		} else if(number.equals("4")) {
			return "사";
		} else if(number.equals("5")) {
			return "오";
		} else if(number.equals("6")) {
			return "육";
		} else if(number.equals("7")) {
			return "칠";
		} else if(number.equals("8")) {
			return "팔";
		} else if(number.equals("9")) {
			return "구";
		} 
		
		return "";
		
	}
	
	

}
