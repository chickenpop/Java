//2588 곱셈

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);

        //세자리 2개의 정수 선언, 입력
        int num1, num2;
        num1 = in.nextInt();
        num2 = in.nextInt();

        //num2 100의 자리수, 10의 자리수, 1의 자리수
        int num2_100 = num2 / 100;
        int num2_10 = (num2 - num2_100*100) / 10; 
        int num2_1 = (num2 - num2_100*100) - num2_10*10;

        // num1 * num2의 n의 자리수
        System.out.println(num1*num2_1);
        System.out.println(num1*num2_10);
        System.out.println(num1*num2_100);
        System.out.println(num1*num2);

        in.close();
    }
}
