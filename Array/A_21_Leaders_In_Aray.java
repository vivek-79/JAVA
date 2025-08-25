import java.util.ArrayList;
import java.util.List;

public class A_21_Leaders_In_Aray {
    
    public static List<Integer> findLeaders( int [] nums){

        List<Integer> res = new ArrayList<>();


        int maxi = Integer.MIN_VALUE;
        for( int i=nums.length-1;i>=0;i--){

            if(nums[i]>maxi){
                res.add(nums[i]);
                maxi = nums[i];
            }
        }

        return res;
    }
    public static void main(String[] args) {
        
        int [] nums ={10,22,12,3,0,6};
        List<Integer> res = new ArrayList<>();


        res = findLeaders(nums);
        System.out.println(res);
    }
}
