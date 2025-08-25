import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A_1_Largest_Elem {

    private static int getMax(List<Integer> ds){

        int maxi = Integer.MIN_VALUE;
        for( int i=0;i<ds.size();i++){

            maxi = Math.max(maxi, ds.get(i));
        };

        return maxi;
    }
    public static void main(String[] args) {
        
        List<Integer> ds = new ArrayList<>(Arrays.asList(6,8,1,3,6,8,0));

        System.out.println(getMax(ds));
        
    }
}
