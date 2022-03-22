import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String_Q09 {

	public static void main(String[] args) throws Exception {

		// 9번 문제 금지어 
		
		// 객체, 변수
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String content = "";
		String[] words = { "바보", "멍청이" }; // 금지어
		
		System.out.print("입력 : ");
		content = reader.readLine();
		StringBuilder statement = new StringBuilder(""); 
		
		// 과정 필요
		int id = 0;
		int cnt = 0;
		for(int i=0; i<words.length; i++) {
			if(content.indexOf(words[i]) > -1) {
				
				if(words[i].length()==2) {
					statement.append(content.substring(id, content.indexOf(words[i])));
					statement.append("**");
					id = content.indexOf(words[i]) + 2;
					cnt++;
				}
				
				if(words[i].length()==3) {
					statement.append(content.substring(id, content.indexOf(words[i])));
					statement.append("***");
					id = content.indexOf(words[i]) + 3;
					cnt++;
				}	
			}
		}
		
		statement.append(content.substring(id, content.length()));
	
		System.out.printf("%s\n", statement);
		System.out.printf("금지어를 %d회 마스킹했습니다.\n", cnt);
		
	}

}
