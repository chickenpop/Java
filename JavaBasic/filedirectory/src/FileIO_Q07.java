import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class FileIO_Q07 {

	public static void main(String[] args) {

		// 7번 근태
		/*

			직원들의 지각과 조퇴를 카운트
			출근 : 오전 9시
			퇴근 : 오후 6시
			출결.dat
			전체 직원의 출결 상황을 출력 
			데이터 형식 :2018-8-28,김재동,6:18,19:6

			문제점 : 전체 직원의 출결 상황을 확인하는 거라 HashMap 키가 같았지만
			다른 경우 출력에 대해 고민하지 못한거 같음

		*/
		
		try {
			String path = "C:\\class\\java\\questionFileIO\\출결.dat";
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			ArrayList<Worker> list = new ArrayList<Worker>();
			// 지각과 조퇴에 관한 HashMap
			HashMap<String, Integer> onMap = new HashMap<String, Integer>();
			HashMap<String, Integer> offMap = new HashMap<String, Integer>();
			
			load(reader, list);
			
			reader.close();
			
			for(Worker w : list) {
				
				comeLate(onMap, w);
				
				leaveEarly(offMap, w);
				
			} // for
			
			System.out.println("[이름]\t[지각]\t[조퇴]");
			Set<String> keySet = onMap.keySet(); // 모든 직원을 대상으로 해서 onMap, offMap의 직원 키는 동일하다
			for(String key: keySet) {
				System.out.printf("%s\t%3s회\t%3s회\n", key, onMap.get(key), offMap.get(key));
			}
			
			System.out.println();
			
		} catch (Exception e) {
			System.out.println("Q07.main");
			e.printStackTrace();
		}
		
	}

	private static void leaveEarly(HashMap<String, Integer> offMap, Worker w) {
		String[] tmp = w.getOffTime().split(":");
		if( Integer.parseInt(tmp[0]) < 18) {
			
			if(offMap.containsKey(w.getName())) {
				int count = offMap.get(w.getName());
				offMap.put(w.getName(), count+1);
			} else {
				offMap.put(w.getName(), 1);
			}
			
		} else {
			if(offMap.containsKey(w.getName())) {
				int count = offMap.get(w.getName());
				offMap.put(w.getName(), count+0);
			} else {
				offMap.put(w.getName(), 0);
			}
		}
	}

	private static void comeLate(HashMap<String, Integer> onMap, Worker w) {
		String[] temp = w.getOnTime().split(":");
		if( Integer.parseInt(temp[0]) >= 9 && Integer.parseInt(temp[1]) > 0) {
			
			if(onMap.containsKey(w.getName())) {
				int count = onMap.get(w.getName());
				onMap.put(w.getName(), count+1);
			} else {
				onMap.put(w.getName(), 1);
			}
			
		} else {
			if(onMap.containsKey(w.getName())) {
				int count = onMap.get(w.getName());
				onMap.put(w.getName(), count+0);
			} else {
				onMap.put(w.getName(), 0);
			}
		}
	}

	private static void load(BufferedReader reader, ArrayList<Worker> list) throws IOException {
		String line = null;
		while((line = reader.readLine()) != null) {
			String[] temp = line.split(",");
			
			Worker worker = new Worker(temp[0], temp[1], temp[2], temp[3]);
			list.add(worker);

		}
	}

}

class Worker {
	private String date;
	private String name;
	private String onTime;
	private String offTime;
	
	public Worker(String date, String name, String onTime, String offTime) {
		this.date = date;
		this.name = name;
		this.onTime = onTime;
		this.offTime = offTime;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOnTime() {
		return onTime;
	}

	public void setOnTime(String onTime) {
		this.onTime = onTime;
	}

	public String getOffTime() {
		return offTime;
	}

	public void setOffTime(String offTime) {
		this.offTime = offTime;
	}

	@Override
	public String toString() {
		return "worker [date=" + date + ", name=" + name + ", onTime=" + onTime + ", offTime="
				+ offTime + "]";
	}
	
	
}
