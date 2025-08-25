
import java.util.Arrays;

public class A_5_Remove_Dupli_From_Sortted {
    
    private static int [] checkDuplicate ( int [] ds){

        int n = ds.length -1;
        int  j=0;

        // j=0 , i=1
        // If arr[i] == arr[j] skip , i=2;
        // If arr[i] != arr[j]
        //j= j+1 => 1
        // arr[1] = arr[2]
        // By this every unique elem will come together 
        for( int i= 1;i<=n;i++){
                
            if(ds[i] != ds[j]){

                j++;
                ds[j] = ds[i];
            }
        };


        return ds;
    }

    public static void main(String[] args) {
        
        int [] ds = {1,1,1,2,2,3,4,4,5,6,7,7,7};
        System.out.println(Arrays.toString(checkDuplicate(ds)));
        
    }
}
