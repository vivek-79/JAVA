package A_Maths;



// find the square root of a number;

public class M_Q_14 {
    
    public static void main(String[] args) {
        

        System.out.println(solve(36));
    }

    private static double solve( double n){

        double x = n;
        double root;

        while(true){

            root = 0.5 * ( x + (n/x));

            if( Math.abs(root - x) <0.5) break;
            x = root;
        }

        return root;
    }
}
