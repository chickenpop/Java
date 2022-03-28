public class Modifier_Q02 {

	public static void main(String[] args) {

		// 2번 문제 static
		/*
		
			static 변수를 이용하는 문제
			Barista라는 클래스 안에 다양한 커피 종류의 클래스를 관리
			Coffee라는 공용 클래스를 만들어 Barista 클래스가 효율적으로 공통된 요소를 저장하게 해줌
			코드 추가/변경)Coffee 클래스 static {} 을 활용해 초기화해주는 코드
			Espresso, Latte, Americano 클래스는 각자 고유의 요소를 갖고 그에 따른 결과를 출력
			커피 종류 클래스를 활용해 참조 배열을 만들어 한번에 많은 데이터를 처리함

		*/

		//바리스타
		Barista barista = new Barista();

		//손님 1
		//에스프레소 1잔 주문 - 원두 30g
		Espresso e1 = barista.makeEspresso(30);
		e1.drink();

		//손님 2
		//라테 1잔 주문 - 원두 30g, 우유 250ml
		Latte l1 = barista.makeLatte(30, 250);
		l1.drink();
		
		//손님 3
		//아메리카노 1잔 주문 - 원두 30g, 물 300ml, 각얼음 20개
		Americano a1 = barista.makeAmericano(30, 300, 20);
		a1.drink();

		//손님 4
		//에스프레소 10잔 주문 - 원두 25g
		Espresso[] e2 = barista.makeEspressoes(25, 10);

		for (Espresso e : e2) {
		      e.drink();
		}

		//손님 5
		//라테 5잔 주문 - 원두 25g, 우유 300ml
		Latte[] l2 = barista.makeLattes(25, 300, 5);

		for (Latte l : l2) {
		      l.drink();
		}
		
		//손님 6
		//아메리카노 15잔 주문 - 원두 20g, 물 350ml, 각얼음 30개
		Americano[] a2 = barista.makeAmericanos(20, 350, 30, 15);

		for (Americano a : a2) {
		      a.drink();
		}

		//결산
		barista.result();
		
		
	}

}

class Barista {
	
	private Espresso espresso;
	private Latte latte;
	private Americano americano;
	private Espresso[] espressoes;
	private Latte[] lattes;
	private Americano[] americanos;

	private void coffeePrice(int bean){
		coffeePrice(bean, 0, 0, 0, "Espresso");
	}
	
	private void coffeePrice(int bean, int milk){
		coffeePrice(bean, milk, 0, 0, "Latte");
	}

	private void coffeePrice(int bean, int water, int ice){
		coffeePrice(bean, 0, water, ice, "Americano");
	}

	private void coffeePrice(int bean, int milk, int water, int ice, String menu){
		// 재료량
		Coffee.setBean(bean);
		Coffee.setMilk(milk);
		Coffee.setWater(water);
		Coffee.setIce(ice);

		// 커피 메뉴에 따른 재료 매출
		Coffee.setBeanTotalPrice(bean*Coffee.getBeanUnitPrice());
		Coffee.setMilkTotalPrice(milk*Coffee.getMilkUnitPrice());
		Coffee.setWaterTotalPrice((int)(water*Coffee.getWaterUnitPrice()));
		Coffee.setIceTotalPrice(ice*Coffee.getIceUnitPrice());
		
		// 커피 메뉴 1잔추가 고정
		if(menu.equals("Espresso")){
			Coffee.setEspresso(1);
		} else if(menu.equals("Latte")){
			Coffee.setLatte(1);
		} else if(menu.equals("Americano")){
			Coffee.setAmericano(1);
		} else {
			return;
		}
	}

	public Espresso makeEspresso(int bean) {
		
		espresso = new Espresso();
		espresso.setBean(bean);
		
		// 커피 콩 원두량 추가, 에스프레소 잔 추가
		coffeePrice(bean);
		return espresso;
	}
	
	
	public Latte makeLatte(int bean, int milk) {
		
		latte = new Latte();
		latte.setBean(bean);
		latte.setMilk(milk);
		
		coffeePrice(bean, milk);

		return latte;
	}
	
	public Americano makeAmericano(int bean, int water, int ice) {
		
		americano = new Americano();
		
		americano.setBean(bean);
		americano.setWater(water);;
		americano.setIce(ice);
		
		coffeePrice(bean, water, ice);
		
		return americano;
	}
	
	
	public Espresso[] makeEspressoes(int bean, int cups) {
		
		espressoes = new Espresso[cups];
		
		for(int i=0; i<espressoes.length; i++) {
			espressoes[i] = new Espresso();
			espressoes[i].setBean(bean);
			coffeePrice(bean);
		}
		
		return espressoes;
	}
	
	public Latte[] makeLattes(int bean, int milk, int cups) {
		
		lattes = new Latte[cups];
		for(int i=0; i<lattes.length; i++) {
			lattes[i] = new Latte();
			lattes[i].setBean(bean);
			lattes[i].setMilk(milk);;
			
			coffeePrice(bean, milk);
			
		}
	
		
		return lattes;
	}
	
	public Americano[] makeAmericanos(int bean, int water, int ice, int cups){
		
		americanos = new Americano[cups];
		
		for(int i=0; i<americanos.length; i++) {
			americanos[i] = new Americano();
			americanos[i].setBean(bean);
			americanos[i].setWater(water);
			americanos[i].setIce(ice);

			coffeePrice(bean, water, ice);
		}
		
		return americanos;
	}
	
	public void result(){
		
		System.out.println("==============================");
		System.out.println("판매결과");
		System.out.println("==============================");
		
		System.out.println("--------------------");
		System.out.println("음료 판매량");
		System.out.println("--------------------");
		System.out.printf("에스프레소 : %d잔\n", Coffee.getEspresso());
		System.out.printf("아메리카노 : %d잔\n", Coffee.getAmericano());
		System.out.printf("라떼 : %d잔\n", Coffee.getLatte());
		
		System.out.println("--------------------");
		System.out.println("원자재 소비량");
		System.out.println("--------------------");
		System.out.printf("원두 : %,dg\n", Coffee.getBean());
		System.out.printf("물 : %,dml\n", Coffee.getWater());
		System.out.printf("얼음 : %,d개\n", Coffee.getIce());
		System.out.printf("우유 : %,dml\n", Coffee.getMilk());
		
		System.out.println("--------------------");
		System.out.println("매출액");
		System.out.println("--------------------");
		System.out.printf("원두 : %,d원\n", Coffee.getBeanTotalPrice());
		System.out.printf("물 : %,d원\n", Coffee.getWaterTotalPrice());
		System.out.printf("얼음 : %,d원\n", Coffee.getIceTotalPrice());
		System.out.printf("우유 : %,d원\n", Coffee.getMilkTotalPrice());
		
	}
	
}

class Coffee {
	
	private static int bean;	// 총 원두량(g)
	private static int water;	// 총 물 용량(ml)
	private static int ice;		// 총 얼음 개수(개)
	private static int milk;	// 총 우유 용량(ml)
	private static int beanUnitPrice;	// 원두 단가 1g 당 1원
	private static double waterUnitPrice;	// 물 단가(원) 1ml 당 0.2원
	private static int iceUnitPrice;	// 얼음 단가(원) 1개당 3원
	private static int milkUnitPrice; 	// 우유 단가(원) 1ml당 4원
	private static int beanTotalPrice;	// 원두 총 판매액(원)
	private static int waterTotalPrice; // 물 총 판매액(원)
	private static int iceTotalPrice; 	// 얼음 총 판매액(원)
	private static int milkTotalPrice; 	// 우유 총 판매액(원)
	private static int americano;	// 아메리카노 총 판매 개수(잔)
	private static int latte; 		// 라테 총 판매 개수(잔)
	private static int espresso;	// 에스프레소 총 판매 개수(잔)
	
	static {
		beanUnitPrice = 1;
		waterUnitPrice = 0.2;
		iceUnitPrice = 3;
		milkUnitPrice = 4;
	}
	
	public static int getBean() {
		return bean;
	}
	public static void setBean(int bean) {
		Coffee.bean += bean;
	}
	public static int getWater() {
		return water;
	}
	public static void setWater(int water) {
		Coffee.water += water;
	}
	public static int getIce() {
		return ice;
	}
	public static void setIce(int ice) {
		Coffee.ice += ice;
	}
	public static int getMilk() {
		return milk;
	}
	public static void setMilk(int milk) {
		Coffee.milk += milk;
	}
	public static int getBeanUnitPrice() {
		return beanUnitPrice;
	}
	public static double getWaterUnitPrice() {
		return waterUnitPrice;
	}
	public static int getIceUnitPrice() {
		return iceUnitPrice;
	}
	public static int getMilkUnitPrice() {
		return milkUnitPrice;
	}
	public static int getBeanTotalPrice() {
		return beanTotalPrice;
	}
	public static void setBeanTotalPrice(int beanTotalPrice) {
		Coffee.beanTotalPrice += beanTotalPrice;
	}
	public static int getWaterTotalPrice() {
		return waterTotalPrice;
	}
	public static void setWaterTotalPrice(int waterTotalPrice) {
		Coffee.waterTotalPrice += waterTotalPrice;
	}
	public static int getIceTotalPrice() {
		return iceTotalPrice;
	}
	public static void setIceTotalPrice(int iceTotalPrice) {
		Coffee.iceTotalPrice += iceTotalPrice;
	}
	public static int getMilkTotalPrice() {
		return milkTotalPrice;
	}
	public static void setMilkTotalPrice(int milkTotalPrice) {
		Coffee.milkTotalPrice += milkTotalPrice;
	}
	public static int getAmericano() {
		return americano;
	}
	public static void setAmericano(int americano) {
		Coffee.americano += americano;
	}
	public static int getLatte() {
		return latte;
	}
	public static void setLatte(int latte) {
		Coffee.latte += latte;
	}
	public static int getEspresso() {
		return espresso;
	}
	public static void setEspresso(int espresso) {
		Coffee.espresso += espresso;
	}
	
}

class Espresso{
	
	private int bean;
	
	public int getBean() {
		return bean;
	}

	public void setBean(int bean) {
		this.bean = bean;
	}

	void drink() {
		System.out.printf("%dg으로 만들어진 에스프레소를 마십니다.\n", this.bean);
	}
	
}

class Latte {
	
	private	int bean;
	private int milk;

	public int getBean() {
		return bean;
	}

	public void setBean(int bean) {
		this.bean = bean;
	}

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}

	public void drink() {
		System.out.printf("원두 %dg, 우유 %dml으로 만들어진 라떼를 마십니다.\n", this.bean, this.milk);
	}
	
}


class Americano {
	
	private int bean;
	private int water;
	private int ice;
	
	public int getBean() {
		return bean;
	}

	public void setBean(int bean) {
		this.bean = bean;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public int getIce() {
		return ice;
	}

	public void setIce(int ice) {
		this.ice = ice;
	}

	public void drink() {
		System.out.printf("원두 %dg, 물 %dml, 얼음 %d개로 만들어진 아메리카노를 마십니다.\n", 
							this.bean, 
							this.water, 
							this.ice);
	}
}

