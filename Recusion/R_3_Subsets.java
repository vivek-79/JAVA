package Recusion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class R_3_Subsets {
    private static void solution(int[] nums, List<Integer> ds, List<List<Integer>> ans, int len, int indx) {

        ans.add(new ArrayList(ds));

        for (int i = indx; i < len; i++) {

            if (i > indx && nums[i] == nums[i - 1])
                continue;

            ds.add(nums[i]);
            solution(nums, ds, ans, len, i + 1);
            ds.remove(ds.size() - 1);
        }
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;

        solution(nums,ds,ans,len,0);
       // return ans;
    }
}
