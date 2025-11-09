package B_Array;

import java.io.PrintWriter;
import java.util.Scanner;

public class Second_largestElem {
    

    public static void solve( Scanner sc , PrintWriter pw ){

        int [] arr = new int[sc.nextInt()];

        for( int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int res = getSolution(arr);
        pw.println(res);
    }

    static int getSolution ( int [] nums){

        int maxi = Integer.MIN_VALUE;
        int secMaxi = maxi;

        if( nums.length <2) return -1;

        for( int num:nums){

            if( num > maxi){
                secMaxi = maxi;
                maxi = num;
            }
            else if( num < maxi && num > secMaxi){
                secMaxi = num;
            }
        }

        return secMaxi;
    }
}
