import java.util.Arrays;

public class A_8_Moving_Zero_To_End {
    

    private static void moveZeroToEnd(int []ds){

        int n = ds.length;
        int pos =0;
        /* keeping pos =0;
         * iterate over array if value is non-zero;
         * move it to pos index then
         * pos-> pos+1;
         * It ensures all non-zero elem comes first;
         * then fill remaining array with 0
         */
        for( int i=0;i<n;i++){

            if(ds[i] !=0){
                ds[pos] = ds[i];
                pos++;
            }
        };

        while(pos<n){
            ds[pos] = 0;
            pos++;
        }
    }
    public static void main(String[] args) {

        int[] ds = { 0,1,2,0,3,0,4,0,0,5,0,6 };
        moveZeroToEnd(ds);
        System.out.println(Arrays.toString(ds));

    }
}
