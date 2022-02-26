// 1022 [기초-입출력] 문장 1개 입력받아 그대로 출력하기

import java.util.Scanner;

public class IO12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String word[] = in.nextLine().split(" ");

        for(int i = 0; i < word.length; i++){
            System.out.print(word[i]+" ");
        }

        in.close();
    }
}