public class j_08_recursion {

    static int  factorial(int x){
        if(x<=1) return 1;

        return  x* factorial(x-1);
    }
    public static void main(String[] args) {
        
        int n =4;

        int res = factorial(n);
        System.out.println(res);
    }
}
