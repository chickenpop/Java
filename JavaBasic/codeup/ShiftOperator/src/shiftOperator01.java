// 1047 [기초-비트시프트연산] 정수 1개 입력받아 2배 곱해 출력하기

import java.util.Scanner;

public class shiftOperator01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 0;
        num = in.nextInt();

        System.out.printf("%d", num<<1);

        in.close();
    }    
}
