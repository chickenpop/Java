import java.util.Scanner;

public class Ex03_FlowEx25 {
    
    public static void main(String[] args) {
        
        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요.(5자릿수)>");
        
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        // 숫자의 각 자릿수 구하는 법
        while(num != 0){

            sum += num%10;
            System.out.printf("sum = %3d num %d\n", sum, num);

            num /= 10; 
        }

        System.out.printf("각 자리수의 합 : %d\n", sum);

        in.close();

    }

}
