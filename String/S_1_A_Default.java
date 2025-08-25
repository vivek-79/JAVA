import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class S_1_A_Default {


    // Dummy function to process array
    private static int dummyFunction(int[] arr) {
        int sum = 0;
        for (int num : arr)
            sum += num; // just sum as example
        return sum;
    }
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(new File("input.txt"));
                PrintWriter pw = new PrintWriter("output.txt")) {
            
            int T = sc.nextInt(); // number of test cases

            for (int t = 0; t < T; t++) {
                int n = sc.nextInt(); // size of array
                int[] arr = new int[n];

                // read array elements
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }

                // call dummy function
                int result = dummyFunction(arr);

                // print result to output.txt
                pw.println(result);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
}
