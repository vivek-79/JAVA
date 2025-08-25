public class DP_10_Partition_Two_Equal {
    private boolean solve(int indx, int sum, int arr[], Boolean dp[][]) {

        if (sum == 0)
            return true;

        if (indx == 0) {
            return arr[indx] == sum;
        }
        ;

        if (dp[sum][indx] != null)
            return dp[sum][indx];

        boolean notTake = solve(indx - 1, sum, arr, dp);
        boolean take = false;

        if (sum >= arr[indx]) {
            take = solve(indx - 1, sum - arr[indx], arr, dp);
        }
        ;

        return dp[sum][indx] = notTake || take;
    };

    public boolean canPartition(int[] nums) {

        // Calc sum

        int n = nums.length;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        ;

        if (sum % 2 != 0)
            return false;

        Boolean dp[][] = new Boolean[sum / 2 + 1][n];

        return solve(n - 1, sum / 2, nums, dp);
    }
}
