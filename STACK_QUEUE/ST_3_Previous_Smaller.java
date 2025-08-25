import java.util.Stack;

class Solution {
    public int[] leftSmaller(int[] arr) {
        // code here
        int n = arr.length;

        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {

            // Pop out untill its smaller
            while (!st.isEmpty() && st.peek() >= arr[i])
                st.pop();

            // Previous smaller
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }

            // Adding current elem
            st.push(arr[i]);
        }

        return res;
    }
}
