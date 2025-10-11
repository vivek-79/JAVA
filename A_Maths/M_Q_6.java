package A_Maths;

// find the number which is not repeating 3 times

public class M_Q_6 {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 99 };

        System.out.println(findUnique(arr));
    }

    // Helper function
    private static int findUnique ( int [] arr){


        // Array of size 31
        int container [] = new int[32];

        // adding set bit to array indexes
        for( int num:arr){

            for( int i=0;i<32;i++){

                if( (num & (1<< i)) !=0){
                    container [i] ++;
                }
            }
        }

        // modulating by 3- as everyone is 3 times
        for( int i=0;i<32;i++){
            container [i] %=3;
        }

        // re-constructing number
        int res =0;
        for( int i=0;i<32;i++){

            if( container[i] !=0){

                res |=  (1 << i);
            }
        }

        return res;
    }
}
