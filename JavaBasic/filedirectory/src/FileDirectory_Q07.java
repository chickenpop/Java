import java.io.File;
import java.util.HashSet;

public class FileDirectory_Q07 {

	public static void main(String[] args) {

		// 7번 중복파일
		// MusicA, MusicB 폴더를 비교해 양쪽에 존재하는 파일만 출력
		String pathA = "C:\\class\\java\\questionFile\\동일 파일\\MusicA";
		String pathB = "C:\\class\\java\\questionFile\\동일 파일\\MusicB";
		
		File dirA = new File(pathA);
		File dirB = new File(pathB);
		
		File[] fileA = dirA.listFiles();
		HashSet<String> set = new HashSet<String>();
		
		for(File f : fileA) {
			if(f.isFile()) {
				set.add(f.getName());
			}
		}
		
		File[] fileB = dirB.listFiles();
		for(File f: fileB) {
			if(f.isFile()) {
				boolean flag = set.add(f.getName());
				if(!flag) {
					System.out.println(f.getName());
				}
				
			}
		}
		
		
	}

}








