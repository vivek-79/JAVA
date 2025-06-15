package BitManipulation;

public class BM_2_swap_num {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println(a);
        System.out.print(b);
    }
}
