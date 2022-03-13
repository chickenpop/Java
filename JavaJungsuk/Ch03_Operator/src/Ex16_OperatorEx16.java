// 3-16

public class Ex16_OperatorEx16 {
    
    public static void main(String[] args) {
        
        // 나눗셈 연산자의 성질 이용한 소수점 자릿수 설정
        float pi = 3.1415192f;
        // int * int = 3141
        // int * float = 3.141
        float shortPi = (int)(pi * 1000) / 1000f;
        System.out.println(shortPi);

    }

}
