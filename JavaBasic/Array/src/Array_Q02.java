import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array_Q02 {

	public static void main(String[] args) throws Exception {

		// com.test.java.question.array > "Q02.java"
		
		// 2번 문제 이름 정렬
		
		// 객체, 변수 생성
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int studentCnt = 0;
		String[] studentName;
		
		// 입력
		System.out.print("학생 수 : ");
		studentCnt = Integer.parseInt(reader.readLine());
		
		studentName = new String[studentCnt];
		for(int i=0; i<studentName.length; i++) {
			
			System.out.print("학생명 : ");
			studentName[i] = reader.readLine();
			
		}
		
		for(int i=0; i<studentName.length-1; i++) {
			
			for(int j=0; j<studentName.length-i-1; j++) {
				
				if(studentName[j].compareTo(studentName[j+1]) > 0) {
					
					String temp = studentName[j];
					studentName[j] = studentName[j+1];
					studentName[j+1] = temp;
					
				}
				
			}
	
		}
		
		System.out.printf("입력한 학생은 총 %d명입니다.\n", studentCnt);
		for(int i=0; i<studentName.length; i++) {
			
			System.out.printf("%d. %s\n", i+1, studentName[i]);
			
		}
		
	}

}








