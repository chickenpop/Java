public class overload_Q03 {

	public static void main(String[] args) {

		// com.test.java.question.overload > "Q03.java"

		// 3번 문제 양수 갯수

		// 메소드 선언
		// 양수의 갯수를 카운드하는 메소드 1~5개까지
		// 이름 : positive 접근지정자: public 반환형 : int 매개변수 : int
		// positive 기능 : 매개변수 중 양수가 몇개인지 파악해서 반환하는 메소드

		// positive 반환값을 저장할 int (count)
		int count = 0;
		// 호출, count = positive(10);
		// 10
		// 10, 20
		// 10, 20, -30
		// 10, 20, -30, 40
		// 10, 20, -30, 40, 50

		// 출력 표시, 양수 : 'count'개
		count = positive(10);
		System.out.printf("양수 : %d개\n", count);

		count = positive(10, 20);
		System.out.printf("양수 : %d개\n", count);

		count = positive(10, 20, -30);
		System.out.printf("양수 : %d개\n", count);

		count = positive(10, 20, -30, 40);
		System.out.printf("양수 : %d개\n", count);

		count = positive(10, 20, -30, 40, 50);
		System.out.printf("양수 : %d개\n", count);



	} // main

	// 메소드 선언
	// 양수의 갯수를 카운드하는 메소드 1~5개까지
	// 이름 : positive 접근지정자: public 반환형 : int 매개변수 : int
	// positive 기능 : 매개변수 중 양수가 몇개인지 파악해서 반환하는 메소드

	public static int positive(int n1) {
		return n1 > 0 ? 1 : 0;
	}

	public static int positive(int n1, int n2) {
		int count = 0;
		count += n1 > 0 ? 1 : 0;
		count += n2 > 0 ? 1 : 0;
		return count;
	}

	public static int positive(int n1, int n2, int n3) {
		int count = 0;
		count += n1 > 0 ? 1 : 0;
		count += n2 > 0 ? 1 : 0;
		count += n3 > 0 ? 1 : 0;
		return count;
	}

	public static int positive(int n1, int n2, int n3, int n4) {
		int count = 0;
		count += n1 > 0 ? 1 : 0;
		count += n2 > 0 ? 1 : 0;
		count += n3 > 0 ? 1 : 0;
		count += n4 > 0 ? 1 : 0;
		return count;
	}

	public static int positive(int n1, int n2, int n3, int n4, int n5) {
		int count = 0;
		count += n1 > 0 ? 1 : 0;
		count += n2 > 0 ? 1 : 0;
		count += n3 > 0 ? 1 : 0;
		count += n4 > 0 ? 1 : 0;
		count += n5 > 0 ? 1 : 0;
		return count;
	}

}
