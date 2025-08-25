import java.util.Arrays;

public class DP_11_Subsets_With_Sum_K {
    private int solve(int indx, int[]nums,int target,int [][] dp){
        
        if(indx == 0){
            
            // If 0-th elem is 0 then we can either choose it or not so return 2;
            if (target == 0 && nums[0] == 0) return 2;
            if (target == 0 || target == nums[0]) return 1;
            return 0;
        };
        
        if(dp[indx][target] != -1) return dp[indx][target];
        
        int notPick = solve(indx-1,nums,target,dp);
        
        int pick =0;
        if(nums[indx] <= target){
            pick = solve(indx -1 , nums, target-nums[indx],dp);
        };
        
        return dp[indx][target] = pick+notPick;
    };
    
    public int perfectSum(int[] nums, int target) {
        
        int n =nums.length-1;
        
        int [][] dp = new int [n+1][target+1];
        
        // Filling dp with -1;
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        };
        
        return solve(n,nums,target,dp);
    }
}
