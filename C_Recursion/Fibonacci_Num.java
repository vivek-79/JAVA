package C_Recursion;

import java.io.PrintWriter;
import java.util.Scanner;

public class Fibonacci_Num {
    
    public static void solve(Scanner sc,PrintWriter pw){


        int n = sc.nextInt();

        int res = getSolution(n);

        pw.println(res);
    }


    static int getSolution( int n){

        if( n <2 ){
            return n;
        }

        return getSolution(n-1) + getSolution(n-2);
    }
}
