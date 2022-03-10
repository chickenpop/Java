import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {
	public static void main(String[] args) throws Exception {
		
		// com.test.java.question.operator > "Q04.java"
		
		// 4번 문제 온도 변환
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("섭씨(℃) : ");
		String celsiusIn = reader.readLine();
		
		int celsius = Integer.parseInt(celsiusIn);
		double fahreheit = celsius * 1.8 + 32;
		System.out.printf("섭씨 %d℃는 화씨 %.1f℉입니다.", celsius, fahreheit);
		
	}
}
