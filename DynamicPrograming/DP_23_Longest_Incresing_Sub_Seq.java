import java.util.ArrayList;
import java.util.List;

public class DP_23_Longest_Incresing_Sub_Seq {
    private int solveLis(int indx, int prevIndx, int[] nums, int[][] dp) {

        // Base Case
        if (indx < 0)
            return 0;

        if (dp[indx][prevIndx + 1] != -1)
            return dp[indx][prevIndx + 1];

        if (prevIndx < 0 || nums[indx] < nums[prevIndx]) {
            return dp[indx][prevIndx + 1] = Math.max((1 + solveLis(indx - 1, indx, nums, dp)),
                    solveLis(indx - 1, prevIndx, nums, dp));
        }

        return dp[indx][prevIndx + 1] = solveLis(indx - 1, prevIndx, nums, dp);
    };

    private static int solveLisBinary(int[] nums, int n) {

        List<Integer> temp = new ArrayList<>();

        temp.add(0, nums[0]);
        int len = 1;

        for (int i = 1; i < n; i++) {

            if (temp.get(len - 1) < nums[i]) {
                temp.add(nums[i]);
                len++;
            } else {
                int indx = lowerBound(nums[i], len - 1, temp);
                temp.set(indx, nums[i]);
            }
        }
        ;

        return len;
    }

    // Getting index by lower Bound
    private static int lowerBound(int elem, int high, List<Integer> nums) {

        int low = 0;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (nums.get(mid) < elem) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        ;

        return low;
    }

    public int lengthOfLIS(int[] nums) {

        int n = nums.length;
        if (n == 1)
            return 1;

        // Memoization
        // int prevIndx = -1;
        // int [][] dp = new int [n][n+1];
        // for(int i=0;i<n;i++){
        // Arrays.fill(dp[i],-1);
        // }
        // return solveLis(n-1,prevIndx,nums,dp);

        // Binary Search
        return solveLisBinary(nums, n);
    };
}
