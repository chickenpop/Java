import java.io.File;
import java.util.Scanner;

public class FileDirectory_Q02 {

	public static void main(String[] args) {

		// 2번 확장자 검색
		// 폴더 경로를 입력하면 하위 파일에서 입력한 확장자와 동일한 파일들 출력
		// 확장자 검색은 대소문자 구분이 없음
	
		Scanner in = new Scanner(System.in);
		
		System.out.print("폴더: ");
		String path = in.nextLine();
		System.out.print("확장자: ");
		String extension = in.nextLine();
		
		File dir = new File(path);
		File[] list = dir.listFiles();
		
		for(File f : list) {
			if(f.isFile()) {
				int index = f.getName().lastIndexOf(".") + 1;
				if((f.getName().substring(index)).equalsIgnoreCase(extension)) {
					System.out.println(f.getName());
				}
				
			}
		}
		
		in.close();
	}

}
