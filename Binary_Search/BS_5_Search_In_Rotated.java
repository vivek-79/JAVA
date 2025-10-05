package Binary_Search;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class BS_5_Search_In_Rotated {

    private static int solve (int []num,int high, int k){

        int low =0;

        while(low<=high){

            int mid = (low+high)/2;

            if(num[mid] == k) return mid;

            // left sorted
            else if((num[low] <= num[mid])){

                if( k>=num[low] && k< num[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(k> num[mid] && k<= num[high]){
                    low = mid+1;
                }
                else{
                    high = mid -1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        try (
                Scanner sc = new Scanner(new File("input.txt"));
                PrintWriter pw = new PrintWriter("output.txt")) {

            int T = sc.nextInt();

            for (int t = 0; t < T; t++) {

                int N = sc.nextInt();
                int num[] = new int[N];

                int target = sc.nextInt();

                for (int n = 0; n < N; n++) {
                    num[n] = sc.nextInt();
                }

                // solution

                int res = solve (num,N-1,target);

                pw.println(res);

            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
