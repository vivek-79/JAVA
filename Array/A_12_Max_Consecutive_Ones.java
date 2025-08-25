public class A_12_Max_Consecutive_Ones {


    private static int findMaxConsecutiveOnes( int [] arr){

        int maxi =0;
        int cnt =0;

        for( int num:arr){

            if(num ==1){
                cnt++;
                maxi = Math.max(maxi, cnt);
            }
            else{
                cnt =0; 
            }
        }

        return maxi;
    }
    public static void main(String[] args) {

        int[] arr = { 0,1,1,2,1,1,1,2,3,1,2,1,5,1,1,1,1};

        int ans = findMaxConsecutiveOnes(arr);
        System.out.println(ans);

    }
}
