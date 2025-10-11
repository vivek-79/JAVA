package A_Maths;


// check if its power of 2

public class M_Q_9 {
    
    public static void main(String[] args) {
        
        int num = 8;

        int isPowerTwo = num & num-1;

        System.out.println( isPowerTwo == 0 ? " Its a power of 2" : "Its not a power of 2");
    }
}
