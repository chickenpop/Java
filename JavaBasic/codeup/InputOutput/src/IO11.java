// 1021 [기초-입출력] 단어 1개 입력받아 그대로 출력하기

import java.util.Scanner;

public class IO11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String word = in.next();

        System.out.println(word);

        in.close();
    }
}