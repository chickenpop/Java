//11022 A+B-8

import java.util.Scanner;

public class AplusBminus8 {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int testCase = in.nextInt();
    int a;
    int b;
    int cnt = 1;
    while(testCase>0){
        a = in.nextInt();
        b = in.nextInt();
        System.out.println("Case #"+cnt+": "+a+" + "+b+" = "+(a+b));
        
        testCase--;
        cnt++;
    }
        
    in.close();
    }    
}
        