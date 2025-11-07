package B_Array;

import java.io.PrintWriter;
import java.util.Scanner;

public class B_1_Largest_Elem {
    
    public static void solve(Scanner sc , PrintWriter pw){

        int[] arr = new int[sc.nextInt()];

        for( int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int res = findLargest(arr);
        pw.println(res);
    }

    static int  findLargest( int [] arr){

        int maxi =Integer.MIN_VALUE;

        for( int i=0;i<arr.length;i++){
            maxi = Math.max(maxi, arr[i]);
        }

        return maxi;
    }
}
