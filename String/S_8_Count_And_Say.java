import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class S_8_Count_And_Say {
    
    private static String countAndSay( int n){

        String sb = "1";

        while(n>1){

            int low =0;

            StringBuilder s = new StringBuilder();

            while(low < sb.length()){

                char curr = sb.charAt(low);
                int start = low;

                while(low < sb.length() && sb.charAt(low)== curr){
                    low ++;
                }

                int val = low- start;

                s.append(val);
                s.append(curr);
            }
            sb = s.toString();
            n--;
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        

        try(
            Scanner sc = new Scanner(new File("input.txt"));
            PrintWriter pr = new PrintWriter("output.txt");
        ) {
            
            int T = sc.nextInt();
            sc.nextLine();

            for( int t=0;t<T;t++){

                int n = sc.nextInt();
                String res = countAndSay(n);
                pr.println(res);
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
