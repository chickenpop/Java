public class Collection_Q01 {

	public static void main(String[] args) {
		/*

			Collection ArrayList를 비슷하게 구현해본 MyArrayList 클래스
			테스트 파일

		*/
		//배열 생성
		MyArrayList list = new MyArrayList();

		//추가
		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");


		//읽기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2)); 
		// ArrayIndexOutOfBoundsException : list
		// IndexOutOfBoundsException : arrayList

		//개수
		System.out.println(list.size());

		//탐색 + 읽기
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}
		System.out.println();
		//수정
		list.set(0, "우하하");
		System.out.println(list.get(0));
		System.out.println();

		//삭제
		list.remove(1);
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}
		System.out.println();

		//삽입
		list.add(1, "호호호");
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}

		//검색
		if (list.indexOf("홍길동") > -1) {
		      System.out.println("홍길동 있음");
		} else {
		      System.out.println("홍길동 없음");
		}

		//초기화
		list.clear();
		System.out.println(list.size());
	}

}
