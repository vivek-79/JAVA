package Binary_Search;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class BS_2_Lower_Bound {

    private static int  solveLowerBound( int [] num , int target, int low, int high){

        if(low>high) return low;

        int mid = (low+high)/2;

        if(num[mid] >= target){
            return solveLowerBound(num, target, low, mid-1);
        }
        else{
            return solveLowerBound(num, target, mid+1, high);
        }

    }
    public static void main(String[] args) {
        try (
            Scanner sc = new Scanner( new File("input.txt"));
            PrintWriter pw = new PrintWriter("output.txt")
            ){
            

                int T = sc.nextInt();

                for(int t=0;t<T;t++){

                    int N = sc.nextInt();
                    int [] num  = new int[N];

                    int target = sc.nextInt();


                    for( int n=0;n<N;n++){
                        num[n] = sc.nextInt();
                    }


                    int res = solveLowerBound(num,target,0,N-1);
                    pw.println(res);
                }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
