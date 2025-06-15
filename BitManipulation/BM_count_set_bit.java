package BitManipulation;

public class BM_count_set_bit {
    
    public static void main(String[] args) {
        
        int n = 10;
        int cnt =0; 
        while ( n !=0){

            n = n &(n-1);
            cnt ++;
        }

        System.out.println(cnt);
    }
}
