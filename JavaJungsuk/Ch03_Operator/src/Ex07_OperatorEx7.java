// 3-7

public class Ex07_OperatorEx7 {
    public static void main(String[] args) {
        
        byte a = 10;
        byte b = 30;
        // 충분한 범위의 자료형을 써야하는 이유
        byte c = (byte)(a*b); // byte형의 범위를 넘는 값을 넣어서 형변환해도 올바른 값이 나오지 않음

        System.out.println(c);

    }

}