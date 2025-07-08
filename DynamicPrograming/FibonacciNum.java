
package DynamicPrograming;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciNum {

    private static int solve(int n,int[]dp){

        if(n <=1) return n;

        if(dp[n] != -1) return dp[n];
        return dp[n] = solve(n-1,dp) + solve(n-2,dp);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int [] dp = new int[n+1];
        Arrays.fill(dp, -1);

        //Memoization
        //int ans = solve(n,dp);

        //Tabulation

        int prev = 1, prev2 =0;
        
        for(int i=2;i<=n;i++){

            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }

        // Prev is ans as curr will go to n+1 after loop so prev =n;
        System.out.println(prev);
    }
}