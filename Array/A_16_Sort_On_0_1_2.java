
import java.util.Arrays;

public class A_16_Sort_On_0_1_2 {

    private static void swap( int []arr , int i, int j){

        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[j] ^ arr[i];
        arr[i] = arr[i] ^ arr[j];
    }
    private static void solveSorting( int [] arr){

        int low  =0;
        int mid =0;
        int high = arr.length-1;

        while(mid<=high){

            if(arr[mid] ==0){
                swap(arr, low, mid);
                low++;
                mid++;
            }
            else if( arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
    public static void main(String[] args) {

        int[] arr = { 1,0,2,1,0,1,0,2,2,1,0,1,2,0};

        // Dutch National Flag Algo
        solveSorting(arr);
        System.out.println(Arrays.toString(arr));

    }
}
