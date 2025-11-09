package C_Recursion;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class C_1_IoUtils {
    public static Scanner sc;
    public static PrintWriter pw;

    // Initialize I/O once
    public static void init() throws Exception {
        sc = new Scanner(new File("input.txt"));
        pw = new PrintWriter(new File("output.txt"));
    }

    // Close both safely
    public static void close() {
        if (sc != null)
            sc.close();
        if (pw != null)
            pw.close();
    }
}