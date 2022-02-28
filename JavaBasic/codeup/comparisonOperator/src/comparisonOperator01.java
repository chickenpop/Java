// 1049 [기초-비교연산] 두 정수 입력받아 비교하기

import java.util.Scanner;

public class comparisonOperator01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = 0, num2 = 0;

        num1 = in.nextInt();
        num2 = in.nextInt();

        if(num1>num2) System.out.println(1);
        else System.out.println(0);

        in.close();
    }    
}