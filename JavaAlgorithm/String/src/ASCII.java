// 11654 아스키 코드

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String stringCastChar = in.nextLine();
        char asciiChar = stringCastChar.charAt(0);
        System.out.println((int)asciiChar);
        in.close();
    }    
}
