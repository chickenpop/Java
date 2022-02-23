// 1018 [기초-입출력] 시간 입력받아 그대로 출력하기

import java.util.Scanner;

public class IO08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time[];

        time = in.next().split(":");

        System.out.printf("%s:%s", time[0], time[1]);

        in.close();
    }
}