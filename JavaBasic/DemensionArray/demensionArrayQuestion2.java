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
		
			System.out.print("�� �ε��� �Է� >> ");
			row = sc.nextInt();
			System.out.print("�� �ε��� �Է� >> ");
			col = sc.nextInt();
			
			// ���� ���̳� �� ���� �̸��̳� �ʰ��Ǵ� ���� �ԷµǸ� ���α׷� ����
			if (row < 0 || row > 4 || col < 0 || col > 4) break;
			
			// 2���� 5�� 5�� ����
			// ��� ���� �Է� �޾� �ش� ��ǥ�� ���� 'X'�� ��ȯ�� 
			// 2���� ���
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
		System.out.println("���α׷��� �����մϴ�");
		
		
		}
}
