import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class S_11_Detect_Capital {
    
    private static boolean solveDetect(String word){

        if( word.length() <=1) return true;

        int len = word.length();

        if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))){

            for(  int i=2;i<len;i++){

                if(Character.isLowerCase(word.charAt(i))) return false;
            }
            return true;
        }

        if(Character.isUpperCase(word.charAt(0))){

            for(  int i=1;i<len;i++){

                if(Character.isUpperCase(word.charAt(i))) return false;
            }
            return true;
        }

        for( int i=0;i<len;i++){

            if(Character.isUpperCase(word.charAt(i))) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        

        try (Scanner sc = new Scanner(new File("input.txt"));
            PrintWriter pw = new PrintWriter("output.txt")
        ){
            

            int T= sc.nextInt();
            sc.nextLine();

            for( int t=0;t<T;t++){

                String word = sc.next();

                boolean res = solveDetect(word); 
                pw.println(res);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
