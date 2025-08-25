import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A_32_Similar_Arrays {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {

            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int [] A = new int [N];
            st = new StringTokenizer(br.readLine());
            for( int i=0;i<N;i++){
                A[i] = Integer.parseInt(st.nextToken());
            }

            int [] B = new int [M];
            st= new StringTokenizer(br.readLine());
            for( int i=0;i<M;i++){
                B[i] = Integer.parseInt(st.nextToken());
            }

            // ✅ Debug prints
            System.out.println("Case #" + (t+1));
            System.out.println("Array A: " + Arrays.toString(A));
            System.out.println("Array B: " + Arrays.toString(B));

            // 🚀 Later, you’ll replace this with your solution
        }

        br.close();
    }
}
