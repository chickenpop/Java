import java.io.*;
import java.util.*;
public class MakeFile {

    public static void main(String[] args) {
        
        try {
			
            /*
            
                path의 파일 데이터는 탭으로 구분되어 있음
                path의 파일의 탭을 replace을 통해 구분자를 바꿔서 새로운 파일을 만듬
                .replace("old구분자", "new구분자"+"\n"), 라인마다 개행됨
				파일정보 확인용 코드 추가, 시도, 시군구 확인가능
            */

			//String path = "C:\\class\\java\\data\\호흡기.txt";
			String path = "C:\\class\\java\\data\\안심병원.txt";
			BufferedReader reader = new BufferedReader(new FileReader(path));
			//BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\java\\data\\test.txt"));
			
			HashSet<String> set1 = new HashSet<String>(); // 시도
			HashSet<String> set2 = new HashSet<String>(); // 시군구
			//호흡기 198
			//안심병원200
					
			String line = "";
//			int cnt = 0;
			while((line = reader.readLine()) != null) {
				//System.out.println(line);
				//writer.write(line.replace("\t", ",")+"\n");
				String[] temp = line.split(",");
	
				
//				for(int i=0; i<temp.length; i++) {
//						System.out.println(temp[i]);
//				}
				
//				if(temp[0].equals("서울")) {
//					cnt++;
//				}
				
				set1.add(temp[0]);
				set2.add(temp[1]);
				
			}
			
//			System.out.println(cnt);
			System.out.println(set1);
			System.out.println(set2);
			
			reader.close();
			//writer.close();
			
		} catch (Exception e) {
			System.out.println("test.main");
			e.printStackTrace();
		}

    }

    
}
