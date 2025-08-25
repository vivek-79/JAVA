

public class A_11_Find_Missing_Num {

    private static int findMissing( int [] arr, int k){

        int xor1 =0; // for array elem
        int xor2=0; // for elem 1-K;


        for(int i=1;i<=arr.length;i++){

            xor1 = xor1^arr[i-1];
            xor2 = xor2^i;
        }

        xor2 = xor2^k; // Meaning keeps xor of 1 to K-1 as length is 1 small due to one missing num

        return xor1^xor2;
    }
    public static void main(String[] args) {

        int[] arr = { 1, 2,4,5,6,7,8,9};

        int ans = findMissing(arr,9);
        System.out.println(ans);

    }
}
