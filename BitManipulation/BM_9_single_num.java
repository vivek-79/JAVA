package BitManipulation;

public class BM_9_single_num {
    public static void main(String[] args) {
        
        int [] arr = {1,1,2,2,4,3,4};

        int ans =0;

        for(int i=0;i<arr.length;i++){
            ans = ans ^ arr[i];
        };

        System.out.println(ans);
    }
}
