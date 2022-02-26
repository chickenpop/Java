// 1030 [기초-데이터형] 정수 1개 입력받아 그대로 출력하기3

import java.util.Scanner;

public class Data03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        long LLI = in.nextLong();

        System.out.println(LLI);

        in.close();
    }
}