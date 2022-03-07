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
		
		byte byteMax = Byte.MAX_VALUE;
		System.out.println("byte 범위의 최댓값 : "+byteMax);
		
		byte byteMin = Byte.MIN_VALUE;
		System.out.println("byte 범위의 최솟값 : "+byteMin);
		
		byte regionCodeDvd = 3;
		System.out.println("한국 DVD 지역코드 : " + regionCodeDvd);
		
		byte quarter = 1;
		System.out.println("지금은 "+quarter+"분기가 시작되었다.");
		
		byte round = 3;
		System.out.println(round+"라운드가 시작되었다.");
		
		byte busPassenger = 30;
		System.out.println("정원 40명인 버스에 "+busPassenger+"명이 탑승하였습니다.");
		
		byte busLounge = 28;
		System.out.println("현재 이천행 버스는 "+busLounge+"번 라운지에서 탈 수 있습니다.");
		
		byte photoCnt = 2;
		System.out.println("증명사진 "+photoCnt+"개 출력을 선택하셨습니다.");
		
		byte month1 = 3;
		byte lastDay = 31;
		System.out.println(month1+"의 마지막 날은 "+lastDay+"까지 있습니다.");
		
		byte elevatorPersonnel = 10;
		System.out.println("정원은 "+elevatorPersonnel+"명입니다.");
		
		System.out.println();
		
		// short
		
		System.out.println("short");
		
		short s1 = 10000;
		System.out.println("short로 수 출력하기 : "+s1);
		
		short shortMax = Short.MAX_VALUE;
		System.out.println("short 범위의 최댓값 : "+shortMax);
		
		short shortMin = Short.MIN_VALUE;
		System.out.println("short 범위의 최솟값 : "+shortMin);
		
		short s2 = 30000;
		short s3 = -30000;
		System.out.println("short형의 s2, s3의 차이는 "+Short.compare(s2, s3)+"이다.");
		
		short characterLevel = 200;
		System.out.println("캐릭터의 레벨:"+characterLevel);
		
		short R = 200;
		short G = 230;
		short B = 100;
		System.out.println("현재 R, G, B 비율(범위:0~255) = "+R+":"+G+":"+B);
		
		short widthResolution = 1280;
		short heightResolution = 1024;
		System.out.println("해상도 선택 : "+widthResolution+"x"+heightResolution);
		
		short electricityBill = 1600;
		System.out.println("전기 기본 요금은 "+electricityBill+"원입니다.");
		
		short paymentMin = 1000;
		System.out.println(paymentMin+"원 이하는 카드 결제할 수 없습니다.");
		
		short mp3 = 200;
		System.out.println("소형 mp3에 "+mp3+"곡이 있습니다.");
		
		System.out.println();
		
		// int
		
		System.out.println("int");
		
		int age = 25;
		System.out.println("나이는 " + age + "살입니다.");
		
		int year = 2022;
		int month2 = 3;
		int days = 7;
		System.out.println("현재 날짜는 "+year+"년"+month2+"월"+days+"일 입니다.");
		
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
		
		long bankAccount = 1000000000000L;
		System.out.println("잔고 : "+bankAccount+"원");
		
		long factorial = 87178291200L;
		System.out.println("14 팩토리얼 값 : "+factorial);
		
		long sunAge = 4603000000L;
		System.out.println("태양의 나이는 약"+sunAge+"로 계산되었다.");
		
		long view = 123456789012L;
		System.out.println("채널의 조회수:"+view);
		
		long worldPopulation = 7929905849L;
		System.out.println("세계 인구수는 "+worldPopulation+"명으로 집계되었다.");
		
		long idolFandom = 721405849L;
		System.out.println("현재 아이돌 팬덤 규모는 "+idolFandom+"로 추정된다.");
		
		long cityGarbage = 20000000000L;
		System.out.println("도시 쓰레기 배출량이 "+cityGarbage+"톤을 넘겼다.");
		
		long apartmentPrice = 7000000000L;
		System.out.println("이 아파트는 "+apartmentPrice+"원으로 거래된다.");
				
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
		
		float BMI = 21.9f;
		System.out.println("당신의 BMI는 "+BMI+"이다.");
		
		float FAT =  23.3f;
		System.out.println("당신의 체지방률은 "+FAT+"%로 나왔습니다.");
		
		float bodyWater = 54.8f;
		System.out.println("성인여성 평균 체수분률은 55~58%이고, 당신의 체수분률은 "+bodyWater+"로 측정되었습니다.");
		
		System.out.println();
		
		// double
		
		System.out.println("double");
		
		final double PI = 3.1415926535;
		System.out.println("이 문제는 원주율은 " + PI +"까지만 계산합니다");
		
		double distance = 1.999999;
		System.out.println("아이작 베크만의 실험에서 사용한 거리는 "+distance+"km로 알려져 있다.");
		
		double nano = 0.000000001;
		System.out.println("나노(nano)단위는 "+nano+"이다.");
		
		int r = 4;
		double circle = r * r * PI;
		System.out.println("반지름이 "+r+"인 원의 넓이 : "+circle);
		
		final double APARTMENTSIZE = 0.3025;
		int m = 62;
		System.out.println(m+"제곱미터는 "+(m*APARTMENTSIZE)+"평이다.");
		
		double scoreAvg = 70.34;
		System.out.println("총 점수의 평균은 "+scoreAvg+"점이다.");
		
		double lifeExpectancy = 80.90;
		System.out.println("기대수명은 전체"+lifeExpectancy+"살까지이다.");
		
		double birthBady = 0.837;
		System.out.println("합계 출산율은 "+birthBady);
		
		double aiAccuracy = 98.12344532;
		System.out.println("AI의 성능 정확도는 "+aiAccuracy+"로 나온다.");
		
		double itemPercentage = 0.00000001;
		System.out.println("아이템이 나올 확률은 "+itemPercentage+"로 조정되었습니다.");
		
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
		
		char minus = '-';
		System.out.println("점수를 90점인 경우 "+score+minus+"로 점수가 변경됩니다.");
		
		char backSpace = '\b';
		System.out.println("backspace 결과 보기"+backSpace);
		
		char newLine = '\n';
		System.out.println("new line을 " + newLine +"실행한 결과이다.");
		
		char carriageReturn = '\r';
		System.out.println(carriageReturn+": carriage return 실행결과");
		
		char tab = '\t';
		System.out.println(tab + "tab을 실행한 결과이다.");
		
		char regionCodeBluray = 'A';
		System.out.println("한국의 블루레이 지역코드는 "+regionCodeBluray+"이다.");
		
		char charUpper = 'd';
		System.out.println("charUpper에 입력된 수는 "+Character.toUpperCase(charUpper)+"처럼 대문자로 변경된다.");
		
		char charLower = 'c';
		System.out.println("charLower에 입력된 수는 "+Character.toLowerCase(charLower)+"처럼 소문자로 변경된다.");
		
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
		System.out.println("구글 주소  : "+google);
		
		
	}
}
