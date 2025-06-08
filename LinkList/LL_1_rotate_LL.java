package LinkList;

class Node {

    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class LL_1_rotate_LL {

    // array to LL
    private static Node convertArr2LL(int[] arr) {

        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {

            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    };

    //rotating LL
    private static Node rotateLL(Node head , int k){

        if(head == null || head.next == null) return head;
        
        int len =1;
        Node tail = head;
        while( tail.next !=null){

            len ++;
            tail = tail.next;
        }

        int rotateTimes = k % len;
        if( rotateTimes ==0 ) return head;

        tail.next = head; // circular LL

        Node mover = head;
        int curr =1;
        while( mover != null ){

            if(curr == len - rotateTimes){

                head = mover.next;
                mover.next = null;
                break;
            }

            mover = mover.next;
            curr++;
        }

        return head;
    };

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        Node ll = convertArr2LL(arr);
        Node res = rotateLL(ll, 2);

        while (res != null) {
            System.out.print(res.data + " ");
            res = res.next;
        };
    }
}
