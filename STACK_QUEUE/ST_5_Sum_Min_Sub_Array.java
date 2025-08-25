import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

class Solution {

    static final int MOD = 1000_000_007;

    // finding prev smaller or  equal so that no conflict pair like [1,1] it will get wrong value if simply next smaller
    private List<Integer> findPrevSmallerEqualElem(int[] nums, int n) {

        Stack<Integer> st = new Stack<>();
        List<Integer> res = new ArrayList<>();

        int low = 0;
        while (low < n) {

            while (!st.isEmpty() && nums[st.peek()] > nums[low]) {
                st.pop();
            }
            ;

            if (st.isEmpty()) {

                res.add(-1);
            } else {
                res.add(st.peek());
            }

            // Adding to stack
            st.push(low);
            low++;
        }

        return res;
    }

    // next smaller
    private List<Integer> findNextSmallerElem(int[] nums, int n) {

        Stack<Integer> st = new Stack<>();
        List<Integer> res = new ArrayList<>();

        int high = n - 1;
        while (high >= 0) {

            while (!st.isEmpty() && nums[st.peek()] >= nums[high]) {
                st.pop();
            }
            ;

            if (st.isEmpty()) {

                res.add(n);
            } else {
                res.add(st.peek());
            }

            // Adding to stack
            st.push(high);
            high--;
        }

        Collections.reverse(res);
        return res;
    }

    public int sumSubarrayMins(int[] arr) {

        int n = arr.length;
        List<Integer> psee = findPrevSmallerEqualElem(arr, n);
        List<Integer> nse = findNextSmallerElem(arr, n);

        int total = 0;

        // total subarray will be i-indexOfPrev* indexNext-i 
        // total contribution = subarray * num;
        for (int i = 0; i < n; i++) {

            int nextSmaller = nse.get(i) - i;
            int prevSmaller = i - psee.get(i);

            long contrib = ((long) arr[i] * nextSmaller % MOD * prevSmaller % MOD) % MOD;
            total = (int) ((total + contrib) % MOD);
        }

        return total;
    }
}