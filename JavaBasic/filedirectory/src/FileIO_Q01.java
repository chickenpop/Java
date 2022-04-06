import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIO_Q01 {

	public static void main(String[] args) {
		
		// 1번 이름 바꾸기
		
		// 파일 내에서 '유재석' > '메뚜기'로 변환
		// 파일 > 이름수정.dat
		
		
		try {
			String path = "C:\\class\\java\\questionFileIO\\이름수정.dat";
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			FileWriter writer = new FileWriter("C:\\class\\java\\questionFileIO\\이름수정_변환.dat");
			
			String line = null;
			while((line = reader.readLine()) != null) {
				writer.write(line.replace("유재석", "메뚜기"));
			}
			
			reader.close();
			writer.close();
			
			System.out.println("변환 후 다른 이름으로 저장하였습니다.");
		} catch (Exception e) {
			System.out.println("Q01.main");
			e.printStackTrace();
		}
		
		
	}

}
