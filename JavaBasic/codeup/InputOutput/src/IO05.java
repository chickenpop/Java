// 1014 [기초-입출력] 문자 2개 입력받아 그대로 출력하기

import java.util.Scanner;

public class IO05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1 = in.next();
        String str2 = in.next();

        System.out.printf("%c %c", str2.charAt(0), str1.charAt(0));

        in.close();
    }
}
