
class Solution {

    // swap function
    public void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    // main
    public void nextPermutation(int[] nums) {

        int n = nums.length - 1;

        int indx = -1;

        // Finding break point
        for (int i = n - 1; i >= 0; i--) {

            if (nums[i] < nums[i + 1]) {
                indx = i;
                break;
            }
        }

        // If its last permutation
        if (indx == -1) {
            int i = 0;
            while (i <= n) {
                swap(nums, i, n);
                i++;
                n--;
            }
            return;
        }

        // Finding smallest from back and swap
        for (int i = n; i > indx; i--) {

            if (nums[i] > nums[indx]) {
                swap(nums, i, indx);
                indx++;
                break;
            }

        }

        // Reverse array to get closest greater num
        while (indx <= n) {
            swap(nums, indx, n);
            indx++;
            n--;
        }

        return;
    }
}