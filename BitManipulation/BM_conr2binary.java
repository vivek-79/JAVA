package BitManipulation;
import java.util.Scanner;

public class BM_conr2binary {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        String res = "";
        while( n != 1){

            if( n % 2 ==0) res +="0";
            else res +="1";

            n = n/2;
        }
        res +="1";

        String reversed = new StringBuilder(res).reverse().toString();
        System.out.println(reversed);
    }
}
