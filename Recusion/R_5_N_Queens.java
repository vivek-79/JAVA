package Recusion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class R_5_N_Queens {
    class Solution {

    private void solve( List<List<String>> ans,int [] leftRow, int [] upperDiagonal,int [] lowerDiagonal, char[][] board, int n,int col){

        if(col ==n){
            List<String> temp = new ArrayList<>();

            for(int i=0;i<n;i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        };

        for(int row =0;row <n;row++){

            if(leftRow[row]==0 && lowerDiagonal[row+col]==0 && upperDiagonal[n-1 + col-row]==0){

                board[row][col] = 'Q';

                //marking
                leftRow[row]=1;
                lowerDiagonal[row+col]=1;
                upperDiagonal[n-1 + col-row]=1;
                solve(ans, leftRow, upperDiagonal, lowerDiagonal,board, n, col + 1);

                board[row][col]='.';

                //unmark
                leftRow[row]=0;
                lowerDiagonal[row+col]=0;
                upperDiagonal[n-1 + col-row]=0;

            }
        }
    } 
    public List<List<String>> solveNQueens(int n) {
        
        List<List<String>> ans = new ArrayList<>();
        char[][] board= new char[n][n];

        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        };

        int [] leftRow = new int[n];
        int [] upperDiagonal = new int[2*n-1];
        int [] lowerDiagonal = new int[2*n-1];
        solve(ans,leftRow,upperDiagonal,lowerDiagonal,board,n,0);

        return ans;
    }
}
}
