// 1011 [기초-입출력] 문자 1개 입력받아 그대로 출력하기

import java.util.Scanner;

public class IO02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "";

        str = in.next();
        System.out.println(str.charAt(0));

        in.close();
    }
}
