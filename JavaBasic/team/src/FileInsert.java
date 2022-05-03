import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
/*
 	<README>
 	
 	현재 기능 목록 
 	- 문자열, 숫자 인식
 	- 구분자 교체
 	- 작은 따옴표 옵션
 
	oldpath 	= 변경 전 파일 경로
	newPath 	= 변경 후 파일 경로
  	
  	oldtxt = "\t"; // 현재 구분자
	newtxt = ",";  // 바꾸고 싶은 구분자
	
	옵션
	- 작은 따옴표 옵션 optionNewTxt(t, true/false)
		- optionFlag 조작하면 됨
		- true : 앞쪽만 작은 따옴표 추가
		- false : 양쪽 다 작은 따옴표 추가
		
	테스트 파일 사용법
	- oldPath = castTest.txt 경로
	- newPath = castResult.txt 경로(파일이 없어도 됨)
	- 경로 설정 후 실행
	- castResult.txt 파일 확인
  
  	공백도 문자 취급하는 법
  	- 문자열 조작가능에서 !t.equals(" ") 삭제
  	- 주의! 따옴표 옵션을 같이 적용받음 
  
*/
public class FileInsert {
		
	public static void main(String[] args) {
		
		try {
			
			
			String oldPath = "변경 전 파일 경로"; 
			String newPath = "변경 후 파일 경로"; 
			String oldtxt = "\t"; 		// 현재 구분자
			String newtxt = ",";  		// 바꿀 구분자
			boolean optionFlag = true;  // 작은 따옴표 조작
			
			BufferedReader reader = new BufferedReader(new FileReader(oldPath));
			BufferedWriter writer = new BufferedWriter(new FileWriter(newPath)); // 수정된 파일 경로
					
			String line = "";
			while((line = reader.readLine()) != null) {
				
				String[] tmp = line.split("\t");
				String temp = "";
				int cnt = 0;
				for(String t : tmp) {

					if(cnt == tmp.length-1) {
						temp += t;
					} else {
						if(isString(t) && !t.equals("null") && !t.equals(" ")) { // 문자열 조작가능
							t = optionNewTxt(t, optionFlag); 

							temp += t + "\t";
							cnt++;
						}else { 												 // 숫자 조작가능
							temp += t + "\t";
							cnt++;
						}
					}
				}
				
				line = temp;
				
				writer.write(line.replace(oldtxt, newtxt)+"\n"); // replace(탭, 쉼표) 탭 > 쉼표
				System.out.println(line);
			
			}
			
			reader.close();
			writer.close();
			
			
		} catch (Exception e) {
			System.out.println("fileinsert.main");
			e.printStackTrace();
		}
		
		
	}

	private static boolean isString(String t) { 
		char[] ch = t.toCharArray();
		boolean flag = false;
		for(char c : ch) {
			if(!Character.isDigit(c)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	private static String optionNewTxt(String t, boolean flag) {
		if(flag) {
			return t.replace(t, "\'"+t);
		}else {
			return t.replace(t, "\'"+t+"\'");
		}
	}

	
}
