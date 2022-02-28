// 1053 [기초-논리연산] 참 거짓 바꾸기

import java.util.Scanner;

public class booleanOperator01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 0, result = 0;

        num = in.nextInt();

        result = num == 0 ? 1 : 0;
        System.out.println(result);
        
        in.close();
    }    
}
