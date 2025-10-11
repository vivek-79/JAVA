package A_Maths;

// find number of digits with base as b

public class M_Q_8 {
    public static void main(String[] args) {
        

        int num = 10;
        int base = 2;

        int numDigit = (int) ( Math.log(num)/ Math.log(base)) + 1;

        System.out.println(numDigit);
    }
}
