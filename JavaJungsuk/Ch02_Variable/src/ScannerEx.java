// 2-6

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("두자리 정수를 하나 입력해주세요.>");
        String input = in.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 :"+input);     // String
        System.out.printf("num=%d%n", num);        // int

        in.close();
    }    
}
