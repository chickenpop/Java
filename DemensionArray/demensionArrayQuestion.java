package demensoinArray;

import java.util.Scanner;

public class demensionArrayQuestion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ���� ũ�� �Է�
		System.out.print("���� ũ�� �Է� : ");
		char ch[][] = new char[sc.nextInt()][];
		// ���� ũ�� �Է�
		for(int i = 0 ; i < ch.length ; i++) {
			System.out.print(i+"���� ũ�� �Է� : ");
			ch[i] = new char[sc.nextInt()];
		}
		// 2���� �迭 �ʱ�ȭ, �ּ��� �������� ��ĥ�� ����
		int a = 97; //char a = 'a';
		for(int i = 0 ; i < ch.length ; i++) {
			for(int j = 0 ; j < ch[i].length ; j++) {
				ch[i][j] = (char)a; // a++;
				a++;
			}
		}
		// 2���� �迭 ���
		for(int i = 0 ; i < ch.length ; i++) {
			for(int j = 0 ; j < ch[i].length ; j++) {
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}
	}

}
