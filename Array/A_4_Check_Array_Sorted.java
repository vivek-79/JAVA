import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A_4_Check_Array_Sorted {

    private static boolean checkSorted(List<Integer>ds){

        for( int i=0;i<ds.size()-1;i++){

            if(i>0 && ds.get(i)>ds.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        List<Integer> ds = new ArrayList<>(Arrays.asList(6,8,1,3,6,8,0));

        System.out.println(checkSorted(ds));
        
    }
}
