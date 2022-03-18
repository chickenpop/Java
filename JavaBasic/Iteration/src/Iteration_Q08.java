public class Iteration_Q08 {

	public static void main(String[] args) {

		// com.test.java.question.iteration > "Q08.java"
		
		// 8번 문제 날짜 구하기
		
		// 서기 1년 1월 1일부터 오늘까지 며칠째인지 합을 구하시오.
		int totalDay = 0;
		int year = 2022;
		int month = 3;
		int day = 16;
		
		totalDay = getYearDay(year);

		for(int i=1; i<month; i++) {
			totalDay += getLastDay(year, i);
		}
		totalDay += day;
		System.out.printf("%d년 %d월 %d일은 %,d일째 되는 날이고 %s요일입니다.\n", year, month, day, totalDay, getDayOfWeek(totalDay));
		
	}

	public static boolean isLeapYear(int year) {
		
		return (year%4==0 && year%100!=0) || year%400==0 ? true : false;
		
	}
	
	public static String getDayOfWeek(int totalDay){
		
		if(totalDay % 7 == 1) {
			return "월";
		} else if(totalDay % 7 == 2) {
			return "화";
		} else if(totalDay % 7 == 3) {
			return "수";
		} else if(totalDay % 7 == 4) {
			return "목";
		} else if(totalDay % 7 == 5) {
			return "금";
		} else if(totalDay % 7 == 6) {
			return "토";
		} else {
			return "일";
		}
	}
	
	public static boolean isLeafYear(int year) {
		
		return (year%4==0 && year%100!=0) || year%400==0 ? true : false;
		
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
	
	public static int getYearDay(int year) {
		int day = 0;
		for(int i=1; i<year ;i++) {
			if(isLeapYear(i)) {
				day += 366;
			} else {
				day += 365;
			}
		}
		return day;
	}

}
