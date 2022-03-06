// 2-15

public class CastingEx04 {
    public static void main(String[] args) {
        int i1 = 91234567;
        float f1 = (float)i1;
        int i2 = (int)f1;

        double d = (double)i1;
        int i3 = (int)d;

        float f2 = 1.666f;
        int i4 = (int)f2;

        System.out.printf("i1=%d\n", i1);
        System.out.printf("f=%f i2=%d\n", f1, i2);  // (float)f2 = 91234568.0... i1+1 = i2, f2를 통한 형변환으로 반올림 발생
        System.out.printf("d=%f i3=%d\n", d, i3);   // double형가 정밀도가 높아 f2처럼 반올림이 발생하지 않았다.
        System.out.printf("(int)%f=%d\n", f2, i4);  // 실수를 정수로 바꾸면 소수점이 버려져 1이 출력
    }
}
