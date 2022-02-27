// 1045 [기초-산술연산] 정수 1개 입력받아 자동 계산하기

import java.util.Scanner;

public class operator08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = 0, num2 = 0;

        num1 = in.nextInt();
        num2 = in.nextInt();

        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);
        System.out.printf("%.2f", (float)num1/num2);

        in.close();
    }
}