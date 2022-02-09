package Review;

import java.util.Scanner;

public class ReviewQuestion1 {

	public static void main(String[] args) {
		//직접 제작한 파일
		Scanner sc = new Scanner(System.in);
		
		// 변수 선언
		int numSize = 1; // 빙고판 크기
		int numRandom[] = new int[50]; // 랜덤값 저장 배열 
		int num = 0; // 중복 없는 랜덤값 비교하기 위한 임시 저장 변수
		int cnt = 0; // 랜덤값 넣기 위한 증가 변수
		int arr[][]; //빙고판
		
		//빙고판 만들기
		System.out.print("빙고판 크기 지정 : ");
		numSize = sc.nextInt();
		arr = new int[numSize][numSize]; //빙고판 생성
		//numRandom[numSize*numSize]; 크기 지정마다 가변되게 생성하는 법
		//랜덤값 생성
		for(int i = 0 ; i < numRandom.length ; i++) {
			numRandom[i] = (int)(Math.random()*100); // 좀더 효율적인 생성 (numSize*numSize) + 1 
			for(int j = 0; j < i ; j++) {
				if(numRandom[j] == num) {
					i--;
					break;
				}
			}
		}

	
		// 랜덤값 넣기 
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0; j < arr[i].length ; j++) {
				arr[i][j] = numRandom[cnt++];
			}
		}
		//빙고 게임
		System.out.println("======빙고게임 시작======");
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0; j < arr[i].length ; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}

		while(true) {
			System.out.print("숫자 선택:");
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
