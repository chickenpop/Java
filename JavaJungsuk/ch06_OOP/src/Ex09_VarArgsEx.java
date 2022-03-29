public class Ex09_VarArgsEx {
    public static void main(String[] args) {
        // 6-22 
        /*
            가변인자를 통한 문자열 개수 제약없는 매개변수
            문자열들이 사이사이에 구분자가 삽입됨
            가변인자 메소드는 메서드 호출 시 구분이 쉽지 않기 때문에 
            오버로딩을 권장하지 않음
        */
        String[] strArr = { "100", "200", "300" };
        System.out.println(concatenate("", strArr));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[] { "1", "2", "3"}));
        System.out.println("["+concatenate(",", new String[0])+"]");
        System.out.println("["+concatenate(",")+"]");
        
    }    
    // 매개변수는 구분자와 가변인자이며 String 타입
    static String concatenate(String delim, String... args){
        String result = "";

        for(String str : args){
            result += str + delim;
        }

        return result;
    }

}
