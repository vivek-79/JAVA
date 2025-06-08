package LinkList;

class  Node{

    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}
public class LL_structure {

    private static Node convertArr2LL(int [] arr){

        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i=1;i<arr.length;i++){

            Node temp = new Node(arr[i]);
            mover.next =temp;
            mover = temp;
        }

        return head;
    }
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5};

        Node res = convertArr2LL(arr);

        while(res != null){
            System.out.print(res.data + " ");
            res = res.next;
        };
    }
}
