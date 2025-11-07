
package A_Maths;



// calculate gcd or hcf of two numbers;

public class M_Q_16 {
    

    public static void main(String[] args) {
        
        int x = 0;
        int y= 36;

        int res = findGcd(x,y);
        System.out.println(res);
    }

    static int findGcd( int x, int y){

        if( x ==0 ){

            return y;
        }

        return findGcd(y%x, x);
    }
}
