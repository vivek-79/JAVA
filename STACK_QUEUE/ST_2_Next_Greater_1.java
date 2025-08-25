import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here

        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            // Pop smaller or equal elements
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            // If stack empty → no greater element
            if (st.isEmpty()) {
                res.add(-1);
            } else {
                res.add(st.peek());
            }

            // Push current element
            st.push(arr[i]);
        }

        // Reverse result since we filled from right to left
        Collections.reverse(res);

        return res;
    }
}