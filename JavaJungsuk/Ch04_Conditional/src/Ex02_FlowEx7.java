import java.util.Scanner;

public class Ex02_FlowEx7 {
    
    public static void main(String[] args) {
        
        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요>");

        Scanner in = new Scanner(System.in);
        int user = in.nextInt();
        int com = (int)(Math.random()*3)+1;

        System.out.printf("당신은 %d입니다.\n", user);
        System.out.printf("컴은 %d입니다.\n", com);

        // switch문 특징 break문을 만나지 않으면 다음 case문도 실행됨
        switch(user-com){
            case 2: case -1: // 보-가위, 바위-보, 가위-바위
                System.out.println("당신이 졌습니다.");
                break;
            case 1: case -2: // 보-바위, 바위-가위, 가위-보
                System.out.println("당신이 이겼습니다.");
                break;
            case 0:          // 같은 모양
                System.out.println("비겼습니다."); // 마지막 문장에는 break를 사용할 필요가 없음
        }
        in.close();

    }

}
