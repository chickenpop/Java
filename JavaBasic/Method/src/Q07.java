import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws Exception {
	
		// com.test.java.question.method > "Q07.java"
		
		// 7번 문제 지하철
		
		// 메소드
		// 이름 : getTime 반환형 : int 매개변수 : int - 3개 (station, change, time)
		// getTime 기능 :	 역의 개수, 환승역 횟수, 시간대를 전달받아 총 걸리는 시간을 반환
		// 역간 소요 시간 : 2분
		// 환승 소요 시간 : N분 - 시간대따라 달라짐
		// 시간대 : 평상시 3분, 출근시 4분, 퇴근시 5분
		// 총 소요 시간 = 역 갯수 * 2 + 환승역 횟수 * 시간대 
		
		// 입력 객체 bf, import 선언, 예외처리 throw Exception
		// 역의 개수, 환승영 횟수, 시간대를 입력받을 int 변수 (station, change, time)
		// 총 소요 시간을 getTime 반환받을 int 변수 (totalTime)
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int station = 0, change = 0, time = 0;
		int totalTime = 0;
		
		// 입력 표시
		// 역의 개수 : 'station'
		// 환승역의 회수 : 'change'
		// 시간대(1. 평상시, 2.출근시, 3.퇴근시) : 'time' -> 삼항 연산자로 시간대에 입력받은 값에 따라 시간을 다르게 넣어줌
		// 시간대 : 평상시 3분, 출근시 4분, 퇴근시 5분
		System.out.print("역의 개수 : ");
		station = Integer.parseInt(reader.readLine());
		
		System.out.print("환승역의 회수 : ");
		change = Integer.parseInt(reader.readLine());
		
		System.out.print("시간대(1. 평상시, 2. 출근시, 3.퇴근시) : ");
		time = Integer.parseInt(reader.readLine()) == 1 ? 3 : time == 2 ? 4 : 5;
		
		// totalTime에 getTime(station, change, time) 반환 저장
		// 출력 표시, 총 소요 시간은 'totalTime'분입니다.
		
		totalTime = getTime(station, change, time);
		System.out.printf("총 소요시간은 %d분입니다.", totalTime);
		
	}
	
	// 메소드
	// 이름 : getTime 반환형 : int 매개변수 : int - 3개 (station, change, time)
	// getTime 기능 :	 역의 개수, 환승역 횟수, 시간대를 전달받아 총 걸리는 시간을 반환
	// 역간 소요 시간 : 2분
	// 환승 소요 시간 : N분 - 시간대따라 달라짐
	// 시간대 : 평상시 3분, 출근시 4분, 퇴근시 5분
	// 총 소요 시간 = 역 갯수 * 2 + 환승역 횟수 * 시간대 
	
	public static int getTime(int station, int change, int time) {
		
		return ( station * 2 ) + ( change * time );
		
	}
	
}
