import java.util.Stack;

class Solution {

    private int[][] convertToPrefixSum(char[][] mat, int rows, int cols) {

        int[][] res = new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                int digit = mat[i][j] - '0';

                if (i == 0) {
                    res[0][j] = digit;
                } else {

                    res[i][j] = digit == 0 ? 0 : res[i - 1][j] + 1;
                }
            }
        }

        return res;
    }

    private int findMaxArea(int[] nums) {

        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int maxi = 0;
        int low = 0;

        while (low < n) {

            while (!st.isEmpty() && nums[low] < nums[st.peek()]) {

                int indx = st.pop();

                int nse = low;
                int pse = st.isEmpty() ? -1 : st.peek();

                maxi = Math.max(maxi, nums[indx] * (nse - pse - 1));
            }
            st.push(low);
            low++;
        }

        while (!st.isEmpty()) {
            int indx = st.pop();

            int nse = n;
            int pse = st.isEmpty() ? -1 : st.peek();

            maxi = Math.max(maxi, nums[indx] * (nse - pse - 1));
        }

        return maxi;
    }

    public int maximalRectangle(char[][] matrix) {

        int cols = matrix[0].length;
        int rows = matrix.length;
        int[][] prefixMat = convertToPrefixSum(matrix, rows, cols);

        int maxi = 0;

        for (int i = 0; i < rows; i++) {
            maxi = Math.max(maxi, findMaxArea(prefixMat[i]));
        }

        return maxi;
    }
}