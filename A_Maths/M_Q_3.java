package A_Maths;

// check a bit is set or not

public class M_Q_3 {
    public static void main(String[] args) {
        

        int num = 8;
        int check_bit = 3;

        int shifted_num = 1 << (check_bit -1);
        int res = num & shifted_num;

        System.out.println( res == 0 ? "Bit is not set" : "Bit is set");
    }
}
