package OOPS;

public class Inheritance {

    public static void main(String[] args) {

        // Box box = new Box(1,2,3);
        
        // BoxWeight box2 = new BoxWeight();

        BoxWeight box3 = new BoxWeight( 4,5,6,7);
        System.out.println(box3.weight + " "+ box3.l);
    }
}



class Box {

    int l;
    int h;
    int w;

    public Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    public Box(int l, int h, int w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }


    public void info(){
        System.out.println("Inside box");
    }
}

class BoxWeight extends Box{

    int weight;

    public BoxWeight(){
        this.weight = -1;
    }

    // calling parent class constructor
    public BoxWeight( int l, int h, int w , int weight ){
        super( l,h,w);
        this.weight = weight;
    }
}
