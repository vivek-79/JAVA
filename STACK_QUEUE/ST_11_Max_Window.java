import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        Deque<Integer> dq = new ArrayDeque<>();
        int[] res = new int[n - k + 1];

        for (int i = 0; i < n; i++) {

            // Popping out smaller at front
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            // Popping out out of window size elem
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            dq.offerLast(i);

            if (i >= k - 1) {

                res[i + 1 - k] = nums[dq.peekFirst()];
            }
        }

        return res;
    }
}