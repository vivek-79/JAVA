package DynamicPrograming;

public class DP_5_Min_Path_Sum{
    // Memoization
    private int solve(int[][] grid, int row, int col, int[][] dp) {

        if (row == 0 && col == 0) {
            return grid[0][0];
        }
        ;

        if (row < 0 || col < 0)
            return Integer.MAX_VALUE;

        if (dp[row][col] != -1)
            return dp[row][col];

        int down = solve(grid, row - 1, col, dp);
        int right = solve(grid, row, col - 1, dp);

        return dp[row][col] = grid[row][col] + Math.min(down, right);
    };

    // Tabulation

    private int solve2(int[][] grid, int row, int col, int[][] dp) {

        dp[0][0] = grid[0][0];

        for (int i = 0; i <= row; i++) {

            for (int j = 0; j <= col; j++) {

                if (i == 0 && j == 0)
                    continue;

                int down = i > 0 ? dp[i - 1][j] : Integer.MAX_VALUE;
                int right = j > 0 ? dp[i][j - 1] : Integer.MAX_VALUE;
                dp[i][j] = grid[i][j] + Math.min(down, right);
            }
        }
        ;

        return dp[row][col];
    };

    public int minPathSum(int[][] grid) {

        int row = grid.length - 1;
        int col = grid[0].length - 1;

        int[][] dp = new int[row + 1][col + 1];

        // for(int i=0;i<=row;i++){
        // Arrays.fill(dp[i],-1);
        // }
        return solve2(grid, row, col, dp);
    }
}
