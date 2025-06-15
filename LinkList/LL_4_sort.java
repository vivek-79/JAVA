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
};

public class LL_4_sort {

    private static Node convertArr2LL(int[] arr) {

        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {

            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    // Print LL

    private static void print(Node head) {

        if (head == null)
            return;

        Node temp = head;
        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // find middle node
    private static Node middleNode(Node head) {

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        ;

        return prev;
    };

    // merge LL
    private static Node merge2LL(Node head1, Node head2) {

        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;

        Node dummy = new Node(0);
        Node tail = dummy;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        ;

        while (head1 != null) {
            tail.next = head1;
            head1 = head1.next;
            tail = tail.next;
        }
        ;

        while (head2 != null) {
            tail.next = head2;
            head2 = head2.next;
            tail = tail.next;
        }
        ;

        return dummy.next;
    }

    // sort LL using merge sort
    private static Node sortLL(Node head) {

        if (head == null || head.next == null)
            return head;

        Node middNode = middleNode(head);
        Node middle = middNode.next;
        middNode.next = null;

        Node first = sortLL(head);
        Node second = sortLL(middle);

        return merge2LL(first, second);
    }

    public static void main(String[] args) {

        int[] arr = { 2, 4, 1, 6, 3, 5 };

        Node ll = convertArr2LL(arr);

        Node res = sortLL(ll);
        print(res);
    }

}
