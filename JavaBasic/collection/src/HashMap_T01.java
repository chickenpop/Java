import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap_T01 {
 
    public static void main(String[] args) {
    
        HashMap<String, Integer> map = new HashMap<String, Integer>(15); // 길이 초기 설정 

        // 과일, 과일가격 가정
        map.put("사과", 500);
        map.put("바나나", 600);
        map.put("포도", 700);
        map.put("배", 700);
        map.put("딸기", 800);
        map.put("오렌지", 900);

        // 요소 크기
        System.out.println(map.size());

        // 요소 읽기, value가 출력됨
        System.out.println(map.get("사과")); 
        System.out.println(map.get("딸기"));
        System.out.println(map.get("포도"));
        System.out.println();
        
        // 요소 수정
        System.out.println(map.get("포도"));
        map.put("포도", 600);
        System.out.println(map.get("포도"));

        // 요소 검색, 키와 값 둘다 검색가능
        System.out.println(map.containsKey("배")); // true
        System.out.println(map.containsKey("귤")); // false

        System.out.println(map.containsValue(500));  // true
        System.out.println(map.containsValue(5000)); // false
        System.out.println();
        System.out.println();

        // 요소 삭제
        System.out.println(map.size());
        map.remove("사과");
        System.out.println(map.size());
        System.out.println();

        // Map 탐색하기
        Set<String> set = map.keySet();
        Iterator<String> iter = set.iterator();

        while(iter.hasNext()){
            String key = iter.next();
            System.out.printf("key %2s  :  value %d\n", key, map.get(key));
        }

    }

}
