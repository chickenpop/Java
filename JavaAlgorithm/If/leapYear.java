//2753 윤년

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int leapYear = in.nextInt();
		
		if(leapYear % 4 == 0 && (leapYear % 100 != 0 || leapYear % 400 == 0)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		in.close();
	}

}