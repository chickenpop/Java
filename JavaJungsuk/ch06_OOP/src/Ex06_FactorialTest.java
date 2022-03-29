public class Ex06_FactorialTest {
    public static void main(String[] args) {
        // 6-15
        int result = factorial(4);

        System.out.println(result);
    }   
    static int factorial(int n){
        // n * n-1 .. 진행되다가 n이 1이되면 1과 함께 그전에 계산된값도 반환
        // 4! = 4 * factorial(3)
        // 4! = 4 * 3 * factorial(2)
        // 4! = 4 * 3 * 2 * factorial(1)
        // 4! = 4 * 3 * 2 * 1 = 24 가 반환됨
        if(n==1)
            return 1;
        else 
            return n * factorial(n-1);
    } 
}
