// 1024 [기초-입출력] 단어 1개 입력받아 부분별로 출력하기

import java.util.Scanner;

public class IO14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String fl = in.nextLine();
        String flStr[] = fl.split("");

        for(int i = 0; i < fl.length(); i++){
            System.out.println("\'"+flStr[i]+"\'");
        }
        
        in.close();
    }
}