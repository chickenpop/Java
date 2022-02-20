// 10809 알파벳 찾기

import java.util.Scanner;

public class findAlphabet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Alphabet[] = new int[24];               // 알파벳 위치를 저장할 배열
        String alphabetString = in.next();          // 알파벳 입력
        boolean AlphabetOverlap[] = new boolean[24];

        for(int i = 0; i < Alphabet.length; i++){   // -1로 초기화
            Alphabet[i] = -1;
            AlphabetOverlap[i] = false;
        }

        for(int i = 0; i < alphabetString.length() ; i++){
            int alphabetIndex = alphabetString.charAt(i) - 97;  // string - 97 아스키 코드를 정수를 바꿔서 인덱스로 활용
            if(AlphabetOverlap[alphabetIndex] == false) {
                Alphabet[alphabetIndex] = i;
                AlphabetOverlap[alphabetIndex] = true;          // 첫번째 값의 위치의 boolean false > true 변경해서 두번째 인덱스부터는 위치 입력이 되지 않음
            }
        }

        for(int i = 0; i < Alphabet.length ; i++){
            System.out.print(Alphabet[i]+" "); 
        }
        in.close();
    }    
}
