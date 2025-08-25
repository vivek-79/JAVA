package DynamicPrograming;

public class DP_9_Sub_Sequenc_With_Target {
    class Solution {

        private static Boolean solve(int indx, int sum, int arr[], Boolean dp[][]) {

            if (sum == 0)
                return true;

            if (indx == 0) {
                return arr[indx] == sum;
            }
            ;

            if (dp[sum][indx] != null)
                return dp[sum][indx];

            Boolean notTake = solve(indx - 1, sum, arr, dp);
            Boolean take = false;

            if (sum >= arr[indx]) {
                take = solve(indx - 1, sum - arr[indx], arr, dp);
            }
            ;

            return dp[sum][indx] = notTake || take;
        };

        static Boolean isSubsetSum(int arr[], int sum) {
            // code here
            int n = arr.length;
            Boolean dp[][] = new Boolean[sum + 1][n];

            return solve(n - 1, sum, arr, dp);
        }
    }
}
