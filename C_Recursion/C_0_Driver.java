package C_Recursion;
import B_Array.B_1_IoUtils;

// find the largest element in array;

public class C_0_Driver {
    

    public static void main(String[] args) {
        
        try{
            
            B_1_IoUtils.init();

            int T = B_1_IoUtils.sc.nextInt();

            for( int t=0;t<T;t++){
                
                Printing_All_Sub_Sequences.solve(B_1_IoUtils.sc, B_1_IoUtils.pw);
            }

        } catch (Exception e) {
            System.out.println(e);
        }  finally{
            B_1_IoUtils.close();
        }
    }
}
