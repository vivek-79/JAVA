import java.util.ArrayList;
import java.util.List;

public class BT_1_Pre_Order_Traversal {


    static List<Integer> preOrder( Node root, List<Integer> ans){

        if( root ==null ) return ans;

        ans.add(root.data);
        preOrder(root.left, ans);
        preOrder(root.right, ans);

        return ans;
    }

    static class Node{

        int data;
        Node left = null;
        Node right= null;

        public Node(int data){
            this.data = data;
        }

        public Node( int data , Node left){
            this.data = data;
            this.left = left;
        }
        public Node( int data , Node left,Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        

        Node root = new Node(1);

        root.left = new Node(3);
        root.left.right = new Node(7);
        root.left.left = new Node(6);

        root.right = new Node(2);
        root.right.right = new Node(5);
        root.right.left = new Node(4);

        List<Integer> ans = new ArrayList<>();
        System.out.println(preOrder(root,ans));
    }
}