public class Ex02_FlowEx22 {

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        // 향상된 for문, 파이썬 for이랑 거의 같음
        // 배열이나 컬렉션 등의 저장된 요소를 읽어오는 용도로만 사용가능
        for(int tmp : arr){
            System.out.printf("%d ", tmp);
            sum+= tmp;
        }
        System.out.println();
        System.out.println("sum = "+sum);
    }

}
