import java.util.*;
import java.util.stream.*;

public class Ex01_StreamEx1 {
    
    public static void main(String[] args) {
        // 14-8
        Stream<Students> studentStream = Stream.of(
            new Students("이자바", 3, 300),
            new Students("김자바", 1, 200),
            new Students("안자바", 2, 100),
            new Students("박자바", 2, 150),
            new Students("소자바", 1, 200),
            new Students("나자바", 3, 290),
            new Students("감자바", 3, 180)
        );
        
        studentStream.sorted(Comparator.comparing(Students::getBan) // Stdents의 ban데이터을 가져와 정렬
                            .thenComparing(Comparator.naturalOrder())) // 기본 정렬(내림차순)
                            .forEach(System.out::println);;

    }

}

class Students implements Comparable<Students> {
    String name;
    int ban;
    int totalScore;

    Students(String name, int ban, int totalScore){
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String toString(){
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }

    String getName() { return name;}
    int getBan() { return ban; }
    int getTotalScore() { return totalScore; }

    public int compareTo (Students s){  // 총점 내림차순 정렬(기본정렬)
        return s.totalScore - this.totalScore;
    }


}
