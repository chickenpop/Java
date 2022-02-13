//15552 빠른 A+B

import java.io.*;
import java.util.StringTokenizer;

public class fastApulsB {
    public static void main(String[] args) throws IOException {
        //Scanner 대신 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //공백을 구분해주기 위해 사용
        StringTokenizer st;

        //sysout 대신 Bufferedwriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //Testcase 수 만큼 두 정수의 합 구하기
        int testCase = Integer.parseInt(br.readLine());
    
        for(int i = 0; i < testCase; i++){
            st = new StringTokenizer(br.readLine()); //매번 생성해주지 않으면 에러가 생김, 이유를 아직 모르겠다
            bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
            //bw.newLine() 개행 역할인데 실제로는 에러 발생해서 폐기
            
            // 다른 방법 2, 더 느려서 주석처리
            // String s = br.readLine();
            // int a = Integer.parseInt(s.split(" ")[0]);
            // int b = Integer.parseInt(s.split(" ")[1]);
            // bw.write(a+b+"\n");
        }
        bw.flush();
        bw.close();
    }    
}
