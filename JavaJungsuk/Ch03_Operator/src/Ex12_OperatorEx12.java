// 3-12

public class Ex12_OperatorEx12 {
  
    public static void main(String[] args) {
        
        char c1 = 'a';
        char c2 = c1;
        char c3 = ' ';

        int i = c1 + 1;      // a의 코드값 97 + 1

        c3 = (char)(c1 + 1); // a + 1 = b
        // a + 2(증감연산자 2번) = c
        c2++;
        c2++;

        System.out.println("i = "+i);   
        System.out.println("c2 = "+c2);  
        System.out.println("c3 = "+c3); 


    }

}
