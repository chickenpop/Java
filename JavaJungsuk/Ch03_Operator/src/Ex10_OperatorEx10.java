// 3-10

public class Ex10_OperatorEx10 {

    public static void main(String[] args) {
        
        int a = 1000000;

        // 오버플로우 된 연산결과로 이어서 연산하면 원하는 값을 얻을 수 없음
        int result1 = a * a / a;
        // 나누기 연산을 먼저 이용해 오버플로우되지 않아 원하는 값을 얻음
        int result2 = a / a * a;

        // 연산 순서에 따라 다른 결과를 얻을 수 있음
        System.out.printf("%d * %d / %d = %d\n", a, a, a, result1);
        System.out.printf("%d / %d * %d = %d\n", a, a, a, result2);
    }

}
