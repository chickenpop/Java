import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Iteration_Q01 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.iteration > "Q01.java"
		
		// 1번 문제 반복 인사
		
		// 이름 : hello 접근지정자: public 반환형 : void 매개변수 : String, int
		// hello 기능 : 사용자 이름과 인사할 횟수만큼 출력
		
		// 객체, 변수 생성
		// bf, 예외처리
		// name(사용자 이름) String
		// cnt(인사 횟수) int
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name = "";
		int cnt = 0;
		
		// 입력
		// 이름(횟수) :
		System.out.print("이름 : ");
		name = reader.readLine();
		System.out.print("횟수 : ");
		cnt = Integer.parseInt(reader.readLine());
		
		
		// 메소드 출력
		hello(name, cnt);
		
		
		
	}
	public static void hello(String name, int helloCnt) {
		for(int i=0; i<helloCnt; i++) {
			System.out.printf("%s님 안녕하세요~\n", name);
		}
	}
	

}
