// 1042 [기초-산술연산] 정수 2개 입력받아 나눈 몫 출력하기

import java.util.Scanner;

public class operator05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 0, b = 0;
        a = in.nextInt();
        b = in.nextInt();

        System.out.printf("%d", a/b);

        in.close();
    }
}