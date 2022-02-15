//2577 숫자의 개수

import java.util.Scanner;

public class numberOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // a, b, c 입력
        int a = 0, b = 0, c = 0;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();       

        int num[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};    // 0~9까지 자리수
        // 정수 > String > int 배열에 나눠서 int형으로 넣기
        int abc = a*b*c;
        String temp = Integer.toString(abc);
        int[] abcNumbers = new int[temp.length()];

        for(int i = 0; i < temp.length(); i++){
            abcNumbers[i] = temp.charAt(i) - '0';
        }        
        
        //자리 수 배열에 넣기
        for(int i = 0; i < abcNumbers.length ; i++){
            num[abcNumbers[i]] += 1;
        }
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
        in.close();
    }
}
