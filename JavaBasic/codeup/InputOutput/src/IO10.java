// 1020 [기초-입출력] 주민번호 입력받아 형태 바꿔 출력하기

import java.util.Scanner;

public class IO10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // String humanId[] = in.next().split("-");
        
        // for(int i = 0; i < humanId.length; i++){
        //     System.out.print(humanId[i]);
        // }

        // 방법 2
        String humancode = in.nextLine();
        String humanId[] = humancode.split("\\-");

        System.out.print(String.valueOf(humanId[0]));
        System.out.print(String.valueOf(humanId[1]));
        in.close();
    }
}