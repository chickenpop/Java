//10818 최소, 최대

//import java.util.Arrays; 
import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt(); //정수의 개수
        // 주석 처리된 곳은 Arrays sort()로 최대 최소 구하는 법
        // int arr[] = new int[n];
        
        // for(int i = 0; i < n;i++){
        //     arr[i] = in.nextInt();
        // }
        // Arrays.sort(arr);

        // System.out.println(arr[0]+" "+arr[arr.length-1]);
        // sort()없이 for과 if로만 처리한게 더 빠르다
        int min = 1000000;
        int max = -1000000;
        int mid;
        for(int i = 0; i < n; i++){
            mid = in.nextInt();
            if(max < mid){
                max = mid;
            }
            if(mid < min){
                min = mid;
            }
        }
        System.out.println(min+" "+max);
        in.close();
    }
}
