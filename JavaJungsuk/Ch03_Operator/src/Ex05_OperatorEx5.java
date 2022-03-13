// 3-5

public class Ex05_OperatorEx5 {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d\n", a, b, a+b);
        System.out.printf("%d - %d = %d\n", a, b, a-b);
        System.out.printf("%d * %d = %d\n", a, b, a*b);
        System.out.printf("%d / %d = %d\n", a, b, a/b);
        System.out.printf("%d / %d = %f\n", a, b, (float)a/b);

        // 무한대
        //System.out.printf("%d / %d = %d\n", a, b, a/0);           정수형을 0으로 나눌 수 없다
        System.out.printf("%d / %d = %f\n", a, b, (float)a/0.0); // 실수형은 0으로 나누면 무한대 = Infinity가 출력


    }

}
