package DynamicPrograming;

import java.util.Arrays;

public class DP_7_Falling_Path_Min {
     // memoizaion - Giving TLE
    private int solveMemo(int[][] matrix, int dp[][], int n, int i, int j) {

        // Base case: last row
        if (i == n - 1) return matrix[i][j];

        // Memoization
        if (dp[i][j] != -1) return dp[i][j];

        // Normal recursion
        int btm = solveMemo(matrix, dp, n, i + 1, j);
        int btmLeft =(j - 1 >= 0) ? solveMemo(matrix, dp, n, i + 1, j - 1) : Integer.MAX_VALUE;
        int btmRight = ( j+ 1 <n ) ? solveMemo(matrix, dp, n, i + 1, j + 1) : Integer.MAX_VALUE;

        return dp[i][j] = matrix[i][j] + Math.min(btm, Math.min(btmLeft, btmRight));
    };

    //Tabulation
    private int solveTab(int[][] matrix, int dp[][], int n){
        
        // Setting first row as base case
        for(int j=0;j<n;j++){
            dp[0][j] = matrix[0][j];
        }

        //Exploring all paths
        for(int i =1;i<n;i++){

            for(int j=0;j<n;j++){

                int btm = dp[i-1][j];
                int btmLeft =(j - 1 >= 0) ? dp[i-1][j-1] : Integer.MAX_VALUE;
                int btmRight = ( j+ 1 <n ) ? dp[i-1][j+1] : Integer.MAX_VALUE;
                dp[i][j] = matrix[i][j] + Math.min(btm, Math.min(btmLeft, btmRight));
            };
        };

        int ans = Integer.MAX_VALUE;

        // Getting Max Value
        for(int j=0;j<n;j++){
            ans = Math.min(dp[n-1][j],ans);
        };

        return ans;
    };

    public int minFallingPathSum(int[][] matrix) {

        int n = matrix.length;
        int dp[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        };

        int minPath = Integer.MAX_VALUE;

        // Memoization
        // for( int i=0;i<n;i++){

        //     minPath =Math.min(minPath,solveMemo(matrix, dp, n, i));
        // }

        minPath = solveTab(matrix,dp,n);
        return minPath;
    }
}
