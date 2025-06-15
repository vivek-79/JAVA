package BitManipulation;

public class BM_5_Clear_Bit {
    
    public static void main(String[] args) {
        
        int n = 10;
        int i = 3;
        // 1 right shift by 3 = 00100
        // not of that  = 11011
        // now its and with any num will set ith bit 0;      
        int res = ~(1 << i) & n;
        System.out.println(res);
    }
}
