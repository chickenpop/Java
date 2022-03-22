import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String_Q06 {

	public static void main(String[] args) throws Exception {

		// 6번 문제 주민등록번호
		
		// 객체, 변수
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String regNo = "";
		int[] regNoId = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 }; 
		
		// 입력
		System.out.print("주민등록번호 : ");
		regNo = reader.readLine().replace("-", "");

		// 유효성 검사 
		int sum = 0;
		for(int i=0; i<regNo.length()-1; i++) {
			sum += (regNo.charAt(i) - '0') * regNoId[i];
		}
		sum = 11 - (sum % 11);
		
		// 출력
		if(sum == regNo.charAt(regNo.length()-1)-'0') {
			System.out.println("올바른 주민등록번호입니다.");
		} else {
			System.out.println("올바르지 않은 주민등록번호입니다.");			
		}
		
	}

}
