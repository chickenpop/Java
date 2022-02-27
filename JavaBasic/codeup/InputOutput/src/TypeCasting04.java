// 1034 [기초-출력변환] 8진수 정수 1개 입력받아 10진수로 출력하기

import java.util.Scanner;

public class TypeCasting04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String number = in.next();
        int oct = Integer.valueOf(number, 8); // 8진수

        System.out.printf("%d", oct);

        in.close();
    }
}