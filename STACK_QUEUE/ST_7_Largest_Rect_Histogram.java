import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int low = 0;
        int maxi = -1;

        while (low < n) {

            if (st.isEmpty() || heights[low] >= heights[st.peek()]) {

                st.push(low);
                low++;
            } else {

                // we assume nse as current low  and pse to the top of stack or -1
                // As we stored stack in increasing order

                int indx = st.pop();
                int nse = low;
                int pse = st.isEmpty() ? -1 : st.peek();
                maxi = Math.max(maxi, heights[indx] * (nse - pse - 1));
            }
        }

        // Elements which dont have a next greater elem will left out  in stack so this claculation
        while (!st.isEmpty()) {

            int indx = st.pop();
            int nse = n;
            int pse = st.isEmpty() ? -1 : st.peek();
            maxi = Math.max(maxi, heights[indx] * (nse - pse - 1));
        }
        return maxi;
    }
}