package Binary_Search;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class BS_7_Min_In_Rotated {

    private static int solve(int [] num , int high){

        int low = 0;
        int mini = Integer.MAX_VALUE;

        while(low<= high){

            int mid = (low + high) / 2;


            // Left sorted
            if(num[low]<=num[mid]){
                mini = Math.min(mini, num[low]);
                low = mid+1;
            }
            else{
                mini = Math.min(mini, num[mid]);
                high = mid - 1;
            }
        }
        return  mini;
    }

    public static void main(String[] args) {

        try (
                Scanner sc = new Scanner(new File("input.txt"));
                PrintWriter pw = new PrintWriter("output.txt")) {

            int T = sc.nextInt();

            for (int t = 0; t < T; t++) {

                int N = sc.nextInt();
                int num[] = new int[N];

                for (int n = 0; n < N; n++) {
                    num[n] = sc.nextInt();
                }

                // solution

                int res = solve(num, N - 1);

                pw.println(res);

            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
