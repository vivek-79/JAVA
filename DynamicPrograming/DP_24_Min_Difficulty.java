import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class DP_24_Min_Difficulty {


    private static int solveMinDifficulty( int [] nums, int len,int indx,int day, int[][] dp){

        // Base Case
        if(day ==1){

            int maxi = Integer.MIN_VALUE;
            for( int i=indx;i<len;i++){
                maxi = Math.max(maxi,nums[i]);
            }

            return maxi;
        }

        if(dp[indx][day] != -1) return dp[indx][day];


        int maxD = Integer.MIN_VALUE;
        int finalRes = Integer.MAX_VALUE;

        for( int i=indx;i<=len-day;i++){


            maxD = Math.max(nums[i], maxD);
            int res = maxD + solveMinDifficulty(nums, len, i+1, day-1,dp);
            finalRes = Math.min(finalRes,res);
        }

        return dp[indx][day] = finalRes;
    }
    public static void main(String[] args) {
        

        try (
            Scanner sc = new Scanner(new File("input.txt"));
            PrintWriter pw = new PrintWriter("output.txt")
        ) {


            int T = sc.nextInt();

            for( int t=0;t<T;t++){

                int N = sc.nextInt();
                int Day = sc.nextInt();
                int job[] = new int[N];

                for(int i=0;i<N;i++ ){
                    
                    job[i] = sc.nextInt() ;   
                
                }
                // impossible
                if (Day > N) {
                    pw.println(-1);
                    continue;
                }

                int [][] dp = new int [N+1][Day+1];

                for( int i=0;i<=N;i++){
                    Arrays.fill(dp[i],-1);
                }

                int res = solveMinDifficulty(job,N,0,Day,dp);
                pw.println(res);
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
