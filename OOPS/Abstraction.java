package OOPS;

public class Abstraction {

    public static void main(String[] args) {

        Car alto = new Alto();
        alto.name("Alto Car");

        Bike bike = new Bike();

        bike.start();
    }
}

interface Engine {

    static final int NUM_OF_TYRE = 2;

    void start();

    void stop();
}

interface Light {

    void color();

    void range();
}

class Bike implements Engine,Light {
    

    public void start() {
        System.out.println("Bike started");
    };

    public void stop(){

    }

    public void color(){

    }

    public void range(){

    }

}

// abstract class
abstract class Car {

    abstract void name(String name);
}

class Alto extends Car {

    @Override
    void name(String name) {

        System.out.println(name);
    }
}

class Bolero extends Car {

    @Override
    void name(String name) {
        System.out.println(name);
    }
}