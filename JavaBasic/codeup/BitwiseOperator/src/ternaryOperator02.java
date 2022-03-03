// 1064 [기초-삼항연산] 정수 3개 입력받아 가장 작은 수 출력하기

import java.util.Scanner;

public class ternaryOperator02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        System.out.println((num1 < num2 ? num1 : num2) > num3 ? num3 : (num1 < num2 ? num1 : num2));

        in.close();
    }
}
