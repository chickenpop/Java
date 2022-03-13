// 3-26

public class Ex26_OperatorEx26 {
    
    public static void main(String[] args) {
        
        int a = 5;
        int b = 0;

        // b를 보면 증강연산자가 실행되지 않았음
        // ||, && 모두 좌측 피연산자에서 이미 true, false를 판별하는 값이 나왔기에
        System.out.printf("a = %d, b = %d\n", a, b);
        System.out.printf("a != 0 || ++b != 0 = %b\n", a != 0 || ++b != 0);
        System.out.printf("a = %d, b = %d\n", a, b);
        System.out.printf("a == 0 && ++b != 0 = %b\n", a == 0 && ++b != 0);
        System.out.printf("a = %d, b = %d\n", a, b);

    }

}
