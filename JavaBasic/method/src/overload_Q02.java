public class overload_Q02 {

	public static void main(String[] args) {

		// com.test.java.question.overload > "Q02.java"

		// 2번 문제 직급

		// 메소드 선언
		// 직급 사원 > 대리 > 과장 > 부장
		// 사원, 사원~대리 >.. > 사원~부장 총 4개 제작
		// 이름 : position 접근지정자: public 반환형 : void 매개변수 : String
		// position 기능 : 인자로 받은 이름을 직급 순으로 출력

		// 호출 사원 홍길동, 대리 유재석, 과장 박명수, 부장 정형돈
		// 출력 표시, 직급 : 이름\n
		position("홍길동");
		position("홍길동", "유재석");
		position("홍길동", "유재석", "박명수");
		position("홍길동", "유재석", "박명수", "정형돈");

	} // main

	// 메소드 선언
	// 직급 사원 > 대리 > 과장 > 부장
	// 사원 (staff) 대리 (assistantManger) 과장 (manger) 부장 (generalManager)
	// 사원, 사원~대리 >.. > 사원~부장 총 4개 제작
	// 이름 : position 접근지정자: public 반환형 : void 매개변수 : String
	// position 기능 : 인자로 받은 이름을 직급 순으로 출력

	public static void position(String staff) {

		System.out.printf("사원 : %s\n", staff);
		System.out.println();

	}

	public static void position(String staff, String assistantManger) {

		System.out.printf("사원 : %s\n", staff);
		System.out.printf("대리 : %s\n", assistantManger);
		System.out.println();
	}

	public static void position(String staff, String assistantManger, String manger) {

		System.out.printf("사원 : %s\n", staff);
		System.out.printf("대리 : %s\n", assistantManger);
		System.out.printf("과장 : %s\n", manger);
		System.out.println();
	}

	public static void position(String staff, String assistantManger, String manger,
			String generalManager) {

		System.out.printf("사원 : %s\n", staff);
		System.out.printf("대리 : %s\n", assistantManger);
		System.out.printf("과장 : %s\n", manger);
		System.out.printf("부장 : %s\n", generalManager);
		System.out.println();
	}

}
