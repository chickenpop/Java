public class Ex05_ReferenceReturnEx {
    public static void main(String[] args) {
        // 6-14
        // 객체 d.x = 10
        Data d = new Data();
        d.x = 10;

        // copy() 메소드로 d의 저장된 값을 복사해 Data로 저장 및 반환
        // 객체의 주소를 반환 받음
        Data d2 = copy(d); // Data d2 = 반환된 주소값;
        System.out.printf("d.x = %d\n", d.x);
        System.out.printf("d2.x = %d\n", d2.x);
    }
    static Data copy(Data d){
        Data tmp = new Data();
        tmp.x = d.x;
        return tmp;
    }
}

class Data {
    int x;
}
