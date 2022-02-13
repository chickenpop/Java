//10871 X보다 작은 수

import java.util.Scanner;

public class numberLessThanX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();       //수열의 크기
        int x = in.nextInt();       //정수
        
        int arr[] = new int[n];
        //수열 A[n] 입력
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        //x보다 작은 수 출력
        for(int i = 0; i < n; i++){
            if(x > arr[i]){
                System.out.print(arr[i]+" ");
            }
        }
        in.close();
    }    
}
