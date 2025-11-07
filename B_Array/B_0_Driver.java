package B_Array;
import B_Array.IoUtils;

// find the largest element in array;

public class B_0_Driver {
    

    public static void main(String[] args) {
        
        try{
            
            IoUtils.init();

            int T = IoUtils.sc.nextInt();

            for( int t=0;t<T;t++){
                
                B_1_Largest_Elem.solve(IoUtils.sc, IoUtils.pw);
            }

        } catch (Exception e) {
            System.out.println(e);
        }  finally{
            IoUtils.close();
        }
    }
}
