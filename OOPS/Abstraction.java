package OOPS;

public class Abstraction {
    
    public static void main(String[] args) {
        
        Car alto = new Alto();
        alto.name("Alto Car");
    }
}

// abstract class
abstract class Car{

    abstract void name( String name);
}


class Alto extends Car{

    @Override
    void name( String name){
        
        System.out.println(name);
    }
}

class Bolero extends Car{

    @Override
    void name( String name){
        System.out.println(name);
    }
}