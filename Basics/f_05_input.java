
import java.util.Scanner;

public class f_05_input {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Subjects mark");
        int a  = sc.nextInt();
        System.out.println("Enter second Subjects mark");
        int b  = sc.nextInt();
        System.out.println("Enter third Subjects mark");
        int c  = sc.nextInt();
        System.out.println("Enter fourth Subjects mark");
        int d  = sc.nextInt();
        System.out.println("Enter fifth Subjects mark");
        int e  = sc.nextInt();

        sc.close();

        float percent = (a+b+c+d+e)/5f;
        System.out.print("Percentegae scored is : ");
        System.out.println(percent);
    }
}
