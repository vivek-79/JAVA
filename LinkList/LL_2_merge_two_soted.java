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

public class LL_2_merge_two_soted {

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

    private static Node mergeLL(Node head1, Node head2){

        if(head1 == null && head2 == null) return null;

        Node mover1 = head1;
        Node mover2 = head2;

        Node dummy = new Node(0);
        Node newhead = dummy;

        while(mover1 != null && mover2 != null){

            if(mover1.data <= mover2.data){
                Node temp = new Node(mover1.data);
                dummy.next = temp;
                dummy = dummy.next;
                mover1 = mover1.next;
            }else{
                Node temp = new Node(mover2.data);
                dummy.next = temp;
                dummy = dummy.next;
                mover2 = mover2.next;
            }
        };

        while(mover1 != null){
            Node temp = new Node(mover1.data);
            dummy.next = temp;
            dummy = dummy.next;
            mover1 = mover1.next;
        };

        while (mover2 != null) {
            Node temp = new Node(mover2.data);
            dummy.next = temp;
            dummy = dummy.next;
            mover2 = mover2.next;
        };

        return newhead.next;
    }
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = {4,5,6,7,8,9,10,11,12};

        Node l1 = convertArr2LL(arr1);
        Node l2 = convertArr2LL(arr2);

        Node res = mergeLL(l1, l2);
        while (res != null) {
            System.out.print(res.data + " ");
            res = res.next;
        };
    }
}
