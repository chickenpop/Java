import java.io.File;

public class FileDirectory_Q10 {

	public static void main(String[] args) {

		// 10번 분류 이동
		// 1차: 직원 이름 폴더 생성
		// 2차: 연도별로 폴더 생성
		// 3차: 각 파일을 직원 > 연도 폴더에 이동
		
		File dir = new File("C:\\class\\java\\questionFile\\직원");
		
		File[] list = dir.listFiles();
		
		for(File file : list) {
			if(file.isFile()) {
				
				String filename = file.getName();
				
				// 구분자 통일
				filename = filename.replace("__", "_");
				// 0 이름, 1 연도, 2 번호
				String[] temp = filename.split("_");
				
				// .\\이름\\연도 폴더 경로
				File newDir = new File(dir.getAbsolutePath()+"\\"+temp[0]+"\\"+temp[1]);
				newDir.mkdirs();
				
				// 파일 옮기기
				File moveFile = new File(newDir.getAbsolutePath()+"\\"+file.getName());
				file.renameTo(moveFile);
				
				
			}
		}
		
	}

}
