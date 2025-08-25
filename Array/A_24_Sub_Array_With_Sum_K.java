import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> mpp = new HashMap<>();

        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum == k)
                cnt++;

            int rem = sum - k;

            if (mpp.containsKey(rem)) {
                cnt += mpp.get(rem);
            }

            mpp.put(sum, mpp.getOrDefault(sum, 0) + 1);
        }

        return cnt;
    }
}