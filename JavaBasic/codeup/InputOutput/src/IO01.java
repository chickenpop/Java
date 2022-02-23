// 1010 [기초-입출력] 정수 1개 입력받아 그대로 출력하기

import java.util.Scanner;

public class IO01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        num = in.nextInt();
        System.out.println(num);

        in.close();
    }
}
