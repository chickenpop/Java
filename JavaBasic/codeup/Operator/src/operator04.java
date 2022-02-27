// 1041 [기초-산술연산] 문자 1개 입력받아 다음 문자 출력하기

import java.util.Scanner;

public class operator04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();
        char ch = str.charAt(0);
        
        System.out.printf("%c", ch+1);

        in.close();
    }
}