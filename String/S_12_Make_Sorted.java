import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class S_12_Make_Sorted {
    
    private static int solve(char [][] mat, int col, int len){

        for( int i=1;i<len;i++){

            if(mat[i-1][col] > mat[i][col]) return 1;
        }
        return 0;
    }

    private static int solveSorted( char [][] mat, int len){


        int cnt= 0;
        for ( int i=0;i< len;i++){

            cnt += solve(mat,i,len);
        }

        return cnt;
    }

    public static void main(String[] args) {
        

        try (
            Scanner sc = new Scanner(new File("input.txt"));
            PrintWriter pw = new PrintWriter("output.txt")
        ) {


            int T = sc.nextInt();

            for( int t=0;t<T;t++){

                int N = sc.nextInt();
                char mat[][] = new char[N][N];

                for(int i=0;i<N;i++ ){
                    
                    mat[i] = sc.next().toCharArray() ;   
                
                }

                int res = solveSorted(mat,N);
                pw.println(res);
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
