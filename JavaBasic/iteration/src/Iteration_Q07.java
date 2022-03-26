public class Iteration_Q07 {

	public static void main(String[] args) {

		// com.test.java.question.iteration > "Q07.java"
		
		// 7번 문제 숫자 합 구하기
		
		// 누적값이 1000이 넘어가면 루프 종료(무한루프)
		
		// 출력 
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 
		// + 11 + 12 + 13 + 14 + 15 + 16 + 17 + 18 + 19 + 20 + 21 + 22
		// + 23 + 24 + 25 + 26 + 27 + 28 + 29 + 30 + 31 + 32 + 33 + 34
		// + 35 + 36 + 37 + 38 + 39 + 40 + 41 + 42 + 43 + 44 + 45 = 1035
		int sum = 0;
		
		for(int num=1;;num++) {
			sum += num;
			if(sum>=1000) {
				System.out.printf("%d = %d\n", num, sum);
				break;
			}
			if(num % 10 == 0) {
				System.out.printf("%d\n+ ", num);
			}
			else {
				System.out.printf("%d + ", num);
			}
		}
		
	}

}
