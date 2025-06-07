
class Employ {
    private int id; // access from same class not from outside
    String name;

    public void setId (int i){ // setter function

        this.id =i;
    }
    public void printDetail(){
        System.out.println("My id is: "+ id); 
        System.out.println("My name is: "+ name);
    }
}

public class j_09_oops {

    public static void main(String[] args) {
        Employ vivek = new Employ();
        vivek.name = "vivek";
        vivek.setId(1);
        vivek.printDetail();
    }
}
