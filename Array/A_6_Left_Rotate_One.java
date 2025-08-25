import java.util.Arrays;

public class A_6_Left_Rotate_One {

    private static void leftRotateByOne(int []ds){

        int temp = ds[0];
        int n = ds.length;
        
        for(int i=1;i<n;i++){
            ds[i-1] = ds[i];
        };

        ds[n-1] = temp;
    }
    public static void main(String[] args) {
        
        int [] ds = {1, 2, 3, 4, 5, 6};
        leftRotateByOne(ds);
        System.out.println(Arrays.toString(ds));
        
    }
}
