package BitManipulation;

public class BM_6_remove_last_setBit {
    
    public static void main(String[] args) {
        
        int n = 10;

        // n = 10 = 1010
        // if we take n-1 i.e 9 => 1001 means this converts last set bit 0 and rem all on right 1;
        // so if we and n and n-1 then it will remove last set bit

        int res = n & (n-1);
        System.out.println(res);

        // similarly to check a num is power of 2
        // if it gives 0 means there is only one 1 in bits so its power of 2 otherwise not
    }
}
