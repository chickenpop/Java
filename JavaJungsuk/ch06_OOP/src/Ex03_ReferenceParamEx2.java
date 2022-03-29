public class Ex03_ReferenceParamEx2 {
    public static void main(String[] args) {
        // 6-11
        // 배열도 객체와 같이 주소를 저장하기에 return으로 돌려주지 않아도 값이 바뀜
        int[] x = { 10 };
        System.out.printf("main() : %d\n", x[0]);
        
        // 주소에 위치한 데이터 값이 변경되었기에 결과가 1000으로 나옴
        change(x);
        System.out.println("change 메소드 이후 x[0]");
        System.out.printf("main() : %d\n", x[0]);
    
    }

    static void change(int[] x){
    
        x[0] = 1000;
        System.out.printf("change() : %d\n", x[0]);
    }

}
