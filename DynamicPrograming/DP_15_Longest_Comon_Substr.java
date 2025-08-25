public class DP_15_Longest_Comon_Substr {
    class Solution {

        private int solve(int indx1, int indx2, String t1, String t2, int[][] dp) {

            if (indx1 < 0 || indx2 < 0) {
                return 0;
            }
            // Memoization
            if (dp[indx1][indx2] != -1)
                return dp[indx1][indx2];

            // Match
            if (t1.charAt(indx1) == t2.charAt(indx2)) {
                return dp[indx1][indx2] = 1 + solve(indx1 - 1, indx2 - 1, t1, t2, dp);
            }

            // Not Match
            return dp[indx1][indx2] = Math.max(solve(indx1 - 1, indx2, t1, t2, dp),
                    solve(indx1, indx2 - 1, t1, t2, dp));
        }

        public int longestCommonSubsequence(String text1, String text2) {

            int len1 = text1.length();
            int len2 = text2.length();

            int[][] dp = new int[len1][len2];

            for (int i = 0; i < len1; i++) {
                Arrays.fill(dp[i], -1);
            }

            return solve(len1 - 1, len2 - 1, text1, text2, dp);
        }
    }
}
