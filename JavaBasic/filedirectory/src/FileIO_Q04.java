import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class FileIO_Q04 {

	public static void main(String[] args) {

		// 4번 회원 검색
		// 이름을 입력 받아 회원 정보를 검색 후 출력하시오.
		// 파일 > 단일검색.dat
		
		// 이름 : 홍길동
		/*
		 	[홍길동] 
			번호: 33 
			주소: 서울시 강남구 역삼동 
			전화: 010-2345-6789 
		*/
		
		try {
			String path = "C:\\class\\java\\questionFileIO\\단일검색.dat";
			BufferedReader reader = new BufferedReader(new FileReader(path));
			Scanner in = new Scanner(System.in);
			
			System.out.print("이름 : ");
			String name = in.nextLine();
			
			String line = null;
			while((line = reader.readLine()) != null) {
				// 파일 정보, 무작위로 복사함
				// 1,유게무,광주시 강동구 다동, 010-3086-6664
				// 27,노명명,강릉시 강남구 가동, 010-5343-7832
				// 65,전유재,서울시 강북구 마동, 010-5417-3487
				String[] temp = line.split(",");
				if(temp[1].equals(name)) {
					System.out.printf("[%s]\n", temp[1]);
					System.out.printf("번호: %s\n", temp[0]);
					System.out.printf("주소: %s\n", temp[2]);
					System.out.printf("전화: %s\n", temp[3].trim()); // 공백 제거
				}
			}
			
			reader.close();
			in.close();
			
		} catch (Exception e) {
			System.out.println("Q04.main");
			e.printStackTrace();
		}
		
	}

}
