class Solution {
    public int firstMissingPositive(int[] nums) {

        boolean containsOne = false;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {

            if (nums[i] == 1)
                containsOne = true;
            else if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = 1;
            }
        }
        ;

        if (!containsOne)
            return 1;

        for (int i = 0; i < n; i++) {

            int indx = Math.abs(nums[i]) - 1;

            if (nums[indx] < 0)
                continue;
            else
                nums[indx] *= -1;

        }

        for (int i = 0; i < n; i++) {

            if (nums[i] > 0)
                return i + 1;
        }

        return n + 1;
    }
}