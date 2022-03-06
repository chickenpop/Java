// 2-10

public class FloatEx01 {
    public static void main(String[] args) {
        float f1 = 9.12345678901234567890f;
        float f2 = 1.2345678901234567890f;
        double d = 9.12345678901234567890;
        
        System.out.println("     123456789012345678901234%n");
        System.out.printf("f1  : %f%n", f1);    // 소수점 6째자리까지 정확
        System.out.printf("f1  : %24.20f%n", f1);   // 소수점 7부터 정확하지 않음 
        System.out.printf("f2  : %24.20f%n", f2);   // 소수점 7~8 등 우연히 같을수 있음
        System.out.printf("d   : %24.20f%n", d);    // 소수점 15째자리까지 정확

    }    
}
