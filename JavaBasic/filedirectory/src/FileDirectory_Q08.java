import java.io.File;

public class FileDirectory_Q08 {

	private static int dirCnt = 0;
	private static int fileCnt = 0;
	
	public static void main(String[] args) {
		
		// 8번 폴더 삭제
		// 삭제된 파일과 자식 폴더 개수 출력
		String path = "C:\\class\\java\\questionFile\\폴더 삭제";
		File dir = new File(path);
		
		if(dir.exists()) {
			countFile(dir);
		}
		System.out.println("폴더를 삭제했습니다.");
		System.out.printf("삭제된 폴더는 %d개이고, 파일은 %d개입니다.", dirCnt, fileCnt);
	}

	private static void countFile(File dir) {
		
		File[] list = dir.listFiles();
		
		for(File subfile : list) {
			if(subfile.isFile()) {
				fileCnt++;
				subfile.delete();
			}
		}
		
		for(File subdir : list) {
			if(subdir.isDirectory()) {
				dirCnt++;
				countFile(subdir);
				subdir.delete();
			}
		}
		
	}
}










