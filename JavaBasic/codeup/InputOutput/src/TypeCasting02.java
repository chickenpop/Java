// 1032 [기초-출력변환] 10진수 정수 1개 입력받아 16진수로 출력하기 1

import java.util.Scanner;

public class TypeCasting02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int hex = in.nextInt();

        System.out.printf("%x", hex);

        in.close();
    }
}