import java.io.File;

public class FileDirectory_Q06 {

	public static void main(String[] args) {

		// 6번 파일 삭제
		// 파일 크기가 0byte인 파일만 삭제
		
		String path = "C:\\class\\java\\questionFile\\파일 제거";
		
		File dir = new File(path);
		File[] file = dir.listFiles();
		
		for(File f : file) {
			if( f.isFile() && (f.length()==0) ) {
				//System.out.println(f.getName()); log 확인용
				f.delete();
			}
		}
		
	}

}






