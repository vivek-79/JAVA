package A_Maths;


// Find the non repeating element

public class M_Q_2 {
    
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,1,2,3,4};

        int xor =0;

        for( int i:arr){

            xor ^=i;
        }

        System.out.println(xor);
    }
}
