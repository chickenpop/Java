// 3-28

public class Ex28_OperatorEx32 {
 
    public static void main(String[] args) {
        
        int x, y, z;
        int absX, absY, absZ;
        char signX, signY, signZ;

        x = 10;
        y = -5;
        z = 0;

        // 양수면 양수, 음수면 음수로 만듬
        absX = x >= 0 ? x : -x;
        absY = y >= 0 ? y : -y;
        absZ = z >= 0 ? z : -z;

        // 부호를 결정짓음
        signX = x > 0 ? '+' : (x == 0 ? ' ' : '-');
        signY = y > 0 ? '+' : (y == 0 ? ' ' : '-');
        signZ = z > 0 ? '+' : (z == 0 ? ' ' : '-');

        System.out.printf("x = %c%d\n", signX, absX);
        System.out.printf("y = %c%d\n", signY, absY);
        System.out.printf("z = %c%d\n", signZ, absZ);

    }

}
