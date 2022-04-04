import java.io.File;
import java.util.Scanner;

public class FileDirectory_Q01 {

	public static void main(String[] args) {
		
		// 1번 파일 정보
		// 파일 경로를 입력받으면 파일명, 종류, 파일 크기를 출력함
		// 파일 크기의 단위 : B, KB, MB, GB, TB로 정한다
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("파일 경로 : ");
		String path = in.nextLine().trim();
		
		File file = new File(path);

		if(file.exists()) {
			System.out.printf("파일명 : %s\n", file.getName());
			System.out.printf("종류 : %s 파일\n", file.getName().substring(file.getName().lastIndexOf(".")+1));
			String fileSize = setStringLength(file.length());
			System.out.printf("파일 크기 : %.1f%s\n", setDoubleLength(fileSize, file.length()), fileSize);
		} else {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
		in.close();
	}
	
	private static double setDoubleLength(String size, long length) {
		if(size.equals("TB")) {
			return length/Math.pow(2, 40);
		} else if(size.equals("GB")) {
			return length/Math.pow(2, 30);
		} else if(size.equals("MB")) {
			return length/Math.pow(2, 20);
		} else if(size.equals("KB")) {
			return length/Math.pow(2, 10);
		} else {
			return length;			
		}
	}
	
	private static String setStringLength(long length) {
		if(length/Math.pow(2, 40) >= 1.0) {
			return "TB";
		} else if(length/Math.pow(2, 30) >= 1.0) {
			return "GB";
		} else if(length/Math.pow(2, 20) >= 1.0) {
			return "MB";
		} else if(length/Math.pow(2, 10) >= 1.0) {
			return "KB";
		}
		return "B";
	}
	
}









