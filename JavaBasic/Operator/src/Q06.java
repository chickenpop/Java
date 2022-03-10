import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {
	public static void main(String[] args) throws Exception {
		
		// com.test.java.question.operator > "Q06.java"
		
		// 6번 문제 세금 계산
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		double taxRate = 0.033;
		
		System.out.print("한달 수입 금액(원) : ");
		String incomeInput = reader.readLine();
		
		int income = Integer.parseInt(incomeInput);
		
		double incomeTax = income * taxRate; 
		
		income -= incomeTax;
		
		System.out.printf("세후 금액(원) : %,d원\n", income);
		System.out.printf("세금(원) : %,d원\n", (int)incomeTax);
		
		
	}
}
