public class overload_Q01 {

	public static void main(String[] args) {

		// com.test.java.question.overload > "Q09.java"

		// 1번 문제 숫자의 합

		// 메소드 선언
		// 오버로딩으로 매개변수 1개부터 5개까지 제작
		// 이름 : sum 접근지정자: public 반환형 : void 매개변수 : int
		// sum 기능 : 인자의 합을 구하는 메소드

		// sum() 호출해서
		// 10
		// 10, 20
		// 10, 20, 30
		// 10, 20, 30, 40
		// 10, 20, 30, 40, 50
		sum(10);
		sum(10, 20);
		sum(10, 20, 30);
		sum(10, 20, 30, 40);
		sum(10, 20, 30, 40, 50);

	} // main

	// 메소드 선언
	// 오버로딩으로 매개변수 1개부터 5개까지 제작
	// 이름 : sum 접근지정자: public 반환형 : void 매개변수 : int
	// sum 기능 : 인자의 합을 구하는 메소드

	public static void sum(int num) {
		System.out.printf("%d = %d\n", num, num);
	}

	public static void sum(int num1, int num2) {
		System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
	}

	public static void sum(int num1, int num2, int num3) {
		System.out.printf("%d + %d + %d = %d\n", num1, num2, num3, (num1 + num2 + num3));
	}

	public static void sum(int num1, int num2, int num3, int num4) {
		System.out.printf("%d + %d + %d + %d = %d\n", num1, num2, num3, num4,
				(num1 + num2 + num3 + num4));
	}

	public static void sum(int num1, int num2, int num3, int num4, int num5) {
		System.out.printf("%d + %d + %d + %d + %d = %d\n", num1, num2, num3, num4, num5,
				(num1 + num2 + num3 + num4 + num5));
	}

}
