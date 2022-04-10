//8393 합

import java.util.Scanner;

public class sum1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;            //합을 저장할 변수
        int n = in.nextInt();   //n
        //1~n까지의 합
        for(int i = 1; i <= n;i++){
            sum += i;
        }
        System.out.println(sum);
        in.close();
    }
}
