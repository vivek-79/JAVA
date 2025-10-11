package A_Maths;

// Check a number is odd or even

public class M_Q_1 {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 9;

        int check_a = a & 1;
        int check_b = b & 1;

        System.out.println(check_a == 0  ? "A is even: "+ a: "A is odd: "+ a);

        System.out.println(check_b == 1 ?  "A is odd: "+ a :"A is even: "+ a );
    }
}
