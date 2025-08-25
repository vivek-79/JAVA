class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        int row = mat.length;
        int col = mat[0].length;

        int i = 0;
        int j = 0;

        boolean upward = true;

        int[] ans = new int[row * col];
        int idx = 0;

        while (i < row && j < col) {

            if (upward) {

                while (i >= 0 && j < col) {

                    ans[idx++] = mat[i][j];
                    i--;
                    j++;
                }

                if (j >= col) {
                    i += 2;
                    j--;
                } else {
                    i++;
                }
                upward = false;
            } else {

                while (j >= 0 && i < row) {

                    ans[idx++] = mat[i][j];
                    i++;
                    j--;
                }

                if (i >= row) {
                    i--;
                    j += 2;
                } else {
                    j++;
                }
                upward = true;
            }

        }
        return ans;
    }
}