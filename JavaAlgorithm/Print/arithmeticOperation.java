import java.util.Scanner;

public class arithmeticOperation {
    public static void main(String[] args) {
    //문제 공통 : 두 정수 A, B를 받아서 출력하는 프로그램
    // 1000 A+B
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    System.out.println(num1+num2);

    //1001 A-B
    System.out.println(num1-num2);

    //10998 A*B
    System.out.println(num1*num2);

    //1008 A/B
    //실제 정답과 출력값의 절대오차 또는 상대오차가 10^(-9)이하
    System.out.println((double)num1/num2);

    //10869 사칙연산
    System.out.println(num1+num2);
    System.out.println(num1-num2);
    System.out.println(num1*num2);
    System.out.println(num1/num2);
    System.out.println(num1%num2);

    sc.close();
    }
}
