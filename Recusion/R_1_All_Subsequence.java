package Recusion;

import java.util.*;

public class R_1_All_Subsequence {

    private static void getAllSubSequence(List<Integer> lst, int [] arr,int i,int n){


        // base case
        if(i==n){
            System.out.println(lst);
            return;
        };

        // take
        lst.add(arr[i]);
        getAllSubSequence(lst, arr, i+1, n);
        lst.remove(lst.size()-1);

        //not take
        getAllSubSequence(lst, arr, i+1, n);
    }
    
    public static void main(String[] args) {
        
        int [] arr = {3,1,2};

        int n = arr.length;
        List<Integer> lst = new ArrayList<>();

        getAllSubSequence(lst,arr,0,n);
    }
}
