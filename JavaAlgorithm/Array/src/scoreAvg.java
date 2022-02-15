// 1546 평균

import java.util.Arrays;
import java.util.Scanner;

public class scoreAvg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int score[];                // 점수
        double scoreNewAvg = 0.0;   // 새로운 점수의 평균
        int max = 0;                // 가장 큰 점수
        int ArrSize = 0;            // 배열 크기
        
        // 세준의 점수 입력
        ArrSize = in.nextInt();     // 점수 개수
        score = new int[ArrSize];
        for(int i = 0; i < score.length ; i++){
            score[i] = in.nextInt();
        }
        
        // 점수 오름차순 정렬
        Arrays.sort(score);
        
        // 가장 큰수, 새로운 점수 평균 구하기
        max = score[score.length-1];
        for(int i = 0; i < score.length; i++){
            // 실수 * 정수 / 정수 하면 실수로 계산됨
            scoreNewAvg += 100.0 * score[i] / max ; 
        }
        scoreNewAvg /= ArrSize;
        
        // 출력
        System.out.print(scoreNewAvg);
        in.close();
    }    
}
