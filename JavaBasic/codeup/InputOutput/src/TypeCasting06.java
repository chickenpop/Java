// 1036 [기초-출력변환] 영문자 1개 입력받아 10진수로 출력하기

import java.util.Scanner;

public class TypeCasting06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String ascii = in.next();
        char asciiChar = ascii.charAt(0);
        int asciiInt = asciiChar;
        
        System.out.printf("%d", asciiInt);
        
        in.close();
    }
}