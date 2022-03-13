// 3-25

import java.util.Scanner;

public class Ex25_OperatorEx25 {
    
    public static void main(String[] args) {
        
        // 입력받은 문자가 숫자인지 영문자인지 확인 그외 값은 아무것도 출력하지 않음
        Scanner in = new  Scanner(System.in);

        char ch = ' ';

        System.out.print("문자를 하나 입력하세요.>");

        String input = in.nextLine();
        ch = input.charAt(0);

        if('0' <= ch && ch <= '9'){
            System.out.printf("입력하신 문자는 숫자입니다.\n");
        }

        if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')){
            System.out.println("입력하신 문자는 영문자입니다.\n");
        }

        in.close();

    }

}
