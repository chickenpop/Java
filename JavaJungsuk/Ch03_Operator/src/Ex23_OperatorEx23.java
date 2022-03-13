// 3-23

public class Ex23_OperatorEx23 {
    
    public static void main(String[] args) {
        
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\" == \"abc\" ?  %b\n", "abc" == "abc");
        // 내용은 같아도 다른 객체라서 true, false 결과가 다름
        System.out.printf(" str1 == \"abc\" ?  %b\n", str1 == "abc");
        System.out.printf(" str2 == \"abc\" ?  %b\n", str2 == "abc");

        // equals로 비교하면 같은 결과를 얻을 수 있음
        System.out.printf(" str1.equlas(\"abc\") ?  %b\n", str1.equals("abc"));
        System.out.printf(" str2.equlas(\"abc\") ?  %b\n", str2.equals("abc"));

        // 대소문자로 구분하고 싶지 않으면 equalsIgnoreCase
        System.out.printf(" str2.equlas(\"ABC\") ?  %b\n", str2.equals("ABC"));
        System.out.printf(" str2.equlasIgnoreCase(\"ABC\") ?  %b\n", str2.equalsIgnoreCase("ABC"));
    }

}
