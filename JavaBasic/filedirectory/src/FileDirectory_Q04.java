import java.io.File;

public class FileDirectory_Q04 {

	public static void main(String[] args) {

		// 4번 일련번호
		// 음악 파일명 앞에 [001]~ 파일 개수만큼 일련번호를 붙임

		String path = "음악 파일";
		
		File dir = new File(path);
		File[] file = dir.listFiles();
		
		int count = 1;
		for(File f : file) {
			String tempPath = String.format("음악 파일\\[%03d]%s", count,f.getName());
			File temp = new File(tempPath);
			f.renameTo(temp);
			count++;
		}
		
	}

}
