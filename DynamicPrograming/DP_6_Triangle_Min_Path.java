package DynamicPrograming;

import java.util.Arrays;
import java.util.List;

public class DP_6_Triangle_Min_Path {
    
      //Memoization
    private int solve1(List<List<Integer>> triangle,int dp[][],int n,int i,int j){

        if(i == n-1) return triangle.get(i).get(j);

        if(dp[i][j] != -1) return dp[i][j];

        int d = triangle.get(i).get(j) + solve1(triangle,dp,n,i+1,j);
        int dg = triangle.get(i).get(j) + solve1(triangle,dp,n,i+1,j+1);

        return dp[i][j] = Math.min(d,dg);
    };

    //Tabulation
    private int solve2(List<List<Integer>> triangle,int dp[][],int n){

        dp[0][0] = triangle.get(0).get(0);

        for(int i=1;i<n;i++){

            for(int j=0;j<triangle.get(i).size();j++){

                if(i==0 && j==0) continue;

                int d = j < triangle.get(i-1).size() ? dp[i-1][j] : Integer.MAX_VALUE;
                int dg = j>0 ? dp[i-1][j-1] : Integer.MAX_VALUE;

                dp[i][j] = triangle.get(i).get(j) + Math.min(d,dg);
            }
        };

        // Final answer
        int ans =  Integer.MAX_VALUE;

        for(int j = 0; j < triangle.get(n - 1).size(); j++){

            ans = Math.min(ans,dp[n-1][j]);
        };

        return ans;
    };

    public int minimumTotal(List<List<Integer>> triangle) {
        
        int n = triangle.size();

        int dp[][] = new int[n][n];

        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        };

        //return solve1(triangle,dp,n,0,0);
        return solve2(triangle,dp,n);
    }
}
