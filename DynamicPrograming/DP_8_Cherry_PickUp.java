package DynamicPrograming;

import java.util.Arrays;

public class DP_8_Cherry_PickUp {
    private int solveMemo( int[][] grid,int dp[][][], int rows,int cols ,int i, int c1 , int c2 ){

        // Out of Bond case
        if((c1 <0 || c1>cols) || (c2 <0 || c2>cols)){
            return Integer.MIN_VALUE;
        };

        // Base Case
        if( i == rows){

            if(c1 == c2) return grid[i][c1];
            else return grid[i][c1] + grid[i][c2];
        };

        // Memoization
        if(dp[i][c1][c2] != -1) return dp[i][c1][c2];

        int maxi = 0;
        for( int del1=-1;del1<=1;del1++){

            for( int del2= -1;del2<=1;del2++){

                int next = solveMemo(grid,dp, rows, cols, i + 1, c1 + del1, c2 + del2);
                int curr = (c1 == c2) ? grid[i][c1] : grid[i][c1] + grid[i][c2];
                maxi = Math.max(maxi, curr + next);
            };
        };
        return dp[i][c1][c2] = maxi;
    };

    public int cherryPickup(int[][] grid) {
        

        int rows = grid.length - 1;
        int cols = grid[0].length - 1;

        int dp[][][] = new int [rows+1][cols+1][cols+1];

        for(int i=0;i<=rows;i++){

            for(int j=0;j<=cols;j++){
                
                Arrays.fill(dp[i][j],-1);
            }
        }

        return solveMemo(grid,dp,rows,cols,0,0,cols);
    }
}
