//1110 더하기 사이클

import java.util.Scanner;

public class plusCycle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();                       //원점이 되는 수
        int numRight = n % 10;                      //수의 가장 오른쪽 자리 수
        int sumRight = (numRight + (n / 10)) % 10;  //합의 가장 오른쪽 자리 수
        int newNum = numRight * 10 + sumRight;      //새로운 수
        int cnt = 1;                                //사이클 수
        while(n != newNum){
            numRight = newNum % 10;                      
            sumRight = (numRight + (newNum / 10)) % 10;  
            newNum = numRight * 10 + sumRight;
            cnt++;
        }
        System.out.println(cnt);
        in.close();
    }    
}
