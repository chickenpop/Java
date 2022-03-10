import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03 {
	public static void main(String[] args) throws Exception {
		
		// com.test.java.question.operator > "Q03.java"
		
		// 3번 문제 사각형
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("너비(cm) : ");
		String width = reader.readLine();
		
		System.out.print("높이(cm) : ");
		String height = reader.readLine();
		
		int wid = Integer.parseInt(width);
		int hei = Integer.parseInt(height);
		
		System.out.printf("사각형의 넓이는 %dcm²입니다.\n", (long)wid*hei);
		System.out.printf("사각형의 둘레는 %dcm입니다.\n", (long)(wid+hei)*2);
		
	
	}
}
