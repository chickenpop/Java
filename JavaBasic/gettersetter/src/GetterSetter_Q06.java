import java.util.Calendar;

public class GetterSetter_Q06 {

	public static void main(String[] args) {

		// 6번 문제 Refrigerator
		
		Refrigerator r = new Refrigerator();

		Item item1 = new Item();
		item1.setName("김치");
		item1.setExpiration("2022-4-9");
		r.add(item1);//냉장고에 넣기

		Item item2 = new Item();
		item2.setName("깍두기");
		item2.setExpiration("2022-4-3");
		r.add(item2);//냉장고에 넣기

		Item item3 = new Item();
		item3.setName("멸치볶음");
		item3.setExpiration("2022-4-4");
		r.add(item3);//냉장고에 넣기

		Item item4 = r.get("깍두기");//냉장고에서 꺼내기
		System.out.printf("%s의 유통기한 : %s\n", item4.getName(), item4.getExpiration());

		System.out.printf("냉장고 안의 총 아이템 개수 : %d개\n", r.count());

		r.listItem();
		
	}

}


class Refrigerator {
	
    private Item[] items = new Item[100];
    private int[] cnt = new int[100];
    
    Refrigerator() {
    	
    	for(int i=0; i<items.length; i++) {
    		
    		items[i] = new Item();
    		
    	}
    	
    }
    int add = 0;
    public void add(Item item) {
    	if(add == 100) {
    		System.out.println("더 이상 물건을 넣을수 없습니다.");
    		return;
    	}
    	
    	this.items[add] = item;
    	System.out.printf("'%s'를 냉장고에 넣었습니다.\n", items[add].getName());
    	cnt[add] = 1;
    	add++;
    	
    }
   
    public Item get(String name) {
    	
    	for(int i=0; i < items.length; i++) {
    		if(items[i].getName().equals(name)) {
    			cnt[i] = 0;
    			return items[i];
    		}
    	}
    	
    	return null;
    }
    
    public int count() {
    	int sum = 0;
    	for(int i=0; i<cnt.length;i++) {
    		sum += cnt[i];
    	}
    	
    	return sum;
    }

    public void listItem() {
    	
    	for(int i=0; i<cnt.length; i++) {
    		if(cnt[i] != 0) {
    			System.out.printf("%s(%s)\n", items[i].getName(), items[i].getExpiration());
    		}
    	}
    	
    }
}

class Item {
    private String name;
    private Calendar expiration;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpiration() {
		return String.format("%tF", this.expiration);
	}
	public void setExpiration(String expiration) {
		
		this.expiration = Calendar.getInstance();
		
		int year = Integer.parseInt(expiration.substring(0, expiration.indexOf("-")));
		int month = Integer.parseInt(expiration.substring(expiration.indexOf("-")+1, expiration.lastIndexOf("-")));
		int day = Integer.parseInt(expiration.substring(expiration.lastIndexOf("-")+1));
		
		this.expiration.set(year, month-1, day);
		
	}
}
