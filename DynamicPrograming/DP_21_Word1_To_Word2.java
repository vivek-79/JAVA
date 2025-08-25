public class DP_21_Word1_To_Word2 {
    private int solve(int n, int m, String s1, String s2, int[][] dp) {

        // Base Case
        if (n == 0)
            return m;
        if (m == 0)
            return n;

        // Memoize
        if (dp[n][m] != -1)
            return dp[n][m];
        if (s1.charAt(n - 1) == s2.charAt(m - 1))
            return dp[n][m] = solve(n - 1, m - 1, s1, s2, dp);

        return dp[n][m] = 1 + Math.min(solve(n, m - 1, s1, s2, dp),
                Math.min(solve(n - 1, m, s1, s2, dp), solve(n - 1, m - 1, s1, s2, dp)));

    }

    public int minDistance(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        int[][] dp = new int[n + 1][m + 1];

        // Memoization
        // for(int i=0;i<=n;i++){
        // Arrays.fill(dp[i],-1);
        // }

        for (int i = 0; i <= n; i++)
            dp[i][0] = i;
        for (int j = 0; j <= m; j++)
            dp[0][j] = j;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (word1.charAt(i - 1) == word2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];

                else
                    dp[i][j] = 1 + Math.min(dp[i][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j - 1]));
            }
        }
        return dp[n][m];
    }
}
