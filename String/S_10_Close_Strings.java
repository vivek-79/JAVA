import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class S_10_Close_Strings {


    private static boolean solveClose(String word1, String word2){

        int []freq1 = new int [26];
        int []freq2 = new int[26];

        if(word1.length() != word2.length()){
            return false;
        }


        for (int i = 0; i < word1.length(); i++) {

            freq1[word1.charAt(i) - 'a']++;
            freq2[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {

            if (freq1[i] > 0 && freq2[i] > 0)
                continue;
            else if (freq1[i] == 0 && freq2[i] == 0)
                continue;
            else
                return false;
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);
    }
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new File("input.txt"));
                PrintWriter pw = new PrintWriter("output.txt")) {

            int T = sc.nextInt();
            sc.nextLine();
            for (int t = 0; t < T; t++) {

                String word1 = sc.next();
                String word2 = sc.next();

                boolean res = solveClose(word1, word2);
                pw.println(res);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
