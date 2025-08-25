public class DP_19_Longst_comn_Super_Seqnce {
    public String shortestCommonSupersequence(String str1, String str2) {

        int n1 = str1.length();
        int n2 = str2.length();

        int[][] dp = new int[n1 + 1][n2 + 1];

        for (int i = 0; i <= n1; i++)
            dp[i][0] = 0;
        for (int j = 0; j <= n2; j++)
            dp[0][j] = 0;

        for (int i = 1; i <= n1; i++) {

            for (int j = 1; j <= n2; j++) {

                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {

                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        ;

        // Making the SCS
        StringBuffer sb = new StringBuffer();

        while (n1 > 0 && n2 > 0) {

            if (str1.charAt(n1 - 1) == str2.charAt(n2 - 1)) {
                sb.append(str1.charAt(n1 - 1));
                n1--;
                n2--;
            } else if (dp[n1 - 1][n2] >= dp[n1][n2 - 1]) {
                sb.append(str1.charAt(n1 - 1));
                n1--;
            } else {
                sb.append(str2.charAt(n2 - 1));
                n2--;
            }
        }
        ;

        while (n1 > 0) {
            sb.append(str1.charAt(n1 - 1));
            n1--;
        }
        ;
        while (n2 > 0) {
            sb.append(str2.charAt(n2 - 1));
            n2--;
        }
        ;

        return sb.reverse().toString();
    }
}
