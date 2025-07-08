package DynamicPrograming;

public class DP_4_Possible_Paths {
    // Memoization
    private int solve(int m, int n, int dp[][]) {

        if (m == 0 && n == 0) {
            return 1;
        }
        if (m < 0 || n < 0)
            return 0;

        if (dp[m][n] != -1)
            return dp[m][n];

        int top = solve(m - 1, n, dp);
        int left = solve(m, n - 1, dp);

        return dp[m][n] = top + left;
    };

    // Tabulation

    private int solve2(int m, int n, int dp[][]) {

        dp[0][0] = 1;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0)
                    continue;

                int right = j > 0 ? dp[i][j - 1] : 0;
                int bottom = i > 0 ? dp[i - 1][j] : 0;

                dp[i][j] = right + bottom;
            }
        }
        ;

        return dp[m - 1][n - 1];
    };

    public int uniquePaths(int m, int n) {

        int dp[][] = new int[m][n];
        return solve2(m, n, dp);

    }
}
