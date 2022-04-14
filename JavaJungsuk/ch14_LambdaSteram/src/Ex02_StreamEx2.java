import java.util.ArrayList;

public class Ex02_StreamEx2 {

    public static void main(String[] args) {
        // 14-9
        // map() 연습
        ArrayList<String> list = new ArrayList<>(5);
        list.add("Ex1.java");
        list.add("Ex1.bak");
        list.add("Ex2.java");
        list.add("Ex1");
        list.add("Ex1.txt");

        // 파일명에서 확장자 추출하기
        list.stream()
            .filter(s -> s.indexOf(".") != -1)       // 확장자 있으면 true
            .map(s -> s.substring(s.indexOf(".")+1)) // 파일명.확장자 > 확장자만 추출
            .map(String::toUpperCase)                     // 대문자 변경
            .distinct()                                   // 중복제거
            .forEach(System.out::println);
    
    }

}
