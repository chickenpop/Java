// 1025 [기초-입출력] 정수 1개 입력받아 나누어 출력하기

import java.util.Scanner;

public class IO15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String number[] = in.nextLine().split("");      // 숫자 자릿수, 문자열 배열에 넣기

        for(int i = 0; i < number.length; i++){
            double value = Math.pow(10, number.length-i-1);     // 10 ** (자릿수 길이)
            int result = (int)(Integer.parseInt(number[i])*value);
            System.out.printf("[%d]", result);
            System.out.println();
        }
        
        in.close();
    }
}