class Solution {

    private void reverse(int[] nums) {

        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public void rotate(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {

            for (int j = 0; j <= i; j++) {

                int num = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = num;
            }
        }

        for (int i = 0; i < row; i++) {
            reverse(matrix[i]);
        }

        return;
    }
}