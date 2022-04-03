public class Collection_Q05 {

	public static void main(String[] args) {
		
		//배열 생성
		MySet list = new MySet();

		//추가
		// 배열 길이 확인 중복없이 최소 5개 요소 추가 + toString()으로 확인
		// 중복값 확인 : 하하하 두개 다 열기
		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");
		//list.add("하하하");
		list.add("호호호");
		list.add("테스트");
		System.out.println(list.toString());
		
		//개수
		System.out.println(list.size());
		
		//삭제
		list.remove("아무개");
		
		//개수
		System.out.println(list.size());
		
		//탐색 + 읽기
		while (list.hasNext()) {
			System.out.println(list.next());
		}
		
		//초기화
		list.clear();
		System.out.println(list.size());
		//System.out.println(list.toString());
		
		
	}
	
}
