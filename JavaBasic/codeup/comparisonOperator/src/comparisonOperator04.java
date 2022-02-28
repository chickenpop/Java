// 1052 [기초-비교연산] 두 정수 입력받아 비교하기 4

import java.util.Scanner;

public class comparisonOperator04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = 0, num2 = 0, result = 0;

        num1 = in.nextInt();
        num2 = in.nextInt();

        result = (num1 != num2) ? 1 : 0;

        System.out.println(result);

        in.close();
    }    
}