//11021 A+B-7

import java.util.Scanner;

public class AplusBminus7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        int testCase = in.nextInt();
        int a;
        int b;
        int cnt = 1;
        while(testCase>0){
            a = in.nextInt();
            b = in.nextInt();
            System.out.println("Case #"+cnt+": "+(a+b));
            
            testCase--;
            cnt++;
        }
        
        in.close();
    }    
}
