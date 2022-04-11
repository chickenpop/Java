import java.util.Calendar;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda_T01 {
    
    public static void main(String[] args) {
        
        // Consumer<T>
        // accept
        Consumer<Integer> c1 = num -> System.out.printf("매개변수는 %d입니다.\n", num);
        c1.accept(10);

        Calendar c = Calendar.getInstance();
        c.set(2022, 3, 11);
        Consumer<Calendar> c2 = calendar -> System.out.printf("%tF\n", calendar);
        c2.accept(c);

        // Supplier<R>
        // get
        Supplier<Integer> s1 = () -> (int)(Math.random()*10)+1;
        System.out.println(s1.get());

        Supplier<String> s2 = () -> "안녕하세요";
        System.out.println(s2.get());

        // Function<T, R>
        // BiFunciont<T, U, R>
        // apply

        Function<Integer, String> f1 = num -> num > 0 ? "양수" : (num == 0 ? "영(0)" : "음수");
        System.out.println(f1.apply(1));
        System.out.println(f1.apply(0));
        System.out.println(f1.apply(-1));

        BiFunction<Integer, Integer, String> f2 = (num1, num2) -> num1 > num2 ? "num1이 더 크다" : "num2가 더 크다";
        System.out.println(f2.apply(10, 20));

        // Operator<R>
        // Function 하위
        // apply
        BinaryOperator<Integer> b1 = (num1, num2) -> num1*num2;
        System.out.println(b1.apply(10, 20));


        // Predicate<T>, return값으로 Boolean을 돌려줌 
        // Function 하위
        // test
        Predicate<Integer> p1 = num -> num % 2 == 0;
        System.out.println(p1.test(2));
        System.out.println(p1.test(1));
    
    }


}
