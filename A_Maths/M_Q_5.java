package A_Maths;


// reset i-th bit

public class M_Q_5 {
    public static void main(String[] args) {
        int num = 6;
        int bit = 2;

        int mask = ~(1 << (bit - 1));

        int res = num & mask;

        System.out.println(res);
    }
}
