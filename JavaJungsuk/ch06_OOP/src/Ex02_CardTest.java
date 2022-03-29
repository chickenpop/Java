public class Ex02_CardTest {
    public static void main(String[] args) {
        // 6-5
        // static 상수로 선언한 변수는 공용으로 사용가능하다
        // 변경된 값이 같은 클래스 변수이기에 같은 값만이 나온다
        System.out.printf("Card.width = %d\n", Card.width);
        System.out.printf("Card.height = %d\n", Card.height);
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 4;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 3;

        // 예시라서 c1, c1를 사용했지만 static은 클래스명.클래스변수 방식으로 사용할것
        System.out.printf("c1의 종류는 %s, 숫자는 %d 카드 크기(%d, %d)\n", c1.kind, c1.number, c1.width, c1.height);
        System.out.printf("c2의 종류는 %s, 숫자는 %d 카드 크기(%d, %d)\n", c2.kind, c2.number, c2.width, c2.height);

        Card.width = 50;
        Card.height = 100;
        // c1.width = 50 이나 c2.width도 마찬가지

        System.out.printf("Card.width = %d\n", Card.width);
        System.out.printf("Card.height = %d\n", Card.height);
        System.out.printf("c1의 종류는 %s, 숫자는 %d 카드 크기(%d, %d)\n", c1.kind, c1.number, c1.width, c1.height);
        System.out.printf("c2의 종류는 %s, 숫자는 %d 카드 크기(%d, %d)\n", c2.kind, c2.number, c2.width, c2.height);
    }
}

class Card {
    String kind; // 카드 종류 : 스페이드, 다이아, 하트, 클로버
    int number;  // 카드 숫자 A=1, 2~10, J Q K = (11~13) 
    static int width = 100;     // 카드 너비
    static int height = 250;    // 카드 높이
}