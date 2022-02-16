// 8958 OX 퀴즈

import java.util.Scanner;

public class OXquiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 0; // 횟수
        n = in.nextInt();                           // 테스트 케이스 반복 횟수
        String oxStr = "";
        String o = "O";
        for(int i = 0; i < n ; i++){
            int sum = 0;                            // 점수 합
            int cnt = 1;                            // 현재 점수
            oxStr = in.next();                      // OX 입력
            String oxStrArr[] = oxStr.split("");    // oxStr 문자 한개씩 배열에 넣기

            for(int k = 0; k < oxStrArr.length - 1; k++){
                if(oxStrArr[k].equals(o)){
                    sum += cnt;
                }
                if(oxStrArr[k].equals(oxStrArr[k+1]) && oxStrArr[k].equals(o)){   // 연속되는 문자가 "O"로 같으면 +1
                    cnt += 1;
                }else {
                    cnt = 1;
                }
            }
            if(oxStrArr[oxStrArr.length-1].equals(o)) sum += cnt;
            System.out.println(sum);
        }

        in.close();
    }    
}
