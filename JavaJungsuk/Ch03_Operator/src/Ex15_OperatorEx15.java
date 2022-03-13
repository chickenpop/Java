// 3-15

public class Ex15_OperatorEx15 {
    
    public static void main(String[] args) {
        
        // 소문자 a = 97, 대문자 A = 65 차이를 이용하여 대소문자 변경가능
        char lowerCase = 'a';
        char upperCase = (char)(lowerCase - 32);

        System.out.println(upperCase);

    }

}
