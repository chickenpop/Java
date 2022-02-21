// 2675 문자열 반복

import java.util.Scanner;

public class alphanumeric {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Testcase = 0;
        int n = 0;
        String alphanm = "";

        Testcase = in.nextInt();
        for(int i = 0; i < Testcase; i++){
            n = in.nextInt();
            alphanm = in.next();

            for(int j = 0; j < alphanm.length(); j++){
                for(int k = 0; k < n; k++){
                    System.out.print(alphanm.charAt(j));
                }
            }
            System.out.println();
        }
        in.close();
    }
}
