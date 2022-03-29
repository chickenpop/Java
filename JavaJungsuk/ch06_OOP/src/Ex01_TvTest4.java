public class Ex01_TvTest4 { 
    public static void main(String[] args) {
        // 6-4
        // 선언한 객체 배열의 각 요소는 초기화해줘야한다

        // 객체 배열만 생성한 상태
        Tv[] tvArr = new Tv[3];

        // 객체 각 요소 초기화
        for(int i=0; i<tvArr.length; i++){
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10;
        }

        // 객체 출력
        for(int i=0; i<tvArr.length; i++){
            System.out.printf("tvArr[%d]의 채널은 %d\n", i, tvArr[i].channel);
        }

    }
}

class Tv {
    int channel;

    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }
}