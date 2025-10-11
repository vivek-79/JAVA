package A_Maths;


// set the i-th bit

public class M_Q_4 {
    public static void main(String[] args) {

        int num = 4;
        int bit = 2;

        int mask = 1 <<(bit-1);

        int res = num | mask;

        System.out.println(res);
    }
}
