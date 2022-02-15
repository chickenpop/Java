// 3052 나머지

import java.util.Scanner;

public class remainder1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int remainderArr[] = new int[10];   // 입력받은 수 
        int num = 0;                        // 임시로 입력받을 수 
        int cnt = 0;                        // 중복이 아닌 나머지 수
        for(int i = 0; i < 10; i++){
            num = in.nextInt();
            remainderArr[i] = num % 42;
        }
        for(int i = 0; i < 10; i++){
            int temp = 0;
            for(int j = i+1; j < 10; j++){
                if(remainderArr[i]==remainderArr[j]){
                    temp++;
                }
            }
            if(temp == 0){
                cnt++;
            }
        }
        System.out.println(cnt);
        in.close();
    }    
}
