package B_Array;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Longest_SubArray_K_Sum {
    

    public static void solve( Scanner sc , PrintWriter pw  ){

        int [] nums = new int [sc.nextInt()];
        int k = sc.nextInt();

        for( int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }


        int res = getLengthWithNegative(nums,k);
        pw.println(res);
    }

    // only positive
    static int getLengthOnlyPositive ( int nums[], int k){

        int maxLen =0;
        int start =0;
        int sum =0;

        for ( int end=0;end<nums.length;end++){

            sum += nums[end];

            while( start <=end && sum > k){
                start ++;
                sum -= nums[start];
            }
            
            if( sum <= k){
                maxLen = Math.max(maxLen,(end-start+1));
            }
        }

        return maxLen;
    }

    // Both positive and negative
    static int getLengthWithNegative( int nums[], int k){

        int maxLen =0;

        Map<Integer,Integer> mpp = new HashMap<>();

        int start = 0;
        int last = nums.length;
        int sum = 0;

        while (start<last) {
            
            sum += nums[start];

            
            if( sum ==k){
                maxLen = start+1;
            }

            int rem  = sum -k;

            if(mpp.containsKey(rem)){

                maxLen = Math.max(maxLen, start-mpp.get(rem));
            }
            if(!mpp.containsKey(sum)){
                mpp.put(sum, start);
            }

            start ++;

        }
        return maxLen;
    }
}
