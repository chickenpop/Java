import java.util.Scanner;

public class Ex01_FlowEx2 {
    
    public static void main(String[] args) {
        
        int input;

        System.out.print("숫자를 하나 입력하세요.>");

        Scanner in = new Scanner(System.in);
        String tmp = in.nextLine();
        input = Integer.parseInt(tmp);

        if(input == 0){
            System.out.println("입력하신 숫자는 0입니다.");
        }

        if(input != 0)
            System.out.println("입력하신 숫자는 0이 아닙니다.");
            System.out.printf("입력하신 숫자는 %d입니다.\n", input); // if {}안에 속하지 않아 원치 않는 결과를 만들 수 있음

        in.close();
    } // main

}
