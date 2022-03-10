import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {
	public static void main(String[] args) throws Exception {
		
		// com.test.java.question.operator > "Q05.java"
		
		// 5번 문제 자전거
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("사용자가 페달을 밟은 횟수 : ");
		String pedalCntInput = reader.readLine();
		
		int pedalCnt = Integer.parseInt(pedalCntInput);
		
		// 1인치 = 0.0253
		// 원의 둘레 : 원주율 * 지름
		double inch = 26.0;
		double m = 0.0254;
		double circleArea = Math.PI * inch * pedalCnt * m;
		
		System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %,.3fm를 달렸습니다.", pedalCnt, circleArea);
	
	}
}
