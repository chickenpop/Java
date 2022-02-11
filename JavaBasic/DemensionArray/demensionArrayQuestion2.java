package DemensionArray;

import java.util.Scanner;

import Array.arrayQuestion1;

public class demensionArrayQuestion2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char arr[][] = new char[5][5];
		int row;
		int col;
		
		while(true) {
		
			System.out.print("행 인덱스 입력 >> ");
			row = sc.nextInt();
			System.out.print("열 인덱스 입력 >> ");
			col = sc.nextInt();
			
			// 만약 행이나 열 수의 미만이나 초과되는 수가 입력되면 프로그램 종료
			if (row < 0 || row > 4 || col < 0 || col > 4) break;
			
			// 2차원 5행 5열 생성
			// 행과 열을 입력 받아 해당 좌표의 값을 'X'로 변환해 
			// 2차원 출력
			arr[row][col] = 'X';
			System.out.println("\t0\t1\t2\t3\t4");
			for(int i = 0 ; i < arr.length; i++) {
				System.out.print(i+"\t");
				for(int j = 0 ; j < arr[0].length; j++) {
					System.out.print(arr[i][j]+"\t");
				}
				System.out.println();
			}
		}
		System.out.println("프로그램을 종료합니다");
		
		
		}
}
