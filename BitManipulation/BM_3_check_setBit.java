package BitManipulation;

public class BM_3_check_setBit {
    
    public static void main(String[] args) {
        
        
        int n  = 13;
        int i = 1;
        
        // By Right shift
        int res1 = (n >> i) & 1;
        if(res1 ==1) System.out.println("SetBit");
        else System.out.println("UnsetBit");

        //By Left Shift
        int res2 = (1 << i) & n;
        if (res2 == 0) System.out.println("UnsetBit");
        else System.out.println("SetBit");
    }
}
