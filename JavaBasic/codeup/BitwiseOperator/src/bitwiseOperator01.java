// 1059 [기초-비트단위논리연산] 비트단위로 NOT 하여 출력하기

import java.util.Scanner;

public class bitwiseOperator01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        System.out.println(~num);   // NOT 연산자 : ~ (2의 보수가 저장)
        
        in.close();
    }    
}
