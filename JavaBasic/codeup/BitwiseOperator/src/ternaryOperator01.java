// 1063 [기초-삼항연산] 두 정수 입력받아 큰 수 출력하기

import java.util.Scanner;

public class ternaryOperator01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println(num1 > num2 ? num1 : num2);

        in.close();
    }
}
