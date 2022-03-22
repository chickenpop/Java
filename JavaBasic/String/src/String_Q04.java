import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String_Q04 {

	public static void main(String[] args) throws Exception {

		// 4번 문제 확장자
		
		// 객체, 변수
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] fileName = new String[10];
		int extensionId = -1; 
		String[] extension = { "mp3", "jpg", "java", "hwp", "doc"};
		int[] extensionCnt = new int[extension.length];
		
		// 입력
		for(int i=0; i<fileName.length; i++) {
			System.out.print("파일명 : ");
			fileName[i] = reader.readLine().trim();
			extensionId = fileName[i].lastIndexOf(".")+1;
			for(int j=0; j<extension.length; j++) {
				if(extension[j].equals(fileName[i].substring(extensionId, fileName[i].length()))){
					extensionCnt[j] += 1;
					break;
				}
			}
		}
				
		// 출력
		for(int i=0; i<extension.length; i++) {
			System.out.printf("%s : %d개\n", extension[i], extensionCnt[i]);
		}
		
	}

}
