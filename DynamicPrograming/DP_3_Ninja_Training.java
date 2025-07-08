package DynamicPrograming;

import java.util.Arrays;

public class DP_3_Ninja_Training {

    private static int solve(int day ,int points[][],int [][] dp,int prevTask){

        if( day == points.length)  return 0;

        //If same day called with same prevTask done
        if(dp[day][prevTask] != -1) return dp[day][prevTask];

        int maxi=0;
        for( int i=0;i<3;i++){

            if(prevTask != i){ 
                int merit = points[day][i] + solve (day+1,points,dp,i);
                maxi = Math.max(merit,maxi);
            };
        };

        //Day called with prevTask done
        return dp[day][prevTask] = maxi;
    };

    private static int solveTabulation(int points[][],int [][] dp,int prevTask){

        //Base Case
        for(int prev=0;prev<4;prev++){

            int maxi =0;
            for(int task=0;task<3;task++){

                if(prev != task){

                    maxi= Math.max(points[0][task],maxi);
                }
            };


            dp[0][prev] = maxi;
        };

        // Looping

        for(int currDay=1;currDay<points.length;currDay++){

            for(int prev=0;prev<4;prev++){

            int maxi =0;
            for(int task=0;task<3;task++){

                if(prev != task){

                    int merit = points[currDay][task] + dp[currDay-1][task];
                    maxi= Math.max(merit,maxi);
                }
            };


            dp[currDay][prev] = maxi;
        };

        }
        return dp[points.length-1][3];

    }
    public static int ninjaTraining(int n, int points[][]) {

        int [][] dp = new int [n][4];
        
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        };

        // Tabulation
        return solveTabulation(points,dp,3);

        // Memoization
        // return solve (0, points,dp,3);
    }
}
