// 3-8

public class Ex08_OperatorEx8 {
    public static void main(String[] args) {
        
        int a = 1_000_000; // 1백만
        int b = 2_000_000; // 2백만

        long c = a * b;    // int * int = int형 연산 결과가 저장됨
        // long으로 지정했지만 원하는 값을 얻을 수 없음
        System.out.println(c);

        // 형변환을 해주면 원하는 값을 얻을 수 있음
        c = (long) a * b;
        System.out.println(c);

    }

}