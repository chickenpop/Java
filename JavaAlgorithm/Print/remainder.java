//10430 나머지
import java.util.Scanner;

public class remainder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //세 정수 선언, 입력
        int num1, num2, num3;
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        System.out.println((num1+num2)%num3);
        System.out.println(((num1%num3) + (num2%num3))%num3);
        System.out.println((num1*num2)%num3);
        System.out.println(((num1%num3) * (num2%num3))%num3);
        in.close();
    }
}
