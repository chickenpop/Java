//2742 기찍 N

import java.util.Scanner;

public class Ntniap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        for(int i = n; i > 0; i--){
            System.out.println(i);
        }

        in.close();
    }    
}
