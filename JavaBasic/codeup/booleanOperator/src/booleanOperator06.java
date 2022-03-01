// 1058 [기초-논리연산] 둘 다 거짓일 경우만 참 출력하기

import java.util.Scanner;

public class booleanOperator06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = 0, num2 = 0;

        num1 = in.nextInt();
        num2 = in.nextInt();

        if((num1 == 0 || num2 == 0)&& num1 == num2) System.out.println(1);
        else System.out.println(0);
        in.close();
    }    
}