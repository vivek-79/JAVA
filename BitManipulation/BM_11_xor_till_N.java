
package BitManipulation;

public class BM_11_xor_till_N {
    
    private static int func(int n) {
        if (n % 4 == 1)
            return 1;
        else if (n % 4 == 2)
            return n + 1;
        else if (n % 4 == 3)
            return 0;
        else {
            return n;
        }
    }
    public static void main(String[] args) {
        
        int n =4;

        int ans = func(n);

        System.out.println(ans);
    }
}
