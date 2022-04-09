// package

import java.util.HashSet;
import java.util.Iterator;

public class Set_T01 {

	public static void main(String[] args) {
		
		// Set
		HashSet<String> set = new HashSet<String>();
		
		// 요소 추가
		// 중복값 허용하지 않음
		set.add("사과");
		set.add("딸기");
		set.add("바나나");
		set.add("포도");
		set.add("배");
		set.add("배");
		set.add("배");

		System.out.println(set.size()); // 5
		
		// 요소 삭제
		set.remove("배");
		System.out.println(set.size()); // 4
		
		// 요소 검색
		System.out.println(set.contains("딸기")); 	// true
		System.out.println(set.contains("배"));   	// false
		System.out.println();
		
		// 요소 접근
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
	}
	
}
