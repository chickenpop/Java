import java.io.File;
import java.util.Scanner;

public class FileDirectory_Q03 {

	public static void main(String[] args) {

		// 3번 파일이동
		// 경로 1에서 경로2로 파일이 이동함
		// 둘 파일명은 같기 때문에 덮어쓰기나 작업을 취소하는 것중 고를 수 있음
		// 현재는 덮어쓰기하는 경우 경로2의 파일을 지우고 경로 1의 파일을 옮김

		Scanner in = new Scanner(System.in);
		
		String path = "경로1";
		String path2 = "경로2";
		
		File file = new File(path);
		File file2 = new File(path2);
		
		
		if(file2.exists()) {
			System.out.println("파일이동을 실행합니다.");
			System.out.print("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n)");
			String input = in.nextLine();
			if(input.equalsIgnoreCase("y")) {
				file2.delete();
				file.renameTo(file2);
				System.out.println("y. 파일 덮어썼습니다.");
			} else {
				System.out.println("n. 작업을 취소합니다.");
			}
		}
		
		in.close();
		
	}

}
