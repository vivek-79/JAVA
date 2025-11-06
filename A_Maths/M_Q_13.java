package A_Maths;

public class M_Q_13 {
    public static void main(String[] args) {
        

        int num = 99;

        boolean res = checkPrime(num);

        System.out.println( res ? "Its a prime" : "Not a prime");
    }


    private static boolean checkPrime( int num){


        if( num  == 1) return false;

        for( int i= 2; i <= Math.sqrt(num);i++){

            if( num % i ==0) return false;
        }

        return true;
    }
}
