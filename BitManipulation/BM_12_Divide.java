package BitManipulation;

public class BM_12_Divide {
    
    public static void main(String[] args) {
        
        int dividend = 5;
        int divisor =3;

        if(divisor == dividend){
            System.out.println(1);
        };

        long d = Math.abs(divisor);
        long n = Math.abs(dividend);

        Boolean sign = true;

        if(divisor< 0 && dividend >=0 ) sign = false;
        if(dividend <0 && divisor >=0) sign = false;
        long quotient =0;

        while( n >= d){
            int cnt =0;
            while( n >= (d << (cnt+1))){
                cnt +=1;
            };

            quotient += 1<< cnt;
            n -= (d<< cnt);
        };

        if(quotient  == (1<<31) && sign){

            System.out.println("Greater than Int Max");
        }
        if(quotient == (1<<31) && !sign){
            System.out.println("Smaller than Int Min");
        }

        quotient = sign ? quotient : (-1*quotient);
        System.out.println("Ans is: "+ quotient);
    }
}
