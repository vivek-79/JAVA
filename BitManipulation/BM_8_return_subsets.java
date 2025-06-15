package BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class BM_8_return_subsets {
    
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4};

        int subSets = 1 << arr.length;
        List<List<Integer>> list1 = new ArrayList<>();

        for (int num=0;num<subSets;num++){
            
            List<Integer> list2 = new ArrayList<>();
            for(int i=0;i<arr.length;i++){

                if( (num & 1<<i) !=0 ){
                    list2.add(arr[i]);
                }
            }

            list1.add(list2);
        }

        
        System.out.println(list1.size());
    }
}
