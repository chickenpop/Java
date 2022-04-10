import java.util.ArrayList;

public class Ex01_ArrayListEx2 {
    
    public static void main(String[] args) {
        
        final int LIMIT = 10;
        String src = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*";
        int length = src.length();

        ArrayList<String> list = new ArrayList<String>(length/LIMIT + 10);

        for(int i=0; i<length; i+=LIMIT){
            if(i+LIMIT < length)
                list.add(src.substring(i, i+LIMIT));
            else    
                list.add(src.substring(i));
        }

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }


    }

}
