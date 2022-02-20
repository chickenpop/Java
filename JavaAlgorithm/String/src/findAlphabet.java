// 10809 알파벳 찾기

import java.util.Scanner;

public class findAlphabet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Alphabet[] = new int[24];   // 알파벳 위치를 저장할 배열
        String alphabetString = in.next();

        for(int i = 0; i < Alphabet.length; i++){
            Alphabet[i] = -1;
        }

        for(int i = 0; i < alphabetString.length() ; i++){
            int alphabetIndex = alphabetString.charAt(i) - 97;
            Alphabet[alphabetIndex] = i;  
        }

        for(int i = 0; i < Alphabet.length ; i++){
            System.out.println(Alphabet[i]); 
        }
        in.close();
    }    
}
