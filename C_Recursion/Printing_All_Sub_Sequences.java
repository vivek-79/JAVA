package C_Recursion;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Printing_All_Sub_Sequences {

    public static void solve(Scanner sc, PrintWriter pw) {

        int[] arr = new int[sc.nextInt()];

        List<Integer> lst = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        getSolution(arr, lst, 0,pw);
    }

    static void getSolution( int []arr, List<Integer> res, int curr, PrintWriter pw){

        if( curr == arr.length ){
            pw.println(res);
            return;
        }

        //pick
        res.add(arr[curr]);
        getSolution(arr, res, curr+1, pw);

        //not pick
        res.remove(res.size()-1);
        getSolution(arr, res, curr+1, pw);
    }
}
