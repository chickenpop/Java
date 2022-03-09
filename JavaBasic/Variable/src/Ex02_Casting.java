public class Ex02_Casting {
    public static void main(String[] args) {
        
        // 형변환 복습
        // byte > short > int > long > float > double 
        //        char  >
        // 큰 바이트, 실수가 클수록 다른 타입의 값을 넣으면 자동으로 변환
        // 위 상황에 반대인 경우 개발자가 변환해줘야함
        // short, char 경우 서로 타입을 알려줘야함

		// 1. int -> long
        int inum = Integer.MAX_VALUE;
        long lnum = inum;
        System.out.printf("int형(MAX_VALUE) long형으로 변환: %d - > %d\n", inum, lnum);

        inum = Integer.MIN_VALUE;
        lnum = inum;
        System.out.printf("int형(MIN_VALUE) long형으로 변환: %d - > %d\n", inum, lnum);

		// 2. long -> int
		lnum = Long.MAX_VALUE;
        inum = (int)lnum;
        System.out.printf("long형(MAX_VALUE) int형으로 변환: %d - > %d\n", lnum, inum);

        lnum = Long.MIN_VALUE;
        inum = (int)lnum;
        System.out.printf("long형(MIN_VALUE) int형으로 변환: %d - > %d\n", lnum, inum);

		// 3. int -> double
        inum = Integer.MAX_VALUE;
        double dnum = inum;
        System.out.printf("int형(MAX_VALUE) double형으로 변환: %d - > %f\n", inum, dnum);

        // 소수점 지정, 빈칸 0으로 채워짐
        System.out.printf("double형 소수점 2자리까지 출력 : %.2f\n", dnum);

        inum = Integer.MIN_VALUE;
        dnum = inum;
        System.out.printf("int형(MIN_VALUE) double형으로 변환: %d - > %f\n", inum, dnum);

		// 4. double -> int
        // 밑에 두 결과로 소수점에서 반올림이 되지 않고, 소수점은 버려지는 걸 알 수 있음
        dnum = 123456.123456;
        inum = (int)dnum;
        System.out.printf("double형 int형으로 변환 : %f - > %d\n", dnum, inum);

        dnum = 123456.654;
        inum = (int)dnum;
        System.out.printf("double형 int형으로 변환 : %f - > %d\n", dnum, inum);

		// 5. long -> double
        // long형의 정보의 큰수는 손실되어 변환되는 거 확인
        lnum = 1234567890123456789L;
        dnum = lnum;
        System.out.printf("long형 double형으로 변환 : %d - > %f\n", lnum, dnum); // 1234567890123456789 - > 1234567890123456770.000000

		// 6. double -> long
		dnum = 1234567890123456789.654321;
        lnum = (long)dnum;
        System.out.printf("double형 long형으로 변환 : %f - > %d\n", dnum, lnum); // 1234567890123456770.000000 - > 1234567890123456768

		// 7. int -> char
        inum = 65;
        char ch = (char)inum;
        System.out.printf("int형 char형으로 변환 : %d - > %c\n", inum, ch);

        ch+= 3;
        System.out.printf("char형으로 변환한 값에 +3 : %c\n", ch);

        inum = 97;
        ch = (char)inum;
        System.out.printf("int형 char형으로 변환 : %d - > %c\n", inum, ch);

		// 8. char -> int
        ch = 'A';
        inum = ch;
        System.out.printf("char형 int형으로 변환 : %c - > %d\n", ch, inum);

        inum = ch + 3;
        System.out.printf("int형으로 변환값에 + 3 : %d\n", inum);
 
    }
}
