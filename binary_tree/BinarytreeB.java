package binary_tree;

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
    }


    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree = new Binarytree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

    }
}


// for creating a tree ussing pre-order sequence time complexity -- O(n)