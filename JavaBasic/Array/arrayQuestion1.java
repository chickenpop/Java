package Array;

import java.util.Arrays;
import java.util.Scanner;

public class arrayQuestion1 {

	public static void main(String[] args) {
		int num;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ȧ���� ���� ���� �Է�: ");
		num = sc.nextInt();
		int arr[] = new int[num];
		//int[] arr = new int[sc.nextInt()]; �� ���� ����
		
		// �߰��� ���ݱ����� ��������, �� ���Ŀ��� ��������  ex) ũ�� 9 > 1, 2, 3, 4, 5, 4, 3, 2, 1
		for(int i = 0 ; i < num ; i++) {
			if (num / 2 + 1 > i) {
				cnt++;
				arr[i] = cnt; 
			}else {
				cnt--;
				arr[i] = cnt;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
