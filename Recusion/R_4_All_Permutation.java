package Recusion;

import java.util.ArrayList;
import java.util.List;

public class R_4_All_Permutation {
    private static void swap(int []arr,int indx, int i){

        int t = arr[i];
        arr[i] = arr[indx];
        arr[indx] = t;
    };

    private static void solution(List<List<Integer>> ans, List<Integer> ds, int[] arr,int len,int indx){

        if(indx == len){
            ans.add(new ArrayList<>(ds));
        };

        for(int i=indx;i<len;i++){

            swap(arr,indx,i);
            ds.add(arr[indx]);
            solution(ans, ds, arr, len, indx+1);
            ds.remove(ds.size()-1);
            swap(arr, indx, i);
        }
    };
    public static void main(String[] args) {
        
        int [] arr = {1,2,3};
        int len = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        solution(ans,ds,arr,len,0);

        System.out.println(ans);
    }
}
