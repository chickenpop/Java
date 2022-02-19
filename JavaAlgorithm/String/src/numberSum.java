// 11720 숫자의 합
import java.util.Scanner;

public class numberSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 입력
        int n = in.nextInt();           // 숫자의 개수
        String number = in.next();      // 공백없이 숫자 입력
        int sum = 0;                    // 숫자의 합

        // 숫자의 합 구하기
        for(int i = 0; i < n; i++){
            sum += (int)number.charAt(i) - '0';
        }
        
        System.out.println(sum);
        in.close();
    }    
}
