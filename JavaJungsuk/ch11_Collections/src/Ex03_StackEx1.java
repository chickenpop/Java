import java.util.Stack;

public class Ex03_StackEx1 {
    
    public static Stack<String> back = new Stack<String>();
    public static Stack<String> forward = new Stack<String>();
    public static void main(String[] args) {
        
        // 11-9
        // 웹브라우저 뒤로, 앞으로 기능 구현하기

        // 브라우저 입력, 브라우저 이동
        goURL("1.네이트");
        goURL("2.야후");
        goURL("3.네이버");
        goURL("4.다음");

        printStatus();

        // 뒤로 2번 이동
        goBack();
        goBack();
        printStatus();

        // 앞으로 1번 이동
        goForward();
        printStatus();

        // 새로운 브라우저 이동
        goURL("codechobo.com");
        printStatus();

    }
    // 현재 위치 print
    public static void printStatus(){
        System.out.println("back:"+back);
        System.out.println("forward:"+forward);
        System.out.println("현재 화면은\'"+back.peek()+"\'입니다.");
        System.out.println();
    }

    // url 넣기, back 스택에 쌓이고 forward는 초기화됨
    public static void goURL(String url){
        back.push(url);
        if(!forward.empty()){
            forward.clear();
        }
    }
    // back에 forward.pop()넣기
    public static void goForward(){
        if(!forward.empty()){ // forward가 존재하면 실행
            back.push(forward.pop());
        }
    }

    // forward에 back.pop()넣기
    public static void goBack(){
        if(!back.empty()){ // forward가 존재하면 실행
            forward.push(back.pop());
        }
    }

}
