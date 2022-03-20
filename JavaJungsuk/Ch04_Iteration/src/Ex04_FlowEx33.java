public class Ex04_FlowEx33 {

    public static void main(String[] args) {
        
        Loop1 : for(int i=2; i<=9; i++){

            for(int j=1; j<=9; j++){

                if(j==5)
                    break Loop1;     // Loop1를 탈출 2단 4까지만 출력 후 탈출
                    // break;           // j가 5면 가장 가까운 for 탈출
                    // continue Loop1;  // 모든 단 5이후로 출력되지 않음
                    // continue;        // 모든 단 5만 출력되지 않음
                System.out.printf("%d * %d = %d\n", i, j, i*j);

            } // end of for i
            
            System.out.println();

        } // end of Loop1

    }

}
