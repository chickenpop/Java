//10950 A+B-3

import java.util.Scanner;

public class AplusBminus3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //두 정수를 테스트 케이스 수만큼 입력 받고 더한 값을 출력
        int testCase = in.nextInt();
        int a, b;
        for(int i = 0; i < testCase; i++){
            a = in.nextInt();
            b = in.nextInt();

            System.out.println(a+b);
        }

        in.close();
    }
}
