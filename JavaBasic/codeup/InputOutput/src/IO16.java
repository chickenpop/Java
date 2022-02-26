// 1026 [기초-입출력] 시분초 입력받아 분만 출력하기

import java.util.Scanner;

public class IO16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String hms[] = in.nextLine().split(":");
        int min = Integer.parseInt(hms[1]);
        
        System.out.printf("%d", min);

        in.close();
    }
}