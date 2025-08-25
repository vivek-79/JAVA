public class A_18_Max_Sub_Array_Sum {

    static class Pair<U, V> {
        public final U first;
        public final V second;

        public Pair(U first, V second) {
            this.first = first;
            this.second = second;
        }
    }

    private static Pair<Integer,Integer> solveMaxSubArraySum( int [] nums){


        int maxSum = nums[0];
        int currSum = nums[0];
        int start =0, end =0, tempStart =0;

        for(int i=1;i<nums.length;i++){

            // Decide whether to start new subarray at nums[i]
            if( currSum + nums[i] < nums[i]){
                currSum = nums[i];
                tempStart=i;
            }
            else{
                currSum += nums[i];
            }


            // Update best so far
            if( currSum > maxSum){
                maxSum = currSum;
                start=tempStart;
                end=i;
            }
        }
        return new Pair<Integer,Integer>(start, end);
    }

    public static void main(String[] args) {

        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };

        // Kadanes Algo
        Pair<Integer, Integer> pair = solveMaxSubArraySum(arr);
        System.out.println("Start -> "+pair.first + " " + " End -> " + pair.second);

    }
}
