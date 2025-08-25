
import java.util.Arrays;

public class A_3_Sum_Closest {


    public int threeSumClosest(int[] nums, int target) {
        
        // first sorted to make it work in O(n^2);
        Arrays.sort(nums);
        int resultSum = nums[0] + nums[1]+ nums[2];
        int minDiffToTarget = Integer.MAX_VALUE;

        int n = nums.length;

        //we will fix one pointer at starting and then apply two pointer on rest of array
        for(int i=0;i<n-2;i++){

            int left = i+1;
            int right = n-1;

            while( left <right){

                int sum = nums[i]+nums[left]+nums[right];

                if(sum == target) return sum;
                if(sum <  target) left ++;
                if(sum >  target) right --;

                //Calculating the difference b/w sum and target
                int diffToTarget = Math.abs(sum-target);

                //if differsence is min than last then update diff and resultsum
                if(diffToTarget <minDiffToTarget){
                    resultSum = sum;
                    minDiffToTarget =diffToTarget;
                }

            }
        };

        return resultSum;
    }
}
