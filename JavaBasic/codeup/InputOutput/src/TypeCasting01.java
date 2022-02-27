// 1031 [기초-출력변환] 10진수 정수 1개 입력받아 8진수로 출력하기 1 

import java.util.Scanner;

public class TypeCasting01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int octal = in.nextInt();

        System.out.printf("%o", octal);

        in.close();
    }
}