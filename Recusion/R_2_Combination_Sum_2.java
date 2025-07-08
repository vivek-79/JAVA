package Recusion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class R_2_Combination_Sum_2 {
    class Solution {

    private void solution(List<List<Integer>> ans,List<Integer> ds,int[] arr, int target,int len , int indx){

        if(target == 0){
            ans.add(new ArrayList(ds));
            return;
        };

        for(int i = indx;i<len;i++){

            if(i>indx && arr[i] == arr[i-1]) continue;
            if(arr[i]> target) break;

            ds.add(arr[i]);
            solution(ans,ds,arr,target-arr[i],len,i+1);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        int len = candidates.length;

        Arrays.sort(candidates);
        solution(ans,ds,candidates,target,len,0);

        return ans;
    }
}
}
