// 1037 [기초-출력변환] 정수 입력받아 아스키 문자로 출력하기

import java.util.Scanner;

public class TypeCasting07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int asciiInt = in.nextInt();
        char asciiChar = (char)asciiInt;

        System.out.println(asciiChar);
        
        in.close();
    }
}