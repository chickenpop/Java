import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String_Q12 {

	public static void main(String[] args) throws Exception {
		
		// 12번 문제 연산식
		
		
		// 객체, 변수 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder arithmeticword = new StringBuilder("");
		String operator = "";
		int[] num = new int[2];
		
		System.out.print("입력: ");
		String arithmetic = reader.readLine().trim();
		
		arithmeticword.append(arithmetic.replace(" ", ""));
		
		
		// 데이터 추출
		while(true) {
			for(int i=0; i<arithmeticword.length(); i++) {
				if(IsOperator(arithmeticword.substring(i, i+1))) {
					operator = arithmeticword.substring(i, i+1);
				}
			}
			
			if(operator.length()==0) {
				System.out.println("연산자가 올바르지 않습니다.");
				break;
			}
			
		
			String[] operand = { arithmeticword.substring(0, arithmetic.indexOf(operator)), arithmeticword.substring(arithmetic.indexOf(operator)+1)};
			
			if(operand[0].length()==0 || operand[1].length()==0) {
				System.out.println("피연산자가 부족합니다.");
				break;
			}
			
			for(int i=0; i<operand.length; i++) {
				for(int j=0; j<operand[i].length(); j++) {
					num[i] += number(operand[i].substring(j, j+1))*(Math.pow(10, operand[i].length()-j-1));
				}
			}

			System.out.printf("%d %s %d = %d \n", num[0], operator, num[1], calculate(operator, num[0], num[1]));
			break;
		}
		
		
	}
	
	public static boolean IsOperator(String s) {
		
		if(s.equals("+")) return true;
		else if(s.equals("-")) return true;
		else if(s.equals("*")) return true;
		else if(s.equals("/")) return true;
		else if(s.equals("%")) return true;
		return false;
		
	}
	
	public static int add(int x, int y) {
		return x+y;
	}
	
	public static int minus(int x, int y) {
		return x-y;
	}
	
	public static int multi(int x, int y) {
		return x*y;
	}
	
	public static int divide(int x, int y) {
		return x/y;
	}
	
	public static int remainder(int x, int y) {
		return x%y;
	}
	
	public static int calculate(String operator, int x, int y) {
		
		if(operator.equals("+")) return add(x, y);
		else if(operator.equals("-")) return minus(x, y);
		else if(operator.equals("*")) return multi(x, y);
		else if(operator.equals("/")) return divide(x, y);
		else if(operator.equals("%")) return remainder(x, y);
		
		return 0; // 예외처리의 문제가 있음
	}
	
	public static int number(String word) {
		
		if(word.equals("1")) return 1;
		else if(word.equals("2")) return 2;
		else if(word.equals("3")) return 3;
		else if(word.equals("4")) return 4;
		else if(word.equals("5")) return 5;
		else if(word.equals("6")) return 6;
		else if(word.equals("7")) return 7;
		else if(word.equals("8")) return 8;
		else if(word.equals("9")) return 9;
		return 0;
	}

	
}
