import java.util.Calendar;

public class GetterSetter_Q03 {

	public static void main(String[] args) {

		// 3번 문제 Bugles
		Bugles snack = new Bugles();

		snack.setSize(850);
		snack.setCreationTime("2022-3-20");
		System.out.println("가격 : " + snack.getPrice() + "원");
		System.out.println("유통 기한이 " + snack.getExpiration() + "일 남았습니다.");

		snack.eat();
	}

}


class Bugles {
	private int price;
	private int weight;
    private Calendar creationTime;
    private int expiration;

    // 무게 종류
    private int[] weightList = { 300, 500, 850 };
    
    //getter, setter 구현
    public int getPrice() {
    	return price;
    }
    
    public void setSize(int weight) {
    	if(checkWeight(weight)) {
    		this.weight = weight;
    		setPrice(weight);
    		setExpiration(weight);
    	} else {
    		System.out.println("범위 외 용량을 입력하셨습니다.");
    	}
    }
    
	public void setCreationTime(String date) {
    	
		creationTime = Calendar.getInstance();
		
		int year = Integer.parseInt(date.substring(0, date.indexOf("-")));
		int month = Integer.parseInt(date.substring(date.indexOf("-")+1, date.lastIndexOf("-")));
		int day = Integer.parseInt(date.substring(date.lastIndexOf("-")+1));
		creationTime.set(year, month-1, day);
				
    }
    
	public int getExpiration() {
		
		Calendar nowTime = Calendar.getInstance();
		
		long nowDate = nowTime.getTimeInMillis()/ 1000 / 60 / 60 / 24;
    	long creationTimeDate = creationTime.getTimeInMillis()/ 1000 / 60 / 60 / 24;
    	
    	this.expiration = (int)(expiration - (nowDate - creationTimeDate)); // 유통기한 - 현재 - 제조일
    	
		return expiration;
		
	}
	
	// check
	private boolean checkWeight(int weight) {
		
		for(int i=0; i<weightList.length; i++) {
			if(weightList[i] == weight) {
				return true;
			}
		}
		
		return false;
	}
	
	// 기능
	private void setPrice(int weight) {
		if(weightList[0] == weight) {
			this.price = 850;
		} else if(weightList[1] == weight) {
			this.price = 1200;
		} else if(weightList[2] == weight) {
			this.price = 1950;
		} 
		
	}
	
	private void setExpiration(int weight) {
			
		if(weight == 300) {
			this.expiration = 7;
		} else if(weight == 500) {
			this.expiration = 10;
		} else if(weight == 850) {
			this.expiration = 15;
		}
		
	}
	
    // 먹기
    public void eat() {

    	if(checkWeight(weight)) {
	    	if(this.expiration >= 0) {
	    		System.out.println("과자를 맛있게 먹습니다.");
	    	} else {
	    		System.out.println("유통기한이 지나 먹을 수 없습니다.");
	    	}
    	} else {
    		System.out.println("무게가 유효하지 않아 먹을수없습니다.");
    	}
    	
    }

}