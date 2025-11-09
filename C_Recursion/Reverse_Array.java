package C_Recursion;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Array {
    
    public static void solve( Scanner sc , PrintWriter pw ){

        int [] arr = new int [sc.nextInt()];
        
        for( int i =0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        getSolution(arr,0,arr.length-1);

        pw.println(Arrays.toString(arr));
    }


    static void getSolution ( int []arr , int s, int e){

        if( s>e){
            return;
        }

        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        getSolution(arr, s+1, e-1);
    }
}
