// 1157 단어 공부

import java.util.Scanner;

public class studyWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int alphabetTime[] = new int[26];
        String alphabet = "";
        int index = 0;              // 문자 위치

        // 알파벳 빈도 0으로 초기화
        for(int i = 0; i < 26; i++){
            alphabetTime[i] = 0;
        }

        // 알파벳 입력, 전부 대문자로 변환
        alphabet = in.next();
        alphabet = alphabet.toUpperCase();
        // alphabetTime[index]+1, index = 대문자 - 65
        for(int i = 0; i < alphabet.length(); i++){
            index = alphabet.charAt(i) - 65;
            alphabetTime[index] += 1;

        }

        // 알파벳 빈도수 체크
        int max = -1;                // 가장 빈도 큰 값
        index = 0;                  // 가장 많은 빈도를 가진 문자 위치
        for(int i = 0; i < 26; i++){
            if(max < alphabetTime[i]) {
                index = i; 
                max = alphabetTime[i];
            } else if(alphabetTime[i] == max && 1 <= max) {
                index = -2;     // "?" = -2 + 65
            }
        }

        //아스키코드로 전환
        index += 65;
        char alphabetMax = (char)index;
        System.out.println(alphabetMax);

        in.close();
    }
}
