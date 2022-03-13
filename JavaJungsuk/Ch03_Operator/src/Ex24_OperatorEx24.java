// 3-24

public class Ex24_OperatorEx24 {
    
    public static void main(String[] args) {
        
        int x = 0;
        char ch = ' ';

        // 계산의 연산식 결과 확인
        x = 15;
        System.out.printf("x = %2d, 10 < x && x < 20 = %b\n", x, 10 < x && x < 20);

        x = 6;
        System.out.printf("x = %2d, x%%2==0 || x%%3 == 0 && x%%6 != 0 = %b\n", x, x%2==0 || x%3 == 0 && x%6 != 0);
        
        System.out.printf("x = %2d, (x%%2==0 || x%%3 == 0) && x%%6 != 0 = %b\n", x, (x%2==0 || x%3 == 0) && x%6 != 0);

        // 숫자, 소문자, 대문자 범위 안에 들어가는 지 확인
        ch = '1';
        System.out.printf("ch = '%c', '0' <= ch && ch <= '9' = %b\n", ch, '0' <= ch && ch <= '9');
    
        ch = 'a';
        System.out.printf("ch = '%c', 'a' <= ch && ch <= 'z' = %b\n", ch, 'a' <= ch && ch <= 'z');

        ch = 'A';
        System.out.printf("ch = '%c', 'A' <= ch && ch <= 'Z' = %b\n", ch, 'A' <= ch && ch <= 'Z');

        // 같은 문자(대소문자 구분없이) 확인
        ch = 'q';
        System.out.printf("ch = '%c', 'q' == ch || ch == 'Q' = %b\n", ch, 'q' == ch || ch == 'Q');
    }

}
