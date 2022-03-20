public class Array_Q06 {

	public static void main(String[] args) {

		// com.test.java.question.array > "Q06.java"
		
		// 6번 문제 로또
		
		// 객체, 변수 생성
		int[] lotto = new int[6];
		
		// 중복없는 난수 넣기
		int index = 0;
		while(index < lotto.length) {
			
			lotto[index] = (int)(Math.random()*45)+1;
			for(int i=0; i<index; i++) {
				
				if(lotto[index] == lotto[i]) {
					index--;
					break;
				}
				
			}
			index++;
			
		}
		
		// 로또 번호 정렬
		for(int i=0; i<lotto.length-1; i++) {
			
			for(int j=0; j<lotto.length-i-1; j++) {
				
				if(lotto[j]>lotto[j+1]) {
					
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
					
				}
				
			}
			
		}
		
		// 출력
		// [1, 5, 23, 36, 37, 41]
		System.out.println(dump(lotto));
		
		
	}
	
	public static String dump(int[] list) {
		
		String result = "[";
		
		for(int i=0; i<list.length; i++) {
			
			if(i==list.length-1) {
				result += list[i] + "]";
				break;
			}
			result += list[i] + ", ";
			
		}
		
		return result;
	}

}
