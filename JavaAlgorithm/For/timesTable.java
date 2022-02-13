//2739구구단

import java.util.Scanner;

public class timesTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //몇 단을 출력할것인지 입력 ex) 2
        int dan = in.nextInt();
        for(int i = 1; i < 10; i++){
            System.out.println(dan+" * "+i+" = "+dan*i);
        }

        in.close();
    }
}
