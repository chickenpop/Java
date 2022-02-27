// 1044 [기초-산술연산] 정수 1개 입력받아 1 더해 출력하기

import java.util.Scanner;

public class operator07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long num = 0L;
        num = in.nextLong();

        System.out.printf("%d", ++num);

        in.close();
    }
}