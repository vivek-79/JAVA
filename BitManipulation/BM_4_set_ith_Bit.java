package BitManipulation;

public class BM_4_set_ith_Bit {
    
    public static void main(String[] args) {
        
        int n = 13;
        int i = 1;

        int res = (1 << i) | n;
        System.out.println(res);
    }
}
