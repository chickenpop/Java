package Array;

import java.util.Arrays;
import java.util.Scanner;

public class arrayQuestion2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ���� ����
		char yesNo = 'y';
		int num; // �迭 ũ�� 
		
		//�迭�� ���� �� �Ҵ�
		System.out.print("�迭�� ũ�� �Է�: ");
		num = sc.nextInt();
		String stringArr[] = new String[num];
		String[] copyStringArr = new String[10];
		
		for (int i = 0; i < num; i++) {
			System.out.print((i+1)+"��° ���ڿ�:");
			stringArr[i] = sc.next();
		}
		System.out.print("���� �� �Է��Ͻðڽ��ϱ�? (y/n)");
		yesNo = sc.next().charAt(0);
		
		// �迭 �ε��� �߰�
		//yesNo.toUpperCase().equals("Y") �빮�ڷθ� ������ �� ����
		while(yesNo == 'y' || yesNo == 'Y'){ 			
			System.out.print("�߰��� ����: ");
			num = sc.nextInt();
			
			// ���� �迭(stringArr)���� num��ŭ �� ū copy�迭(copyStringArr) ����
			copyStringArr = Arrays.copyOf(stringArr, stringArr.length+num);
			// ���ڿ� �߰�
			for(int i = stringArr.length ; i < stringArr.length + num; i++) {
				System.out.println((i+1)+"��° ���ڿ�:");
				copyStringArr[i] = sc.next();
			}

			System.out.print("���� �� �Է��Ͻðڽ��ϱ�? (y/n)");
			yesNo = sc.next().charAt(0);
			
		}
		
		// �迭 ���
		if (copyStringArr[0] == null) {
			System.out.print(Arrays.toString(stringArr));
		} else {
			System.out.print(Arrays.toString(copyStringArr));
		}
		
	}

}
