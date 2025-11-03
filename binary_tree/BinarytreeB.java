package binary_tree;
import java.util.*;

public class BinarytreeB {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binarytree{
        static int idx = -1;//static because in every recursion our value will be upgrade
        public static Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = buildTree(nodes); 
            newnode.right = buildTree(nodes); 
            return newnode;
        }

        //tree traversal pre-order
        public static void preorder(Node root){ //time complexity --O(n)
            if (root == null) {
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        //tree traversal using in-order method
        public static void inorder(Node root){  //time complexity --O(n)
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        //tree traversal using post-order method
        public static void postorder(Node root){ //time complexity --O(n)
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        //tree traversal using level-order method
        public static void levelorder(Node root){
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currnode = q.remove();
                if (currnode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currnode.data+" ");
                    if (currnode.left != null) {
                        q.add(currnode.left);
                    }
                    if (currnode.right != null) {
                        q.add(currnode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree = new Binarytree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data); //1 it is our root of the  tree

        // tree.preorder(root); //1 2 4 5 3 6  using pre-order tree traversal

        // tree.inorder(root);//4 2 5 1 3 6  using in-order tree traversal

        // tree.postorder(root);//4 5 2 6 3 1  using post-order tree traversal

        // tree.levelorder(root);
        /**
        1
        2 3
        4 5 6
         */





    }
}


// for creating a tree ussing pre-order sequence time complexity -- O(n)