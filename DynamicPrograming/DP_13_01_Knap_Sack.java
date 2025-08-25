public class DP_13_01_Knap_Sack {
    private static int solve(int indx,int w, int val[], int wt[], int dp[][]){
        
        if(indx == 0){
            
            if(w >= wt[0]) return val[0];
            return 0; 
        }
        
        if(dp[indx][w] != -1) return dp[indx][w];
        
        int notTake = solve(indx-1,w,val,wt,dp);
        
        int take = Integer.MIN_VALUE;
        if(w >= wt[indx]){
            
            take = val[indx] + solve(indx-1,w-wt[indx],val,wt,dp);
        }
        
        return dp[indx][w] = Math.max(take,notTake);
        
    };
    
    static int knapsack(int W, int val[], int wt[]) {
        
        
        int n =val.length-1;
        int [][]dp = new int[n+1][W+1];
        
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        
        return solve(n,W,val,wt,dp);
        
    }
}
