package DynamicPrograming;

import java.util.Arrays;

public class DP_2_Frog_Jump_1 {

    // Memoizaion
    private static int solve1(int n, int [] heights, int []dp){

        if(n==0) return 0;

        if(dp[n] != -1) return dp[n];

        int left = solve1(n-1,heights,dp) + Math.abs(heights[n]- heights[n-1]);

        int right =Integer.MAX_VALUE;
        if(n>1) right = solve1(n-2,heights,dp) + Math.abs(heights[n] - heights[n - 2]); 

        return dp[n] = Math.min(left, right);
    }
    
    // TABULATION
    private static int solve2(int n, int [] heights){

        int prev = 0;
        int prev2=0;

        for( int i=1;i<=n;i++){

            int fs = prev + Math.abs(heights[i]-heights[i-1]);

            int ss = Integer.MAX_VALUE;
            if(i>1) ss = prev2 + Math.abs(heights[i]- heights[i-2]);

            int curr = Math.min(fs, ss);
            prev2 = prev;
            prev= curr;
        };

        return prev;
    }
    
    public static void main(String[] args) {
        int arr[] = {30,10,60,10,60,50};

        int len = arr.length;
        int dp[] = new int[len+1];

        Arrays.fill(dp, -1);

        //Memoizaion
        int ans1 = solve1(len-1,arr,dp);

        //TABULATION
        int ans2 = solve2(len-1,arr);

        System.out.println(ans2);
    }
}
