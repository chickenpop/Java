// 1012 [기초-입출력] 실수 1개 입력받아 그대로 출력하기

import java.util.Scanner;

public class IO03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float f = 0f;

        f = in.nextFloat();
        System.out.println(String.format("%.6f", f));

        in.close();
    }
}
