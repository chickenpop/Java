// 1040 [기초-산술연산] 정수 1개 입력받아 부호 바꿔 출력하기 

import java.util.Scanner;

public class operator03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 0;
        num = in.nextInt();

        System.out.printf("%d", - num);

        in.close();
    }
}