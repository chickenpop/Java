// 3-14

public class Ex14_OperatorEx14 {

    public static void main(String[] args) {
        
        // 문자 코드는 연속적으로 코드가 지정되어있어 +1 연산을 반복하면 
        // 문자를 순서대로 출력할 수 있음
        char c = 'a';
        for(int i = 0; i < 26 ; i++){
            System.out.print(c++);
        }
        System.out.println();

        c = 'A';
        for(int i = 0; i < 26 ; i++){
            System.out.print(c++);
        }
        System.out.println();

        c = '0';
        for(int i = 0; i < 10 ; i++){
            System.out.print(c++);
        }
        System.out.println();

    }

}
