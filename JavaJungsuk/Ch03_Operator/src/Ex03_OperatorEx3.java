// 3-3

public class Ex03_OperatorEx3 {
    public static void main(String[] args) {
        
        int i = 5, j = 5;

        // 증감 연산식을 분리하면 구분하기 쉬워짐
        // 한 줄에 코드에 증감연산식을 2개 이상 적는 거는 바람직하지 않음
        System.out.println(i++);
        System.out.println(++j);
        System.out.printf("i =  %d, j = %d\n", i, j);

    }
}
