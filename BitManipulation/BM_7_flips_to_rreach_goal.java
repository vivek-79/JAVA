package BitManipulation;

public class BM_7_flips_to_rreach_goal {
    public static void main(String[] args) {
        
        int start = 10;
        int goal = 3;

        int ans  = start ^ goal;
        int cnt =0;
        
        while( ans != 0 ){
            cnt ++;
            ans = ans & (ans-1);
        }

        System.out.println(cnt);
    }
}
