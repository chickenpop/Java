import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Iteration_Q02 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.iteration > "Q02.java"
		
		// 2번 문제 숫자 범위 출력 
		
		// 객체, 변수 생성
		// bf, 예외처리 Exception
		// 시작숫자, 종료숫자, 증감치 int(startNum, endNum, plusNum)
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int startNum = 0;
		int endNum = 1;
		int plusNum = 1;
		
		// 입력
		// 시작(종료) 숫자 : 
		// 증감치 :
		System.out.print("시작 숫자 : ");
		startNum = Integer.parseInt(reader.readLine());
		System.out.print("종료 숫자 : ");
		endNum = Integer.parseInt(reader.readLine());
		System.out.print("증감치 : ");
		plusNum = Integer.parseInt(reader.readLine());
		
		// 이름 : getNum 접근지정자: public 반환형 : void 매개변수 : int
		// getNum 기능 : 시작숫자, 종료숫자, 증감치를 받아 숫자를 순차적 처리
		// 숫자만 출력
		getNum(startNum, endNum, plusNum);
		
	}

	public static void getNum(int startNum, int endNum, int plusNum) {
		if(startNum<=endNum) {
			for(int i=startNum; i<=endNum; i+=plusNum) {
				System.out.println(i);
			}
		} else {
			for(int i=startNum; i>=endNum; i+=plusNum) {
				System.out.println(i);
			}
		}
	}

}
