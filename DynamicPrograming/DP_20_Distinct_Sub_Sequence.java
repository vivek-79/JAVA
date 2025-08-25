public int numDistinct(String str, String sub) {
        
        int n1 = str.length();
        int n2 = sub.length();

        int [][] dp = new int [n1+1][n2+1];

        //If n2==0 it means all char matched so return 1;
        for(int i=0;i<=n1;i++) dp[i][0] = 1;

        //If n1==0 it means some char in sub is remaining to match so return 0;
        for(int j=1;j<=n2;j++) dp[0][j] =0;

        for(int i=1;i<=n1;i++){

            for(int j=1;j<=n2;j++){

                if(str.charAt(i-1) == sub.charAt(j-1)){

                    //As it has two case - 1: we will consider that char so i and j both decrese
                    // or will search another matching char leaving this so i will decrease and not j
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }
                else{

                    //If not match str range will decrease
                    dp[i][j] = dp[i-1][j];
                }
            }
        };


        return dp[n1][n2];
    }