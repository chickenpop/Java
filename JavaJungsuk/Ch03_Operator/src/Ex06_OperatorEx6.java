// 3-6

public class Ex06_OperatorEx6 {
    public static void main(String[] args) {
        
        byte a = 10;
        byte b = 20;

        // + 연산자는 int형보다 작은 형을 가진 수를 int형으로 바꿔 계산함
        byte c = (byte)(a+b); // byte형을 지정하지 않으면 Type mismatch 오류가 뜸

        System.out.println(c);

    }

}
