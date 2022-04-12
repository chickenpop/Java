import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda_T02 {

    public static void main(String[] args) {
        
        //Consumer + Consumser
        Consumer<String> c1 = s -> System.out.printf("안녕 %s야\n", s);
        Consumer<String> c2 = s -> System.out.printf("잘가 %s야\n", s);

        Consumer<String> c3 = c1.andThen(c2);

        c3.accept("홍길동");

        // Function + Function 
        // andThen을 사용할때 첫번째 Function의 매개변수와 두번째의 리턴값을 이용해 만든다
        // 첫번째 리턴값, 두번째의 매개변수 자료형이 일치해야함
        Function<Integer, String> f1 = num -> num > 0 ? "양수입니다." : num==0 ? "영(0)" : "음수이다.";
        Function<String, Integer> f2 = s -> s.length();

        Function<Integer, Integer> f3 = f1.andThen(f2);
        System.out.println(f3.apply(1)); 
        System.out.println(f3.apply(0)); 
        System.out.println(f3.apply(-1)); 

        // Predicate + Predicate
        // and, or, negate
        Predicate<Integer> p1 = num -> num % 2 == 0; // 2의 배수
        Predicate<Integer> p2 = num -> num % 5 == 0; // 5의 배수

        Predicate<Integer> p3 = p1.and(p2);
        System.out.println(p3.test(10)); // p1, p2  true and true > true
        System.out.println(p3.test(9));  // p1, p2  true and false > false

        Predicate<Integer> p4 = p1.or(p2);
        System.out.println(p4.test(10)); // p1, p2  true and true > true
        System.out.println(p4.test(4));  // p1, p2  true and false > true

        Predicate<Integer> p5 = p1.negate();
        System.out.println(p5.test(10)); // 2의 배수 !true


    }

}
