// 1013 [기초-입출력] 정수 2개 입력받아 그대로 출력하기

import java.util.Scanner;

public class IO04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int num1 = 0, num2 = 0;

        num1 = in.nextInt();
        num2 = in.nextInt();
        
        System.out.println(num1+" "+num2);

        in.close();
    }
}
