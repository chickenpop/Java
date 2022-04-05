import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileIO_Q05 {

	public static void main(String[] args) {

		// 5번 주문 검색
		// 파일 >  검색_회원.dat, 검색_주문.dat
		
		// 이름을 입력받아 회원 주문 정보를 검색 후 출력
		// vscode 터미널에서 한글입력 시 실패함 > 실제로는 사용 가능
		try {
			String memberPath = "C:\\class\\java\\questionFileIO\\검색_회원.dat";
			String orderPath = "C:\\class\\java\\questionFileIO\\검색_주문.dat";
			
			BufferedReader memberReader = new BufferedReader(new FileReader(memberPath));
			BufferedReader orderReader = new BufferedReader(new FileReader(orderPath));
			Scanner in = new Scanner(System.in);
			
			System.out.print("이름: ");
			String name = in.nextLine();

			String line = null;
			String[] member = findMember(memberReader, name);
			
			if(member != null) {
				line = null;
				System.out.println("====구매내역====");
				System.out.println("[번호]\t[이름]\t[상품명]\t[개수]\t[배송지]");

				while((line = orderReader.readLine()) != null) {
					String[] order = line.split(",");
					//1,마우스(상품명),19(개수),53(회원정보)
					
					if(order[3].trim().equals(member[0])) {
						System.out.printf("%s\t%s\t%s\t  %s\t %s\n", member[0], member[1], order[1], order[2], member[2]);
					}
		
					
				}
			} else {
				System.out.println("일치하는 고객정보가 없습니다.");
			}
			
			orderReader.close();
			memberReader.close();
			in.close();
			
		} catch (Exception e) {
			System.out.println("Q05.main");
			e.printStackTrace();
		}
		
		
	}

	private static String[] findMember(BufferedReader reader, String name) throws IOException {
		String line = null;
		while((line = reader.readLine()) != null) {
			// 53,노석형,제주시 강서구 가동
			// 28,노길유,대구시 강북구 가동
			// 92,김석유,인천시 강동구 다동
			String[] temp = line.split(",");
			if(name.equals(temp[1].trim())) {
				return temp;
			}
		}
		return null;
	}

}
