import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;
        int cnt1 = 0, cnt2 = 0;
        int elem1 = -1, elem2 = -1;

        for (int num : nums) {

            if (num == elem1) {
                cnt1++;
            } else if (num == elem2) {
                cnt2++;
            } else if (cnt1 == 0) {
                elem1 = num;
                cnt1++;
            } else if (cnt2 == 0) {
                elem2 = num;
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;
        for (int num : nums) {
            if (num == elem1)
                cnt1++;
            else if (num == elem2)
                cnt2++;
        }

        List<Integer> res = new ArrayList<>();

        if (cnt1 > n / 3)
            res.add(elem1);
        if (cnt2 > n / 3)
            res.add(elem2);

        return res;
    }
}