// 1029 [기초-데이터형] 실수 1개 입력받아 그대로 출력하기2

import java.util.Scanner;

public class Data02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double d = in.nextDouble();
        
        System.out.printf("%.11f", d);

        in.close();
    }
}