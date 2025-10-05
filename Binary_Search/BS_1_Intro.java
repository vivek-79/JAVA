package Binary_Search;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class BS_1_Intro {

    private static int solveSearch(int []num, int low, int high,int target){

        if(low>high) return -1;

        int mid = (low+high)/2;

        if(num[mid] == target) return mid;
        else if( num[mid]>target){
            return solveSearch(num, low, mid-1, target);
        }
        else{
            return solveSearch(num, mid+1, high, target);
        }
    }
    public static void main(String[] args) {
        
        try (
            Scanner sc = new Scanner( new File("input.txt"));
            PrintWriter pw = new PrintWriter("output.txt")
        ){
            
            int T = sc.nextInt();

            for(int t=0;t<T;t++){

                int N= sc.nextInt();
                int [] num = new int [N];

                int target = sc.nextInt();

                for(int i=0;i<N;i++ ){
                    num[i] = sc.nextInt();
                }

                int res = solveSearch(num,0,N-1,target);
                pw.println(res);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
