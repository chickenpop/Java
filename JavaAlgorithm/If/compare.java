//1330 두 수 비교하기

import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int A = in.nextInt();
        int B = in.nextInt();

        if (A > B){
            System.out.println(">");
        } else if (A == B){
            System.out.println("==");
        } else {
            System.out.println("<");
        }
        
        in.close();
    }    
}