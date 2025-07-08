package DynamicPrograming;

import java.util.Arrays;

public class DP_3_Max_Non_Adj_Sum {
    class Solution {

        private int solve(int[] nums, int[] dp, int indx) {

            if (indx == 0)
                return nums[0];
            if (indx < 1)
                return 0;

            if (dp[indx] != -1)
                return dp[indx];

            int pick = nums[indx] + solve(nums, dp, indx - 2);
            int notPick = 0 + solve(nums, dp, indx - 1);

            return dp[indx] = Math.max(pick, notPick);
        };

        public int rob(int[] nums) {

            int n = nums.length;
            int[] dp = new int[n + 1];
            Arrays.fill(dp, -1);
            return solve(nums, dp, n - 1);
        }
    }
}
