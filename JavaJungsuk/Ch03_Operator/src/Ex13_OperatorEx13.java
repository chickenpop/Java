// 3-13

public class Ex13_OperatorEx13 {
  
    public static void main(String[] args) {
        
        char c1 = 'a';

        // c1를 int형으로 변환 후 연산해서 형변환하지 않으면 에러
        char c2 = (char)(c1 + 1);  // c1 + 1 > 컴파일 에러
        System.out.println(c2);

        // 'a' + 1 > 리터럴 간의 연산이기 때문에 에러가 없음
        c2 = 'a' + 1; // 에러 없음
        System.out.println(c2);

    }

}