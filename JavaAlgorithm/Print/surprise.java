// 10926 ??!

import java.util.Scanner;

public class surprise {
    public static void main(String[] args) {
        //주로 sc로 Scanner객체를 생성
        //scan, in
        Scanner scan = new Scanner(System.in); 
        String str1 = scan.next();
        System.out.println(str1+"??!");
        //Resource leak: 'scan' is never closed 경고문
        //System.in을 해주었기에 close
        scan.close();  
    }
}
