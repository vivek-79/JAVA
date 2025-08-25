import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class S_7_Panagram {
    
    private static boolean solvePanagram( char [] chars){

        int [] mpp = new int [26];

        for( int i=0;i<chars.length;i++){
            mpp[chars[i]-'a'] ++;
        }

        for( int i=0;i<26;i++){

            if(mpp[i] == 0) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        

        try ( Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        ) {
            

            int T = sc.nextInt();
            sc.nextLine(); // consume leftover newline
            
            for(int t=0;t<T;t++){

            char [] chars = sc.nextLine().toCharArray();
            
            // Fuction
            boolean res = solvePanagram(chars);
            
            // Output
            pw.println(res);

            }

        } catch (Exception e) {
            
        }
    }
}
