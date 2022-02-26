// 1027 [기초-입출력] 년월일 입력 받아 형식 바꿔 출력하기

import java.util.Scanner;

public class IO17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String ymd[] = in.nextLine().split("\\.");
        int year = Integer.parseInt(ymd[0]);
        int month = Integer.parseInt(ymd[1]);
        int days = Integer.parseInt(ymd[2]);

        System.out.printf("%02d-%02d-%04d", days, month, year);

        in.close();
    }
}