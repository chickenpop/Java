import java.io.BufferedReader;
import java.io.InputStreamReader;

public class While_Q05 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.iteration_while > "Q05.java"
		
		// 5번 문제 자판기(while 끝)
		
		// 객체, 변수 생성
		// bf, 예외처리 : Exception
		// 입력 String(menu, price)
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String menu = "";
		int price = 0; 
		boolean flag = true;
		
		while(flag) {
			
			System.out.println("====================");
			System.out.println("\t자판기");			
			System.out.println("====================");
			System.out.printf("1. %s %d\n", getMenu("1"), 700);
			System.out.printf("2. %s %d\n", getMenu("2"), 600);
			System.out.printf("3. %s %d\n", getMenu("3"), 500);
			System.out.println("--------------------");
			
			System.out.print("금액 투입(원) : ");
			price = Integer.parseInt(reader.readLine());
			System.out.println("--------------------");
			
			System.out.printf("음료 선택(번호) : ");
			menu = reader.readLine();
			
			System.out.printf("+%s를 제공합니다.\n", getMenu(menu));
			System.out.printf("+잔돈 %d원을 제공합니다.\n", getChange(price, menu));
			
			System.out.println("계속하시려면 엔터를 입력하세요");
			System.out.print("종료하시면 아무키나 입력하세요");
		
			String in = "";
			in = reader.readLine();
			if(in.length()!=0) {
				break;
			}
			
		}
		
	}
	
	public static String getMenu(String number) {
		if(number.equals("1")) {
			return "콜라";
		} else if(number.equals("2")) {
			return "사이다";
		} else if(number.equals("3")) {
			return "비타 500";
		}
		return "";
	}
	
	public static int getMenuPrice(String number) {
		if(number.equals("1")) {
			return 700;
		} else if(number.equals("2")) {
			return 600;
		} else if(number.equals("3")) {
			return 500;
		}
		return 0;
	}
	
	public static int getChange(int price, String menu) {
		
		return price-getMenuPrice(menu);
		
	}

}
