// 2-11

public class FloatToBinEx {
    public static void main(String[] args) {
        float f = 9.1234567f;
        int i = Float.floatToIntBits(f);
        
        System.out.printf("%f%n", f);
        System.out.printf("%X%n", i); // 16진수 출력, 4111F9AD != 4111F9AE, 반올림으로 값이 다른거 확인
        
    }
}
