import java.io.File;
import java.util.HashMap;
import java.util.Set;

public class FileDirectory_Q05 {

	public static void main(String[] args) {

		// 5번 확장자 카운트
		// 확장자별로 카운트
		// 새로운 확장자가 추가되도 동작
		
		File dir = new File("C:\\class\\java\\questionFile\\확장자별 카운트");
		File[] file = dir.listFiles();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(File f : file) {
			if(f.isFile()) {
				String temp = "*"+f.getName().substring(f.getName().lastIndexOf("."));
				if(map.containsKey(temp)) {
					int count = map.get(temp);
					map.put(temp, count+1);
				} else {
					map.put(temp, 1);
				}
			}
		}
		
		Set<String> keySet = map.keySet();
		for(String key: keySet) {
			System.out.println(key + " : " + map.get(key) + "개");
		}
		
		
	}

}





