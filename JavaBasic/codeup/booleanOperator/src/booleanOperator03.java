// 1055 [기초-논리연산] 하나라도 참이면 참 출력하기

import java.util.Scanner;

public class booleanOperator03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = 0, num2 = 0;

        num1 = in.nextInt();
        num2 = in.nextInt();

        System.out.println(num1|num2);
        
        in.close();
    }    
}