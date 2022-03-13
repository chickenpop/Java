// 3-2

public class Ex02_OperatorEx2 {
   public static void main(String[] args) {
       
    int i = 5, j = 0;

    // j에게 i값을 복사한후 i가 1증가
    j = i++;
    System.out.println("j : j++; 실행 후, i = " + i + " j =" + j);

    i = 5; 
    j = 0;

    // i값을 증가한 후 j에게 i값 복사
    j = ++i;
    System.out.println("j : j++; 실행 후, i = " + i + " j =" + j);

   } 
}
