import java.io.FileReader;
import java.util.Stack;

public class FileIO_Q06 {

	public static void main(String[] args) {

		// 6번 괄호 검사
		// 대상 괄호 (), {}
		// Stack 사용
		// 파일 > 괄호.dat
		
		// 정상: 올바른 소스입니다.
		// 비정상: 올바르지 않은 소스입니다.
		try {

			String path = "C:\\class\\java\\questionFileIO\\괄호.java";
			//String path = "C:\\class\\java\\JavaTest\\src\\com\\test\\java\\Ex20_if.java";
			Stack<Character> stack = new Stack<Character>();
			FileReader reader = new FileReader(path);
			
			int count = 0;
			int code = -1;
			
			while((code = reader.read()) != -1) {
				if((char)code == '(' || (char)code == '{') {
					count += 1;
					stack.push((char)code);
				} 
				if((char)code == ')' || (char)code == '}') {
					char pair = stack.pop();
					if((pair == '(' && (char)code != ')')||(pair == '{' && (char)code != '}')) {
						System.out.println("올바르지 않은 소스 입니다.");
						break;
					}
					count -= 1;
				}
			}
			if(count == 0) {
				System.out.println("올바른 소스입니다.");
			} 
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Q06.main");
			e.printStackTrace();
		}
		
		
	}

}
