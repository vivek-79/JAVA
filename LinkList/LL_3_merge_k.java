package LinkList;

import java.util.*;

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

class Pair {
    int first;
    Node second;

    Pair(int f, Node s) {
        this.first = f;
        this.second = s;
    }
};

public class LL_3_merge_k {

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

    // merge LL

    private static Node merge(Node[] arr) {

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.first, b.first));

        for (int i = 0; i < arr.length; i++) {
            pq.add(new Pair(arr[i].data, arr[i]));
        }
        ;

        Node dummyNode = new Node(-1);
        Node mover = dummyNode;

        while (!pq.isEmpty()) {

            Pair p = pq.peek();
            Node temp = p.second;

            mover.next = temp;
            mover = temp;

            pq.poll();
            if (temp.next != null)
                pq.add(new Pair(temp.next.data, temp.next));
        }

        return dummyNode.next;
    }

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 5, 6, 7, 8, 9 };
        int[] arr3 = { 1, 6, 7, 8, 9, 10, 11, 12 };
        int[] arr4 = { 1, 7, 9, 12, 14, 15, 16 };

        Node ll1 = convertArr2LL(arr1);
        Node ll2 = convertArr2LL(arr2);
        Node ll3 = convertArr2LL(arr3);
        Node ll4 = convertArr2LL(arr4);

        Node[] arr = { ll1, ll2, ll3, ll4 };

        Node res = merge(arr);
        print(res);
    }

}
