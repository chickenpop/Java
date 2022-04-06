import java.io.File;
import java.util.ArrayList;

public class FileDirectory_Q09 {
	
	public static ArrayList<File> list = new ArrayList<File>();

	public static void main(String[] args) {
		// 9번 정렬
		// 자식 폴더내의 파일도 모두 검색할것
		// 부모 자식 폴더 상관없이 파일 비교
		String path = "C:\\class\\java\\questionFile\\크기 정렬";
		File dir = new File(path);
		
		ArrayList<File> list = new ArrayList<File>();	

		// 모든 파일 찾기	
		countFile(dir, list);
		
		// 파일 크기대로 정렬
		for(int i=0; i<list.size()-1; i++) {
			for(int j=0; j<list.size()-i-1; j++) {
				if(list.get(j).length() < list.get(j+1).length()) {
					File temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}
			}
		}
		System.out.println("[파일명]\t\t\t\t[크기]\t\t[파일이 들어있는 폴더]");
		for(File f : list) {
			// 파일명
			System.out.printf("%s",f.getName());
			// 파일명 길이에 따라 간격 맞추는 탭
			if(f.getName().length() < 8) {
				System.out.print("\t\t\t\t");
			} else if(f.getName().length() < 16) {
				System.out.print("\t\t\t");
			} else if(f.getName().length() < 22){
				System.out.print("\t\t");
			} else {
				System.out.print("\t");
			}
			// 파일 크기, 파일이 들어간 상위 폴더
			System.out.printf("%.1f%s\t\t", sizeLength(size(f.length()), f.length()), size(f.length()));
			System.out.printf("%s\n", f.getParent().replace("C:\\class\\java\\questionFile\\크기 정렬\\", ""));
			
		}

	}

	private static void countFile(File dir, ArrayList<File> list) {
		
		File[] file = dir.listFiles();
		
		for(File subfile : file) {
			if(subfile.isFile()) {
				list.add(subfile);
			}
		}
		
		for(File subdir : file) {
			if(subdir.isDirectory()) {
				countFile(subdir, list);
			}
		}
		
		
	}
	
	private static double sizeLength(String size, long length) {
		
		if(size.equals("B")) {
			return length/Math.pow(2, 0);
		} else if(size.equals("KB")){
			return length/Math.pow(2, 10);
		} else if(size.equals("MB")) {
			return length/Math.pow(2, 20);
		} else if(size.equals("GB")){
			return length/Math.pow(2, 30);
		} else if(size.equals("TB")){
			return length/Math.pow(2, 40);
		} else {
			return -1.0;
		}
		
	}
	
	private static String size(long length) {
		if(length < Math.pow(2, 10)) {
			return "B";
		} else if(length < Math.pow(2, 20)) {
			return "KB";
		} else if(length < Math.pow(2, 30)) {
			return "MB";
		} else if(length < Math.pow(2, 40)) {
			return "GB";
		}else {
			return "TB";
		}
	}
	
	
}









