public class String_Q05 {

	public static void main(String[] args) {
		
		// 5번 문제 단어 횟수 세기
		
		// 변수
		String content = "안녕~ 길동아~ 잘가~ 길동아~";
		String word = "길동";
		
		int id = 0;
		int cnt = 0;
		
		// 특정 단어 찾기
		while(id != -1) {
			id = content.indexOf(word, id);
			if(id >= 0) {
				cnt++;
				id++;
			}
		}	
		System.out.printf("\'%s\'을 총 %d회 발견했습니다.\n", word, cnt);
	}
	
}






