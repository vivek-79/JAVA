import java.util.Arrays;

public class A_7_Left_Rotate_By_K {

    private static void reverse(int [] ds , int start, int end){

        while(start <end){

            int temp = ds[start];
            ds[start] = ds[end];
            ds[end] = temp;

            start++;
            end--;
        }
    }
    private static void leftRotateByK(int[] ds,int k) {

        int n = ds.length;
        k = k% n;

        reverse(ds,0,k-1);
        reverse(ds,k,n-1);
        reverse(ds,0,n-1);
    }

    public static void main(String[] args) {

        int[] ds = { 1, 2, 3, 4, 5, 6 };
        leftRotateByK(ds,10);
        System.out.println(Arrays.toString(ds));

    }
}
