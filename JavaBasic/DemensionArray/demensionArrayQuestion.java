package demensoinArray;

import java.util.Scanner;

public class demensionArrayQuestion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 행의 크기 입력
		System.out.print("행의 크기 입력 : ");
		char ch[][] = new char[sc.nextInt()][];
		// 열의 크기 입력
		for(int i = 0 ; i < ch.length ; i++) {
			System.out.print(i+"열의 크기 입력 : ");
			ch[i] = new char[sc.nextInt()];
		}
		// 2차원 배열 초기화, 주석된 문장으로 고칠수 잇음
		int a = 97; //char a = 'a';
		for(int i = 0 ; i < ch.length ; i++) {
			for(int j = 0 ; j < ch[i].length ; j++) {
				ch[i][j] = (char)a; // a++;
				a++;
			}
		}
		// 2차원 배열 출력
		for(int i = 0 ; i < ch.length ; i++) {
			for(int j = 0 ; j < ch[i].length ; j++) {
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}
	}

}
