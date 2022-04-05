import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileIO_Q03 {

	public static void main(String[] args) {

		// 3번 성적 처리
		// 합격 조건: 3과목 평균 60점 이상
		// 과락 조건: 1과목 40점 미만
		
		// 파일: 성적.dat
		
		try {
			String path = "C:\\class\\java\\questionFileIO\\성적.dat";
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			ArrayList<String> listPass = new ArrayList<String>();
			ArrayList<String> listFail = new ArrayList<String>();
			
			String line = null;
			while((line = reader.readLine()) != null) {
				// 파일 구성
				// 이름, 국어, 영어, 수학
				String[] score = line.split(",");
				extracted(listPass, listFail, score);
				
				
			}
			
			System.out.println("[합격자]");
			for(String name : listPass) {
				System.out.println(name);
			}
			System.out.println();
			
			System.out.println("[불합격자]");
			for(String name : listFail) {
				System.out.println(name);
			}
			System.out.println();
			
			reader.close();
		
		} catch (Exception e) {
			System.out.println("Q03.main");
			e.printStackTrace();
		}
		
	} // main

	private static void extracted(ArrayList<String> listPass, ArrayList<String> listFail,
			String[] score) {
		int totalscore = 0;
		for(int i=1; i<score.length; i++) {
			if(Integer.parseInt(score[i]) < 40) {
				listFail.add(score[0]);
				break;
			}else {
				totalscore += Integer.parseInt(score[i]);
			}
			
			if(score.length-1 == i) {
				int avg = totalscore/3;
				if(avg >= 60) {
					listPass.add(score[0]);
				} else {
					listFail.add(score[0]);
				}
			}
			
		}	

	}

} // public class
