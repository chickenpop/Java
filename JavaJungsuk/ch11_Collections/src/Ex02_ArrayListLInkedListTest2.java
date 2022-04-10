import java.util.*;
public class Ex02_ArrayListLInkedListTest2 {

    public static void main(String[] args) {
        // 11-6
    
        ArrayList<Integer> a1 = new ArrayList<Integer>(1000000);
        LinkedList<Integer> l1 = new LinkedList<Integer>();

        // List에 요소 넣기 1000000
        add(a1);
        add(l1);

        // 요소의 접근 속도 테스트 10000만큼
        // 단순 요소 접근은 ArrayList가 더 빠름
        System.out.println("접근 시간 테스트");
        System.out.println("ArrayList : "+access(a1));  // 1 ms
        System.out.println("LinkedList : "+access(l1)); // 317 ms

    }

    public static void add(List<Integer> list){
        for(int i=0; i<1000000; i++) list.add(i);
    }

    public static long access(List<Integer> list){
        long start = System.currentTimeMillis();
        for(int i=0; i<10000; i++) list.get(i);
        long end = System.currentTimeMillis();
        return end-start;
    }

}
