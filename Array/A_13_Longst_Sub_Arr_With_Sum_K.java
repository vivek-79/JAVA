import java.util.HashMap;
import java.util.Map;

public class A_13_Longst_Sub_Arr_With_Sum_K {

    
    private static long longestsubArrayPositive( int[] arr, long k){

        int n = arr.length;
        int i =0,j=0;
        long  sum =0;
        int maxi =0;

        while(j<n){

            sum += arr[j];

            while(i<=j && sum>k){
                sum -= arr[i];
                i++;
            };

            if(sum==k){
                maxi = Math.max(maxi, (j-i)+1);
            }
            j++;

        }

        return maxi;
    }
    
    private static int longestSubArray(int [] arr, long k){
        long sum =0;
        int maxi =0;
        int n = arr.length;
        Map<Long,Integer> mpp = new HashMap<>();

        int left =0,right =0;

        while(right < n){

            sum += arr[right];

            if( sum ==k) maxi = Math.max(maxi, right+1);

            long remaining = sum -k;

            if(mpp.containsKey(remaining)){
                maxi = Math.max(maxi, (right - mpp.get(remaining)));
            };

            if( !mpp.containsKey(remaining)){
                mpp.put(sum, right);
            }

            right++;
        }

        return maxi;
    }
    
    public static void main(String[] args) {

        int[] arr = { 2,2,-4,1,1,1,1,4,2,3};

        // Only Positive
        //long ans = longestsubArrayPositive(arr,7);

        // Both +ve and -ve ---> Prefix sum
        int ans = longestSubArray(arr, 4);
        System.out.println(ans);

    }
}
