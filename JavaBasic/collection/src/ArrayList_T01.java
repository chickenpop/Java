import java.util.ArrayList;

public class ArrayList_T01 {
    
    public static void main(String[] args) {
        
        // ArrayList 연습
        // ArrayList 메소드 사용

        // 초기 배열 길이를 정해줌
        // 배열이 길이를 정해주면 불필요한 배열크기 변화과정을 방지
        ArrayList<Integer> list = new ArrayList<Integer>(15); 

        for(int i=0; i<10; i++){
            list.add(i+1);
        }

        // 향상된 for문으로 출력
        for(Integer n : list){
            System.out.print(n + " ");
        }
        System.out.println();

        // toString 정의되어있음 [ index[0], index[1] .. index[lastId] ]
        System.out.println(list);

        // 수정하기
        list.set(2, 30);

        // size()는 요소의 개수
        list.set(list.size()-1, list.size()*10); // 현재는 인덱스 9값이 100
        System.out.println(list); // [1, 2, 30, 4, 5, 6, 7, 8, 9, 100]

        // 요소 삽입하기
        list.add(2, 20);
        System.out.println(list); // [1, 2, 20, 30, 4, 5, 6, 7, 8, 9, 100]  

        // 요소 검색
        System.out.println(list.indexOf(100)); // 요소값이 100이 있는 경우 인덱스값을 보여줌
        System.out.println(list.contains(20)); // 요소값 중 20이 있으면 true, 없으면 false

        // 초기화
        // isEmpty와 size를 통해 빈배열 확인
        list.clear();
        System.out.println(list.isEmpty()); // true
        System.out.println(list.size());    // 0

        // ArrayList 배열
        // 2차원 ArrayList에 1차원 ArrayList 생성해서 값넣고 추가하기
        ArrayList<ArrayList<Integer>> mlist = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list2.add(10);
        list2.add(20);
        
        mlist.add(list1);
        mlist.add(list2);

        System.out.println(mlist);

    }

}
