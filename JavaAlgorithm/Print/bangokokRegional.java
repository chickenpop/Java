//18108 1998년생인 내가 태국에서는 2541년생?!

import java.util.Scanner;

public class bangokokRegional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;   
        int bangkokYear = 543;  //서기-불기 = 543
        year = in.nextInt();    //1000 <= y <= 3000
        
        System.out.println(year-bangkokYear);

        in.close();
    }
}
