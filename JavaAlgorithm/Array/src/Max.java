// 2562 최댓값 

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max = 0;        // 최댓값
        int index = 0;      // 인덱스
        int inInt = 0;      // 입력받을 수

        //입력
        for(int i = 0; i < 9 ;i++){
            inInt = in.nextInt();
            if(max < inInt){
                max = inInt;
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
        in.close();
    }    
}
