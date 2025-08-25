import java.util.Arrays;

public class DP_14_Min_No_Of_Coins {
     final int max = 100000000;
    private int solve(int indx, int amt, int []coins, int [][]dp){

        if(indx ==0){
            if(amt % coins[0] ==0) return amt/coins[0];
            return max;
        }

        if(dp[indx][amt] != -1) return dp[indx][amt];

        int notPick = solve(indx-1,amt,coins,dp);

        int pick = max;
        if(coins[indx] <= amt){
            pick = 1 + solve(indx, amt - coins[indx],coins,dp);
        }

        return dp[indx][amt] = Math.min(pick,notPick);
    };

    public int coinChange(int[] coins, int amount) {
        
        int n = coins.length;

        int [][] dp = new int [n][amount+1];

        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        int ans =solve(n-1,amount,coins,dp);
        return ans == max ? -1 :ans;
    }
}
