import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BT_2_Level_Order_Traversal {


    static List<List<Integer>> levelOrder(Node root) {

        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) return ans;

        q.offer(root);

        while(!q.isEmpty()){

            int levelNum = q.size();

            List<Integer> temp = new ArrayList<>();

            for(int i=0;i<levelNum;i++){
                
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right !=null) q.offer(q.peek().right);
                temp.add(q.poll().data);
            }

            ans.add(temp);
        }
        return ans;
    }

    static class Node {

        int data;
        Node left = null;
        Node right = null;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node left) {
            this.data = data;
            this.left = left;
        }

        public Node(int data, Node left, Node right) {
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

        System.out.println(levelOrder(root));
    }
}
