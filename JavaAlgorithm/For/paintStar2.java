//2439 별 찍기-2

import java.util.Scanner;

public class paintStar2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int star = in.nextInt();
        
        for(int i = 0; i < star; i++){
            for(int j = star - i - 1; j > 0; j--){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        in.close();
    }    
}
