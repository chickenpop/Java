public class Ex04_ReturnTest {
    public static void main(String[] args) {
        // 6-13
        // 배열을 이용하면 반환값 있는 메소드를 사용하는 코드를, 반환값 없는 메소드로 바꿀수 있음
        Ex04_ReturnTest r = new Ex04_ReturnTest();

        // 반환값 있는 메소드 사용
        int result = r.add(3, 5);
        System.out.println(result);

        // 반환값 없는 메소드 사용
        int[] result2 = { 0 }; // 길이 1짜리 배열은 자바에서 생성 가능
        r.add(3, 5, result2);
        System.out.println(result2[0]);

    }
    int add(int a, int b){
        return a + b;
    }
    void add(int a, int b, int[] result){
        result[0] = a+b;
    }
}
