package C_Recursion;

import java.io.PrintWriter;
import java.util.Scanner;

public class Palidrom_Check {

    public static void solve(Scanner sc, PrintWriter pw) {

        String str = sc.next();

        pw.println(getSolution(str, 0, str.length() - 1));
    }

    static String getSolution(String str, int s, int e) {

        if (s >= e) {
            return "YES";
        }

        if (!(str.charAt(s) == str.charAt(e))) {
            return "NO";
        }

        return getSolution(str, s + 1, e - 1);

    }
}
