class Solution {
    public int trap(int[] height) {

        int low = 0;
        int high = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;

        int total = 0;

        while (low <= high) {

            // We will travel the smaller building first
            // which makes sures that the building other side will always greater so that
            // water logs
            // Also we will keep updating leftmax and rightMax so that water logged will be
            // maximum
            if (height[low] <= height[high]) {

                if (leftMax > height[low]) {

                    total += leftMax - height[low];
                }
                leftMax = Math.max(leftMax, height[low]);
                low++;
            } else {

                if (rightMax > height[high]) {

                    total += rightMax - height[high];
                }

                rightMax = Math.max(rightMax, height[high]);
                high--;
            }
        }

        return total;
    }
}