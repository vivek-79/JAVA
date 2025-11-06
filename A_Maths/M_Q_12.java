package A_Maths;




// Find xor of all the number between a and b;

public class M_Q_12 {
    public static void main(String[] args) {
        

        int a = 3, b=9;

        int xra = calcXor(a-1);
        int xrb = calcXor(b);

        System.out.println(xrb^xra);
    }

    private static int calcXor( int n ){
        
        int res = n % 4;

        if( res == 0){
            return n;
        }
        else if(res ==1){
            return 1;
        }
        else if( res ==2){
            return  n+1;
        }else{
            return 0;
        }
    }
}
