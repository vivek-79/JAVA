public class DP_16_Longst_Cmn_Print {
    private static void solve(String text1, String text2, int len1, int len2, int[][] dp) {

        for (int i = 0; i <= len1; i++)
            dp[i][0] = 0;
        for (int j = 0; j <= len2; j++)
            dp[0][j] = 0;

        for (int i = 1; i <= len1; i++) {

            for (int j = 1; j <= len2; j++) {

                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {

                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        ;
    };

    public static String findLCS(int n, int m, String s1, String s2) {

        int[][] dp = new int[n + 1][m + 1];

        solve(s1, s2, n, m, dp);

        StringBuffer sb = new StringBuffer();

        while (n > 0 && m > 0) {

            if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
                sb.append(s1.charAt(n - 1));
                m--;
                n--;
            } else if (dp[n - 1][m] >= dp[n][m - 1]) {
                n--;
            } else {

                m--;
            }
        }
        ;

        return sb.reverse().toString();
    }
}
