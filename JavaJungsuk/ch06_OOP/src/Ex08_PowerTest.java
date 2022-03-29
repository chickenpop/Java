public class Ex08_PowerTest {
    public static void main(String[] args) {
        // 6-18
        /*
            power는 x의 n승을 표현한것
            x = 2, n = 0이라면 2의 0승은 1
            x = 2, n = 1 > 2
            x = 2, n = 2 > 4
            x = 2, n = 3 > 8
            x = 2, n = 4 > 16 으로 총합 31
            예제는 n = 1부터 시작이라 0으로 변경해봄
        */
        int x = 2;
        int n = 5;
        long result = 0;

        for(int i=0; i<n; i++){
            result += power(x, i);
        }
        System.out.println(result);
    }

    static long power(int x, int n){
        if(n==0) return 1;
        return x * power(x, n-1);
    }
}
