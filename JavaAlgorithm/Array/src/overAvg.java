// 4344 평균은 넘겠지

import java.util.Scanner;

public class overAvg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // 변수
        int Testcase = 0;       // 테스트 케이스 수
        int n = 0;              // 학생 총수
        int nScoreArr[];
        double sum = 0;            // 점수의 합
        double avg = 0;         // 평균값
        int avgCnt = 0;         // 평균이 넘는 학생 수

        Testcase = in.nextInt();

        //테스트 케이스 수만큼 반복
        for(int i = 0; i < Testcase; i++){

            n = in.nextInt();
            nScoreArr = new int[n];
            for(int j = 0; j < n; j++){
                nScoreArr[j] = in.nextInt();
                sum += nScoreArr[j];
            }
            avg = sum/n;    // 학생들의 점수 평균
            System.out.println(avg);
            for(int k = 0; k < n; k++){
                if(avg < nScoreArr[k]){
                    avgCnt += 1;
                }
            }

            System.out.printf("%.3f%%\n", (avgCnt/n)*100);
        }

        in.close();
    }    
}
