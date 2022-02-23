// 1019 [기초-입출력] 연월일 입력받아 그래도 출력하기

import java.util.Scanner;

public class IO09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time[];

        time = in.next().split("\\.");

        System.out.printf("%s.%2s.%2s", time[0], time[1], time[2]);

        in.close();
    }
}