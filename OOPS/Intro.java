package OOPS;

public class Intro {
    public static void main(String[] args) {
        
        Student vivek = new Student("Vivek", 12); 
    }
}
class Student {

    int roll;
    String name;
    
    // Student vivek = new Student("Vivek",12)
    // Here this replaced with vivek
    

    // Also work without this but we have to use diff variable names in class and contructor
    Student( String name, int roll ){
        this.name = name;
        this.roll = roll;
    }
    

    // Calling one contructor from other
    Student(){
        this("Vivek", 17);
    }
}