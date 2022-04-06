import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
public class FileIO_Q02 {

	public static void main(String[] args) {

		// 2번 숫자 바꾸기
		// 0 → 영, 1 → 일 ... 9 → 구
		// 숫자.dat
		try {
			String path = "C:\\class\\java\\questionFileIO\\숫자.dat";
			BufferedReader reader = new BufferedReader(new FileReader(path));
			FileWriter writer = new FileWriter("C:\\class\\java\\questionFileIO\\숫자_변환.dat");
		
			String line = null;
			
			while((line = reader.readLine()) != null) {
				
				line = numberToString(line);
				writer.write(line);
			}
			
			reader.close();
			writer.close();
			System.out.println("변환 후 다른 이름으로 저장하였습니다.");
		} catch (Exception e) {
			System.out.println("Q02.main");
			e.printStackTrace();
		}
		
	}
	
	private static String numberToString(String line) {
		line = line.replace("0", "영");
		line = line.replace("1", "일");
		line = line.replace("2", "이");
		line = line.replace("3", "삼");
		line = line.replace("4", "사");
		line = line.replace("5", "오");
		line = line.replace("6", "육");
		line = line.replace("7", "칠");
		line = line.replace("8", "팔");
		line = line.replace("9", "구");
		return line;
	}
	

}
