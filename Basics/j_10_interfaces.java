
interface Bicycle{
    int a = 45; // the values cant be changed as its final
    void applyBrake();
    void speedUp();
}

class AvonCycle implements Bicycle {

    public void applyBrake(){
        System.out.println("Applying Break");
    }
    public void speedUp(){
        System.out.println("Speeding Up");
    }
}

public class j_10_interfaces {
    
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake();
    }
}
