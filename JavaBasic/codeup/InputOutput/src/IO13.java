// 1023 [기초-입출력] 실수 1개 입력받아 부분별로 출력하기

import java.util.Scanner;

public class IO13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String fl = in.nextLine();
        String flStr[] = fl.split("\\.");

        System.out.print(flStr[0]+"\n"+flStr[1]);
        in.close();
    }
}