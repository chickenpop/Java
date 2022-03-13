// 3-11

public class Ex11_OperatorEx11 {

    public static void main(String[] args) {
     
        // 문자끼리도도 사칙연산이 가능하다
        char a = 'a';
        char d = 'd';
        char zero = '0';
        char two = '2';

        System.out.printf("'%c' - '%c' = %d\n", d, a, d - a);
        System.out.printf("'%c' - '%c' = %d\n", two, zero, two - zero);
        System.out.printf("'%c' = %d\n", a, (int)a);
        System.out.printf("'%c' = %d\n", d, (int)d);
        System.out.printf("'%c' = %d\n", two, (int)two);
        System.out.printf("'%c' = %d\n", zero, (int)zero);

    }

}
