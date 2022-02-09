package Array;

import java.util.Arrays;
import java.util.Scanner;

public class arrayQuestion2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 변수 선언
		char yesNo = 'y';
		int num; // 배열 크기 
		
		//배열을 선언 및 할당
		System.out.print("배열의 크기 입력: ");
		num = sc.nextInt();
		String stringArr[] = new String[num];
		String[] copyStringArr = new String[10];
		
		for (int i = 0; i < num; i++) {
			System.out.print((i+1)+"번째 문자열:");
			stringArr[i] = sc.next();
		}
		System.out.print("값을 더 입력하시겠습니까? (y/n)");
		yesNo = sc.next().charAt(0);
		
		// 배열 인덱스 추가
		//yesNo.toUpperCase().equals("Y") 대문자로만 설정할 수 있음
		while(yesNo == 'y' || yesNo == 'Y'){ 			
			System.out.print("추가할 개수: ");
			num = sc.nextInt();
			
			// 기존 배열(stringArr)보다 num만큼 더 큰 copy배열(copyStringArr) 생성
			copyStringArr = Arrays.copyOf(stringArr, stringArr.length+num);
			// 문자열 추가
			for(int i = stringArr.length ; i < stringArr.length + num; i++) {
				System.out.println((i+1)+"번째 문자열:");
				copyStringArr[i] = sc.next();
			}

			System.out.print("값을 더 입력하시겠습니까? (y/n)");
			yesNo = sc.next().charAt(0);
			
		}
		
		// 배열 결과
		if (copyStringArr[0] == null) {
			System.out.print(Arrays.toString(stringArr));
		} else {
			System.out.print(Arrays.toString(copyStringArr));
		}
		
	}

}
