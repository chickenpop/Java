public class Ex01_FlowEx15 {
    
    public static void main(String[] args) {
        
        System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
        System.out.println("-----------------------------------------------");

        // for문의 변수값을 이용해 다양한 특정 값을 구사할 수 있음
        for(int i=0; i<=10; i++){

            System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d\n", i, 2*i, 2*i-1, i*i, 11-i, i%3, i/3);

        }

    }

}
