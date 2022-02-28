// 1048 [기초-비트시프트연산] 한 번에 2의 거듭제곱 배로 출력하기

import java.util.Scanner;

public class shiftOperator02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double n = 0;
        int e = 0, en = 0;

        e = in.nextInt();
        n = in.nextInt();

        en = e*(int)Math.pow(2, n);
        System.out.printf("%d", en);

        in.close();
    }    
}