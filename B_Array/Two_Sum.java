package B_Array;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Two_Sum {
    

    public static void solve( Scanner sc, PrintWriter pw ){


        int [] arr = new int [sc.nextInt()];
        int k= sc.nextInt();

        for( int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        String res = getSolution(arr,k);
        pw.println(res);
    }

    static String getSolution(int [] arr, int k){

        int res =0;

        Map<Integer,Integer> mpp = new HashMap<>();

        int start =0;
        int end = arr.length;

        while( start<end){

            int num = arr[start];
            int req = num -k;

            if( mpp.containsKey(req)){
                return "YES";
            }

            mpp.put(num, start);
        }
        return "NO";
    }
}
