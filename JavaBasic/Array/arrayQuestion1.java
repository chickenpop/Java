package Array;

import java.util.Arrays;
import java.util.Scanner;

public class arrayQuestion1 {

	public static void main(String[] args) {
		int num;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수의 야의 정수 입력: ");
		num = sc.nextInt();
		int arr[] = new int[num];
		//int[] arr = new int[sc.nextInt()]; 로 변경 가능
		
		// 중간의 과반까지는 오름차순, 그 이후에는 내림차순  ex) 크기 9 > 1, 2, 3, 4, 5, 4, 3, 2, 1
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
