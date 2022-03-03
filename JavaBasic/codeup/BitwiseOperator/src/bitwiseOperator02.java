// 1060 [기초-비트단위논리연산] 비트단위로 AND 하여 출력하기

import java.util.Scanner;

public class bitwiseOperator02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(num1 & num2);   // AND 연산자 : &
        
        in.close();
    }    
}
