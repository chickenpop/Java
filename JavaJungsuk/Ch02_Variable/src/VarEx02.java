// 2-2

public class VarEx02 {
    public static void main(String[] args) {
        int x = 1, y = 2;
        int tmp = 0;

        System.out.println("x : "+ x + " y : " + y);

        tmp = y;
        y = x;
        x = tmp;

        System.out.println("x : "+ x + " y : " + y);
        
    }    
}
