package A_Maths;


// Given a number n , find the no of set bit

public class M_Q_11 {
    public static void main(String[] args) {
        


        int num = 4;
        int cnt  =0;

        while(num>0){

            if( (num & 1) == 1){
                cnt ++;
            }

            num =num >>1;
        }

        System.out.println(cnt);
    }
}
