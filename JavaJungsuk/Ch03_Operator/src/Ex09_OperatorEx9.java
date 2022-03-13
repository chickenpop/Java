// 3-9

public class Ex09_OperatorEx9 {
    public static void main(String[] args) {
        
        
        long a = 1_000_000 * 1_000_000;  // 1백만(int) * 1백만(int)
        long b = 1_000_000 * 1_000_000L; // 1백만(int) * 1백만(long)

        // int형 * int형은 저장하는 장소가 long이여도 이미 연산은 int형이라 오버플로우 발생
        System.out.println("a="+a);
        System.out.println("b="+b);

    }

}