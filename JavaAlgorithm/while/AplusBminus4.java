//10951 A+B-4
import java.util.Scanner;

public class AplusBminus4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a, b;

        while(in.hasNextInt()){ //아무 입력도 들어오지 않으면 종료
            a = in.nextInt();
            b = in.nextInt();
            System.out.println(a+b);            
        }
        
        in.close();
    }    
}
