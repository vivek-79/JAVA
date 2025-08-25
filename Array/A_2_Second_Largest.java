import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A_2_Second_Largest {

    private static int getSecondLargest(List<Integer> ds){

        int maxi = Integer.MIN_VALUE;
        int sMaxi = maxi;

        for( int i=0;i<ds.size();i++){

            int elem =ds.get(i);

            if(elem>maxi){
                sMaxi = maxi;
                maxi = elem;
            }
        };

        return sMaxi;
    }
     public static void main(String[] args) {
        
        List<Integer> ds = new ArrayList<>(Arrays.asList(6,8,1,3,6,8,0));

        System.out.println(getSecondLargest(ds));
        
    }
}
