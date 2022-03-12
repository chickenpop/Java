import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws Exception {
		
		// com.test.java.question.method > "Q06.java"
		
		// 6번 문제 성적처리
		
		// 메소드 선언
		// 이름 : test 반환형 : String 매개변수 : int - 3개
		// test 기능 : kor(국어), eng(영어), math(수학)의 평균 점수 60점 이상 "합격"이고, 60점 미만 또는 한 과목이상이 40점 미만이면 "불합격"
		
		// 입력을 위한 BufferedReader(bf) 객체 생성, import문, 예외처리 작성 - throws Exception
		// 점수를 입력받기 위한 int변수 - 3개(kor, eng, math)
		// test 메소드 결과를 반환받기 위한 String 변수 - result
		// 입력을 받아야할 곳 표시 , 'int변수의 한국어' : ex) kor -> 국어 : 
		// 국어, 영어, 수학 순으로 입력
		// 입력 표시에 맞는 int변수 <- bf 입력 받고 바로 형변환
		// test(kor, eng, math) 결과 result에 저장
		// result 결과, 'result'입니다. 형태로 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int kor = 0, eng = 0, math = 0;
		String result = "";
		
		System.out.print("국어 : ");
		kor = Integer.parseInt(reader.readLine());
		System.out.print("영어 : ");
		eng = Integer.parseInt(reader.readLine());
		System.out.print("수학 : ");
		math = Integer.parseInt(reader.readLine());
		
		result = test(kor, eng, math);
		System.out.printf("%s입니다.\n", result);
	}
	
	
	// 메소드 선언
	// 이름 : test 반환형 : String 매개변수 : int - 3개
	// test 기능 : kor(국어), eng(영어), math(수학)의 평균 점수 60점 이상 "합격"이고, 60점 미만 또는 한 과목이상이 40점 미만이면 "불합격"
	
	public static String test (int kor, int eng, int math) {
		
		String result = ( (kor+eng+math) / 3 ) < 60 ? "불합격" : kor > 40 && eng > 40 && math > 40 ? "합격" : "불합격";
		
		return result;
	}
	
}
