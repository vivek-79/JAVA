package A_Maths;

// finding the magic number
// for 2nd magic no = 2 in binary i.e 1 0
// now 0 * 5^1 + 1 * 5 ^ 2;

public class M_Q_7 {
    public static void main(String[] args) {
        
        int n= 10;

        int ans =0;
        int base = 5;

        while( n>0){

            int last = n & 1;

            ans += last * base;
            
            base = base*5;
            n = n >> 1;
        }


        System.out.println(ans);
    }
}
