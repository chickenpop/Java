// 1038 [기초-산술연산] 정수 2개 입력받아 합 출력하기 1

import java.util.Scanner;

public class operator01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long num1 = 0L, num2 = 0L;

        num1 = in.nextLong();
        num2 = in.nextLong();

        System.out.println(num1+num2);

        in.close();
    }
}
