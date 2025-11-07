package A_Maths;

// find the lcm of two numbers;

public class M_Q_17 {

    public static void main(String[] args) {
        int x = 4;
        int y = 5;

        int hcf = findGcd(x, y);
        int lcm = (x * y) / hcf;

        System.out.println(lcm);
    }

    static int findGcd(int x, int y) {

        if (x == 0) {

            return y;
        }

        return findGcd(y % x, x);
    }
}
