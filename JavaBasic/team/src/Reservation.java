import java.util.Calendar;
import java.util.Scanner;


public class Reservation {
	
	private String[] hosptialData;
	private String hosptialDoctorName;
	
	public Reservation(String[] hosptialData,String hosptiaDoctorlName) {
		this.hosptialData = hosptialData;
		this.hosptialDoctorName = hosptiaDoctorlName;
	}

	// 달력 출력 > 날짜 선택 > 시간 선택 > 요청서 작성 > 완료
	public void reservationHosptial() {

		System.out.println("=====================================");
		System.out.println("\t예약페이지");
		System.out.println("=====================================");
		
		for(String s : hosptialData) {
			System.out.println(s);
		}
		System.out.println(hosptialDoctorName);
			    
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DATE);
		c.set(year, month, day);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.printf("오늘 날짜는 %tF %s요일입니다.\n", c, getDAYOFWEEK(dayOfWeek));
		printCalendar(year, month+1);

		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			Calendar date = Calendar.getInstance();
			System.out.print("진료 날짜:(평일 날짜만 입력해주세요)");
			String 진료날짜 = scan.nextLine();
			date.set(year, month, Integer.parseInt(진료날짜));
			int temp = date.get(Calendar.DAY_OF_WEEK);
			if(temp > 1 && temp < 7 && Integer.parseInt(진료날짜) > day) {
				flag = false;
				day = Integer.parseInt(진료날짜);
				c.set(year, month, day);
				dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
			} else {
				System.out.println("=====================================");
				System.out.println("잘못된 입력입니다.");
				System.out.println("주말과 당일예약, 이전날짜은 예약이 불가능합니다.");
				System.out.println("=====================================");
			}
		}
		
		System.out.println("=====================================");
		System.out.println("\t진료예약 가능시간 ");
		System.out.println("=====================================");
		System.out.printf("예약날짜:%tF %s요일\n", c, getDAYOFWEEK(dayOfWeek));
		printTimeList(c);
		scan.close();

	}

	private void printTimeList(Calendar c) {
		// hosptialData
		//202,김진의원,9:00~18:00,9:00~18:00,미운영,62661,신경과
		Scanner in = new Scanner(System.in);
		String fristHour = hosptialData[2].split(":")[0];
		String lastHour = hosptialData[2].split("~")[1];
		lastHour = lastHour.split(":")[0];
		int breakHour = 13;

		System.out.println("=====================================");
		for(int i=Integer.parseInt(fristHour); i<Integer.parseInt(lastHour); i++) {
			if(i == breakHour) {
				continue;
			}
			System.out.printf("%d:00\n", i);
		}
		System.out.println("=====================================");
		System.out.println("희망하는 예약시간을 입력해주세요(예시 : 10)");
		System.out.print("시간 선택: ");
		boolean flag = true;
		while(flag) {			
			int 진료시간 = in.nextInt();
			
			if(진료시간 >= Integer.parseInt(fristHour) && 진료시간 != breakHour && 진료시간 <= Integer.parseInt(lastHour)) {
				System.out.printf("%s님 %tF %s에 %s:00시에 진료예약이 완료되었습니다.\n", "환자이름", c, hosptialData[1], 진료시간);
				String time = 진료시간 + ":00";
				System.out.printf("%s %tF %s %s %s", "환자이름", c, hosptialData[1], time, hosptialDoctorName);
				System.out.println(hosptialData[1]);
				flag = false;
				
			} else {
				System.out.println("잘못된 시간을 입력하셨습니다. 다시 입력해주세요");
			}
		}
		in.close();
		
	}

	private String getDAYOFWEEK(int dayofweek) {
	
		if(dayofweek == 1) return "일";
		else if(dayofweek == 2) return "월";
		else if(dayofweek == 3) return "화";
		else if(dayofweek == 4) return "수";
		else if(dayofweek == 5) return "목";
		else if(dayofweek == 6) return "금";
		else return "토";
	}	
	
	private void printCalendar(int year, int month) {
      
		int lastDay = getLastDay(year, month);
		int dayOfWeek = getWeek(year, month);
		
		System.out.println("======================================================="); // 55
		System.out.printf("\t\t       %d년 %d월\n", year, month);
		System.out.println("=======================================================");
		System.out.println("[일]\t[월]\t[화]\t[수]\t[목]\t[금]\t[토]\t");
		
		for(int i=1; i<=dayOfWeek; i++) {
			System.out.print("\t");
		}

		for(int i=1; i<=lastDay; i++) {
			System.out.printf("%3d\t", i);
			if(i % 7 == 7-dayOfWeek) { 
				System.out.println();
			}
		}

	}

	
	public static int getLastDay(int year, int month) {
		
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				return 31;
			case 4: case 6: case 9: case 11:
				return 30;
			case 2:
				return isLeafYear(year) == true ? 29 : 28;
			
		}
		return 0;
	}
	
	public static boolean isLeafYear(int year) {
		
		return (year%4==0 && year%100!=0) || year%400==0 ? true : false;
		
	}
	
	public static int getWeek(int year, int month){
		
		int total = 0;
		int date = 1;
		
		for(int i=1; i<year; i++) {
			if(isLeafYear(i)) {
				total += 366;
			} else {
				total += 365;
			}
		}
		
		for(int i=1; i<month; i++) {
			total += getLastDay(year, i);
		}
		total += date;
		
		return total % 7;
	}
	
}