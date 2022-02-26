// 1028 [기초-데이터형] 정수 1개 입력받아 그대로 출력하기2

import java.util.Scanner;

public class Data01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String numStr = in.nextLine();
        int numInt = Integer.parseUnsignedInt(numStr);  // -numStr 음수로 저장
        numStr = Integer.toUnsignedString(numInt);      // numStr  양수로 변경

        System.out.println(numStr);
        
        in.close();
    }
}