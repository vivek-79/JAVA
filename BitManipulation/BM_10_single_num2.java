package BitManipulation;

public class BM_10_single_num2 {
    public static void main(String[] args) {
        
        int [] arr = {1,1,1,4,2,2,2};

        int ones =0 , twos = 0;
        for(int i= 0 ; i<arr.length;i++){

            ones = (ones ^ arr[i]) & ~ twos;
            twos = (twos ^ arr[i]) & ~ ones;
        }

        System.out.println(ones);
    }
}
