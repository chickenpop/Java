// 2-3

public class StringEx {
    public static void main(String[] args) {
        String name = "Ja" + "va";      // Java
        String str = name + 11.0;       // Java11.0 (현재 내 버전에 맞춰 바꿈 8.0 > 11.0)

        System.out.println(name);
        System.out.println(str);
        System.out.println(7 + " ");    // 7
        System.out.println(" " + 7);    //  7
        System.out.println(7 + "");     // 7
        System.out.println("" + 7);     // 7
        System.out.println("" + "");    // 없음
        System.out.println(7 + 7 + ""); // 14
        System.out.println(""+ 7 + 7);  // 77
    }
}
