public class Ex01_Variable {
	public static void main(String[] args) {
		// 과제
		// - 초보자
		// - 각 자료형(9개) > 변수 10개 > 문장으로 출력하시오.
		// - 자료형 + 변수 + 리터럴 + 출력
		
		// 1. 주변의 데이터 검색!! > 내 키(180cm)
		// 2. 1의 데이터가 자바의 어떤 자료형 적합한지? 매칭 > 정수 vs 실수 + 길이 > double
		// 3. 2의 자료형 > 변수 선언하기 
		// 4. 3의 변수 > 데이터 대입(자료형에 맞는 리터럴 표기법)
		// 5. 출력 > 문장으로 만들어서 출력
		
		
		// byte
	
		System.out.println("byte");
		
		byte regionCodeDvd = 3;
		System.out.println("한구 DVD 지역코드 : " + regionCodeDvd);
		
		System.out.println();
		
		// short
		
		System.out.println("short");
		System.out.println();
	
		// int
		
		System.out.println("int");
		
		int age = 25;
		System.out.println("나이는 " + age + "살입니다.");
		
		int year = 2022;
		int month = 3;
		int days = 7;
		System.out.println("현재 날짜는 "+year+"년"+month+"월"+days+"일 입니다.");
		
		int x = 0, y = 3;
		System.out.println("현재 x좌표는 "+x+"이고, y좌표는 "+y+"에 위치합니다.");
		
		int myMoney = 1000;
		System.out.println("소지액은 " + myMoney + "입니다.");
		
		int applePrice = 500;
		System.out.println("사과를 구매하여 남은 소지액은 " + (myMoney-applePrice) + "입니다.");
		
		int num1 = 20;
		int num2 = 200;
		System.out.println("num1과 num2의 덧셈 결과를 출력하시오 : "+(num1+num2));
		
		int mathGrades = 80;
		System.out.println("수학점수는 " + mathGrades + "입니다.");
		
		int toeicGrades = 800;
		System.out.println("토익점수는 " + toeicGrades + "로 확인됐습니다.");
		
		int hour = 18, min = 20, sec = 31;
		System.out.println("현재 시간은 "+hour+":"+min+":"+sec+"이다.");
		
		int krPopulation = 51780579;
		System.out.println("한국 인구수는 "+krPopulation+"명이다.");
		
		System.out.println();
		// long
		
		System.out.println("long");
		
		long tera = 1000_000_000_000L;
		System.out.println("단위 테라(T)는 십진수로 "+tera+"이다."); 
		
		long marketCap = 262_320_000_000L;
		System.out.println("현재 시가총액이 $"+marketCap+"입니다.");
		
		System.out.println();
		
		// float
		
		System.out.println("float");
		
		float height = 163.4f;
		System.out.println("제 신장은 " + height + "cm입니다.");
		
		float weight = 55.8f;
		System.out.println("현재 몸무게는 "+weight+"kg로 측정되었습니다.");
		
		float water = 3.5f;
		System.out.println("현재 물이 " + water + "L 남아있습니다.");
		
		float fileVolume = 3.42f;
		System.out.println("이 파일의 용량은 "+fileVolume+"KB이다.");
		
		float krChildPulationRatio = 12.5f;
		System.out.println("한국 14세이하 인구 구성비는 "+krChildPulationRatio+"% 이다.");
		
		float responseRate = 63.5f;
		System.out.println("설문조사 응답률은 "+responseRate+"%로 집계되었다.");
	
		float advanceTicketSales = 31.0f;
		System.out.println("실시간 영화 예매율은 "+advanceTicketSales+"%로 집계되었다.");
		
		System.out.println();
		
		// double
		System.out.println("double");
		
		double PI = 3.1415926535;
		System.out.println("이 문제는 원주율은 " + PI +"까지만 계산합니다");
	
		double distance = 1.999999;
		System.out.println("아이작 베크만의 실험에서 사용한 거리는 "+distance+"km로 알려져 있다.");
		
		
		System.out.println();
		
		// boolean
	
		System.out.println("boolean");
		boolean flag1 = false;
		System.out.println("boolean형의 저장된 가능한 것은 " + flag1 + "이 있다.");
			
		boolean flag2 = true;
		System.out.println("다른 하나는 " + flag2 + "이다.");
		
		boolean flag3 = false;
		System.out.println("명제가 거짓이라면 "+flag3+"을 출력한다.");
		
		boolean flag4 = true;
		System.out.println("명제가 참이라면 "+flag4+"을 출력한다.");
		
		boolean flag5 = true;
		System.out.println("결과는 "+flag5+"이다.");
		
		boolean flag6 = false;
		System.out.println("결과는 "+flag6+"이다.");
	
		int num3 = 1;
		boolean flag7 = (num3 == 1);
		System.out.println("num3이 1인가? "+flag7);
		
		boolean flag8 = (num3 != 1);
		System.out.println("num3은 1이 아닌가?"+flag8);
		
		num3 = 3;
		int num4 = 5;
		boolean flag9 = (num3 < num4);
		System.out.println("num3은 num4보다 작은가?"+flag9);
		
		boolean flag10 = (num3 > num4);
		System.out.println("num3은 num4보다 큰가?"+flag10);
		
		
		System.out.println();
		
		// char
		
		System.out.println("char");
		
		char score = 'A';
		System.out.println("제 학점은 "+score+"입니다");
		
		char plus = '+';
		System.out.println("점수를 95점을 넘긴 경우 "+ score +plus+"입니다.");
		
		char newLine = '\n';
		System.out.println("new line을 " + newLine +"실행한 결과이다.");
		
		char tab = '\t';
		System.out.println(tab + "tab을 실행한 결과이다.");
			
		char regionCodeBluray = 'A';
		System.out.println("한국의 블루레이 지역코드는 "+regionCodeBluray+"이다.");
		
		System.out.println();
		
		
		// String
		
		System.out.println("String");
		
		String name = "박채은";
		System.out.println("제 이름은 " + name + "입니다.");
		
		String humanNumber = "220307-4000000";
		System.out.println("제 주민번호는 " + humanNumber +"입니다.");
		
		String apple = "사과";
		System.out.println("과일 코너 첫번째 상품은 " + apple + "입니다.");
		
		String country = "한국";
		System.out.println("현재 거주국은 "+country+"이다.");
		
		String bookName = "총균쇠";
		System.out.println("도서이름은 "+ bookName+"입니다.");
	
		String americano = "americano";
		String ice = "Ice";
		System.out.println("고객님, " + ice + " " + americano + "맞으신가요?");
		
		String hot = "Hot";
		System.out.println(hot + " " + americano + "로 변경되었습니다.");
		
		String path = "C:\\class\\jdk-11.0.2\\bin";
		System.out.println("자바 JDK는 "+path+"에 위치한다.");
		
		String gmail = "@gmail.com";
		String id = "honeybadger";
		System.out.println("이메일 주소 : "+id+gmail);
			
		String google = "https://www.google.com/";
		System.out.println("구글 주소 : "+google);
			
			
	}
}

