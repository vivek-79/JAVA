


class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class LL_1 {
    

    public static void main(String[] args) {
        
        Node x = new Node(2);
        System.out.println(x.data + " " + x.next);
    }
}
