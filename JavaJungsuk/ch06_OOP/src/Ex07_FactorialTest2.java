public class Ex07_FactorialTest2 {
    public static void main(String[] args) {
        // 6-16
        /*
            팩토리얼 메소드 반환값이 int 타입인 경우 13!이 int 최대값보다 크다
            long형을 사용하면 21!부터 long보다 커서 쓸수없음
            1부터 최대값 전까지가 팩토리얼 재귀함수의 유효성 검사를 위한 식이 됨
        */
        int n = 21;
        long result = 0;

        for(int i=0; i<=n; i++){
            result = factorial(i);

            if(result == -1){ // 유효하지 않은 범위인 경우 출력 및 넘기기
                System.out.printf("유효하지 않은 값입니다.(0<n<=20) : %d\n", i); 
                continue;
            }

            System.out.printf("%02d! = %20d\n", i, result);
        }

    }

    static long factorial(int n){
        if(n<=0 || n > 20) return -1; // 매개변수 유효성 검사
        // 팩토리얼 
        if(n==1) return 1; 
        else return n * factorial(n-1);
    }
}
