package Review;

import java.util.Scanner;

public class ReviewQuestion1 {

	public static void main(String[] args) {
		//���� ������ ����
		Scanner sc = new Scanner(System.in);
		
		// ���� ����
		int numSize = 1; // ������ ũ��
		int numRandom[] = new int[50]; // ������ ���� �迭 
		int num = 0; // �ߺ� ���� ������ ���ϱ� ���� �ӽ� ���� ����
		int cnt = 0; // ������ �ֱ� ���� ���� ����
		int arr[][]; //������
		
		//������ �����
		System.out.print("������ ũ�� ���� : ");
		numSize = sc.nextInt();
		arr = new int[numSize][numSize]; //������ ����
		//numRandom[numSize*numSize]; ũ�� �������� �����ǰ� �����ϴ� ��
		//������ ����
		for(int i = 0 ; i < numRandom.length ; i++) {
			numRandom[i] = (int)(Math.random()*100); // ���� ȿ������ ���� (numSize*numSize) + 1 
			for(int j = 0; j < i ; j++) {
				if(numRandom[j] == num) {
					i--;
					break;
				}
			}
		}

	
		// ������ �ֱ� 
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0; j < arr[i].length ; j++) {
				arr[i][j] = numRandom[cnt++];
			}
		}
		//���� ����
		System.out.println("======������� ����======");
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0; j < arr[i].length ; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}

		while(true) {
			System.out.print("���� ����:");
			num = sc.nextInt();
			for(int i = 0 ; i < arr.length ; i++) {
				for(int j = 0; j < arr[i].length ; j++) {
					if(arr[i][j] == num) arr[i][j] = 0;
					System.out.printf("%5d", arr[i][j]);
					
				}
				System.out.println();
			}
		}
		
	}

}
