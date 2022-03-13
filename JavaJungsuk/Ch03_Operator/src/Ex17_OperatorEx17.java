// 3-17

public class Ex17_OperatorEx17 {
    
    public static void main(String[] args) {
        
        double pi = 3.141592;
        // 반올림하는 방법, 기존은 버림
        double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;

        System.out.println(shortPi);

    }

}
