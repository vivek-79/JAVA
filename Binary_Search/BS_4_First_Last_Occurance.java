package Binary_Search;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

class Pair <U,V>{

    U first;
    V second;

    public Pair (U first,V second){
        this.first = first;
        this.second = second;
    }

}
public class BS_4_First_Last_Occurance {


    private static int solveLowerBound(int[] num, int target, int low, int high) {

        if (low > high)
            return low;

        int mid = (low + high) / 2;

        if (num[mid] >= target) {
            return solveLowerBound(num, target, low, mid - 1);
        } else {
            return solveLowerBound(num, target, mid + 1, high);
        }

    }
    
    private static int solveUpperBound(int[] num, int target, int low, int high) {

        if (low > high)
            return low;

        int mid = (low + high) / 2;

        if (num[mid] > target) {

            return solveUpperBound(num, target, low, mid - 1);
        } else {
            return solveUpperBound(num, target, mid + 1, high);
        }

    }

    private static Pair<Integer,Integer> solveOccurance(int [] num, int target, int low, int high){

        Pair<Integer,Integer> res = new Pair<Integer,Integer>(-1,-1);

        int lower = solveLowerBound(num,target,low,high);
        int upper= solveUpperBound(num, target, low, high);

        if( lower == num.length || num[lower] !=target){
            res.first = -1;
            res.second =-1;
        }
        else{
            res.first = lower;
            res.second = upper-1;
        }

        return res;
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


                    Pair<Integer,Integer> res = solveOccurance(num,target,0,N-1);
                    pw.println(res.first + " " + res.second);
                }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
