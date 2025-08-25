public class A_15_Two_Sum {
    

    private static boolean solveTwoSum( int[] arr ,int n,int k){

        // Fist sort the array then it will work
        boolean ans = false;
        int left= 0, right =n-1;

        while(left < right){
            
            int sum = arr[left] + arr[right];

            if(sum ==k){
                return true;
            }
            else if(sum < k){
                left ++;
            }
            else right--;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = { 2,3,4,5,6,7,8,9};
        int n = arr.length;

        boolean ans = solveTwoSum(arr,n,11);
        System.out.println(ans);

    }
}
