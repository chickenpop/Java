// 1046 [기초-산술연산] 정수 3개 입력받아 합과 평균 출력하기

import java.util.Scanner;

public class operator09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = 0, num2 = 0, num3 = 0, sum = 0;

        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        sum = num1 + num2 + num3;
        System.out.printf("%d\n", sum);
        System.out.printf("%.1f", sum/3.0);
        in.close();
    }
}