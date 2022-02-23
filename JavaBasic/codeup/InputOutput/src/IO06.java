// 1015 [기초-입출력] 실수 입력받아 둘째 자리까지 출력하기

import java.util.Scanner;

public class IO06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float f = 0.0f;
        
        f = in.nextFloat();
        System.out.printf("%.2f", f);

        in.close();
    }
}
