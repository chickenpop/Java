//2884 알람시계

import java.util.Scanner;

public class alarmClock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int clockHour = 0, clockMin = 0;    // 시, 분
        boolean flag = false;               // 시간 -1 해야하는 지 판독용
        //시, 분 입력
        clockHour = in.nextInt();
        clockMin = in.nextInt();

        // 45분 전 알람 만들기
        // 시작 0:0 장정 ~ 23:59까지 표시됨
        if (clockMin >= 45){
            clockMin -= 45;
        } else {
            clockMin = clockMin + 15;
            flag = true;
        }
        if (flag == true){
            clockHour -= 1;
            // 자정인 경우 -1이 되기에 23으로 바꿔줌
            if (clockHour == -1) clockHour = 23; 
        } 
        System.out.println(clockHour+" "+clockMin);
        in.close();    
    }
}
