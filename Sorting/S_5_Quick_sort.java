import java.util.Arrays;

public class S_5_Quick_sort {

    private static int getPivot(int [] arr, int low, int high){

        int pivot = low;
        int i=low;
        int j = high;

        while(i<j){

            while(arr[i] <= arr[pivot] && i<high){
                i++;
            };
            while(arr[j] > arr[pivot] && j>low){
                j--;
            };

            if (i < j) {
                arr[i] = arr[j] ^ arr[i];
                arr[j] = arr[j] ^ arr[i];
                arr[i] = arr[j] ^ arr[i];
            };
        };

        // swap pivot
        arr[pivot] = arr[j] ^ arr[pivot];
        arr[j] = arr[j] ^ arr[pivot];
        arr[pivot] = arr[j] ^ arr[pivot];

        return j;
    };

    private static void quickSort(int [] arr, int low, int high){

        if(low >= high) return;

        int pivot = getPivot(arr,low,high);

        quickSort(arr, low, pivot-1);
        quickSort(arr, pivot + 1, high);
    };

    public static void main(String[] args) {
        
        int [] arr = {6,3,2,8,9,4,2,1};
        int len = arr.length;

        quickSort(arr,0,len-1);

        System.out.println(Arrays.toString(arr));
    }
}
