// 1054 [기초-논리연산] 둘 다 참일 경우만 참 출력하기

import java.util.Scanner;

public class booleanOperator02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = 0, num2 = 0, result = 0;
        num1 = in.nextInt();
        num2 = in.nextInt();

        result = num1 & num2;
        System.out.println(result);
        
        in.close();
    }    
}