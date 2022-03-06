// 2-14

public class CastingEx03 {
    public static void main(String[] args) {
        float f = 9.1234567f;
        double d1 = 9.1234567;
        double d2 = (double)f;

        System.out.printf("f  =%20.18f\n", f);
        System.out.printf("d1 =%20.18f\n", d1);
        System.out.printf("d2 =%20.18f\n", d2); // double형의 정밀도가 의미가 없어짐을 확인
    }    
}
