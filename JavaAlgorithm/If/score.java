//9498 시험성적

import java.util.Scanner;

public class score {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int score = in.nextInt();
		char grade[] = {'A', 'B', 'C', 'D', 'F'};
		
		if (score <= 100 && score >= 90) {
			System.out.println(grade[0]);
		} else if (score >= 80) {
			System.out.println(grade[1]);
		} else if (score >= 70) {
			System.out.println(grade[2]);
		} else if (score >= 60) {
			System.out.println(grade[3]);
		} else {
			System.out.println(grade[4]);
		}
		
		in.close();
	}

}