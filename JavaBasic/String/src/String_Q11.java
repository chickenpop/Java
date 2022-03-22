import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String_Q11 {

	public static void main(String[] args) throws Exception {

		// 11번 숫자 합
		
		// 객체, 변수
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String words = "";
		int sum = 0;
		
		// 입력
		System.out.print("입력 : ");
		words = reader.readLine().trim();
		
		// 데이터 추출
		for(int i=0; i<words.length(); i++) {
			
			sum += number(words.charAt(i));
			
		}
		
		// 출력
		System.out.printf("문장에 존재하는 모든 숫자의 합은 %d입니다.\n", sum);
	
	}
	
	public static int number(char word) {
		
		if(word == '1') return 1;
		else if(word == '2') return 2;
		else if(word == '3') return 3;
		else if(word == '4') return 4;
		else if(word == '5') return 5;
		else if(word == '6') return 6;
		else if(word == '7') return 7;
		else if(word == '8') return 8;
		else if(word == '9') return 9;
		return 0;
	}

}
