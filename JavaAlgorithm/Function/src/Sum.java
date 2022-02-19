// 15596 정수 N개의 합

class Sum {   // BOJ 제출 시 Test
    long sum(int[] a){
        long sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }    
}
