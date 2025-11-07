package A_Maths;



// find out all the factors of a given num

public class M_Q_15 {
    
    public static void main(String[] args) {
        

        int num  = 36;

        for( int i=1;i<=Math.sqrt(num);i++){

            if( (num % i) ==0 ){

                if(i == Math.sqrt(num) ){
                    System.out.println(i);
                }
                else{

                    System.out.println(i+"  "+num/i);
                }
            }
        }
    }
}
