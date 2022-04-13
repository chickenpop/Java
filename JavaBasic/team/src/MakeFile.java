import java.io.*;

public class MakeFile {

    public static void main(String[] args) {
        
        try {
			
            /*
            
                path의 파일 데이터는 탭으로 구분되어 있음
                path의 파일의 탭을 replace을 통해 구분자를 바꿔서 새로운 파일을 만듬
                .replace("old구분자", "new구분자"+"\n"), 라인마다 개행됨

            */
			String path = "현재파일경로";
			BufferedReader reader = new BufferedReader(new FileReader(path));
			BufferedWriter writer = new BufferedWriter(new FileWriter("새로운파일경로"));
			
			String line = "";
			while((line = reader.readLine()) != null) {
				System.out.println(line);
				writer.write(line.replace("\t", ",")+"\n");
				
			}
			reader.close();
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

    }

    
}
