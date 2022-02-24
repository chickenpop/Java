// 1019 [기초-입출력] 연월일 입력받아 그래도 출력하기

import java.util.Scanner;

public class IO09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String yymmdd[];

        yymmdd = in.next().split("\\.");

        int yy = Integer.valueOf(yymmdd[0]);
        int mm = Integer.valueOf(yymmdd[1]);
        int dd = Integer.valueOf(yymmdd[2]);

        System.out.printf("%04d.%02d.%02d", yy, mm, dd);

        in.close();
    }
}