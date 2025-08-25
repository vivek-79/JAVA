

public class LL_2 {

    // itereting
    private static void traverse(Node head) {

        Node mover = head;

        while (mover != null) {
            System.out.println(mover.data);
            mover = mover.next;
        }
    }

    // Array to LL
    private static Node conertToLL(int[] nums) {

        Node head = new Node(nums[0]);
        Node mover = head;

        for (int i = 1; i < nums.length; i++) {
            Node temp = new Node(nums[i]);
            mover.next = temp;
            mover = mover.next;
        }

        return head;
    }

    // Main
    public static void main(String[] args) {

        int [] nums =  {1,2,3,4,5};

        Node head = conertToLL(nums);

        traverse(head);
    }
}
