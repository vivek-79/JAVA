package A_Maths;

// find  a^b

public class M_Q_10 {
    public static void main(String[] args) {

        int power = 6;
        int base = 3;
        int ans = 1;

        while (power > 0) {

            if ((power & 1) != 0) {

                ans *= base;
            }

            base *= base;
            power = power >> 1;
        }

        System.out.println(ans);
    }
}
