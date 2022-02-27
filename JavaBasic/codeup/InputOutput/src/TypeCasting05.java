// 1035 [기초-출력변환] 16진수 정수 1개 입력받아 8진수로 출력하기

import java.util.Scanner;

public class TypeCasting05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String number = in.next();
        int hex = Integer.valueOf(number, 16); // 16진수

        System.out.printf("%o", hex);          // %o 8진수 출력

        in.close();
    }
}