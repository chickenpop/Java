import java.util.Arrays;

public class Ex01_ArrayEx2 {
    
    public static void main(String[] args) {
        
        int[] iArr = { 10, 20, 30, 40, 50 };
        char[] chArr = { 'a', 'b', 'c', 'd' };

        // for 출력
        for(int i=0; i<iArr.length;i++){
            System.out.print(iArr[i] + ",");
        }
        System.out.println();

        // Arrays 메소드 배열을 출력하는 형태가 편하고 직관적
        System.out.println(Arrays.toString(iArr));
        System.out.println(Arrays.toString(chArr));

        // 다른 참조형은 변수명만 출력시 주소값이 나오지만
        // char[] 배열은 각 요소가 구분자없이 그대로 출력됨
        System.out.println(chArr);
    
    }

}
