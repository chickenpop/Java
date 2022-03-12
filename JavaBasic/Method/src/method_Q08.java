import java.io.BufferedReader;
import java.io.InputStreamReader;

public class method_Q08 {

	public static void main(String[] args) throws Exception {
		
		// com.test.java.question.method > "Q08.java"
		
		// 8번 문제 사과나무
		
		// 메소드
		// 이름 : getApple 반환형 : int 매개변수 : int - 2개 (sunny, foggy)
		// getApple 기능 : 사과가 성장하는 특정 시간이 흘렀을 때, 사과가 총 몇개 열리는지 구하는 메소드
		// 메소드 실행 시 사과 나무 길이 : 0cm
		// 맑은 날 성장률 : sunny * 5(cm)
		// 흐린 날 성장률 : foggy * 2(cm)
		// 사과가 처음 열리는 시점 : 100cm + 10cm
		// 처음 열린 이후 : 10cm마다
		
		// 입력 객체 bf, improt 선언, 예외처리 throws Exception
		// 특정 시간을 받을 int 변수 (suuny, foggy) 
		// getApple의 총 사과 갯수를 반환받을 int (appleCnt)
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int sunny = 0, foggy = 0;
		int appleCnt = 0;
		
		// 입력 표시, 맑은 날 : 'sunny'
		// 입력 표시, 흐린 날 : 'foggy'
		System.out.print("맑은 날 : ");
		sunny = Integer.parseInt(reader.readLine());
		
		System.out.print("흐린 날 : ");
		foggy = Integer.parseInt(reader.readLine());
		
		// appleCnt에 getApple(sunny, foggy) 반환받음
		// 출력 표시, 사과가 총 'appleCnt'개 열렸습니다.
		appleCnt = getApple(sunny, foggy);
		
		System.out.printf("사과 총 %d개 열렸습니다.\n", appleCnt);
		
		
	}
	
	// 메소드
	// 이름 : getApple 반환형 : int 매개변수 : int - 2개 (sunny, foggy)
	// getApple 기능 : 사과가 성장하는 특정 시간이 흘렀을 때, 사과가 총 몇개 열리는지 구하는 메소드
	// 메소드 실행 시 사과 나무 길이 : 0cm
	// 맑은 날 성장률 : sunny * 5(cm)
	// 흐린 날 성장률 : foggy * 2(cm)
	// 사과가 처음 열리는 시점 : 100cm + 10cm
	// 처음 열린 이후 : 10cm마다
	public static int getApple(int sunny, int foggy) {
		
		int appleLength = sunny * 5 + foggy * 2;
		int appleCnt = appleLength;
		appleCnt -= 100;
		appleCnt /= 10;
		
		return appleCnt;
	}
	
}
