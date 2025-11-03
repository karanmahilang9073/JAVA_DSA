package binary_tree;

import java.util.ArrayList;

public class Height {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //function to calculate the hight of tree
    public static int height(Node root){
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) + 1;
    }

    //function to count the total no of nodes of a tree
    public static int count(Node root){
        if (root == null) {
            return 0;
        }
        int leftcount = count(root.left);
        int rightcount = count(root.right);
        return leftcount + rightcount + 1;
    }

    //function to calculate the sum of the nodes
    public static int sum(Node root){
        if (root == null) {
            return 0;
        }
        int leftsum = sum(root.left);
        int rightsum = sum(root.right);
        return leftsum + rightsum + root.data;
    }

    //function to calculate the diameter pf a tree
    public static int diameter(Node root){ //time complexity -- O(n^2) because we are going to every node to calculate the height also
        if (root == null) {
            return 0;
        }
        int leftdiam = diameter(root.left);
        int leftHt = height(root.left);
        int rightdim = diameter(root.right);
        int rightHt = height(root.right);

        int selfdiam = leftHt + rightHt + 1;

        return Math.max(selfdiam, Math.max(leftdiam, rightdim));
    }

    //kth level 
    public static void Klevel(Node root, int level, int k){//time complexity --O(N)
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data+" ");
            return;
        }
        Klevel(root.left, level+1, k);
        Klevel(root.right, level+1, k);
    }
    

    public static boolean getpath(Node root, int n, ArrayList<Node> path){
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n){
            return true;
        } 
        boolean foundleft = getpath(root.left, n , path);
        boolean founright = getpath(root.right, n , path);

        if (foundleft || founright) {
            return true;
        }
        path.remove(path.size()-1);

        return false;
    }

    //find the lowest common ancestor of a tree approach one 
    public static Node lca(Node root, int n1, int n2){//time complexity --O(n)
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getpath(root, n1, path1);
        getpath(root, n2, path2);

        //last common ancestor
        int i=0;
        for(; i<path1.size() && i<path2.size() ; i++){
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        //last equal node -> i-1th
        Node lca = path1.get(i-1);
        return lca;
    }

    //find the lowest common ancestor approach 2 
    public static Node lca2(Node root, int n1, int n2){
        if (root == null) {
            return null;
        }
        
        if (root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftlca = lca2(root.left, n1, n2);
        Node rightlca = lca2(root.right, n1, n2);

        if (rightlca == null) {
            return leftlca;
        }
        if (leftlca == null) {
            return rightlca;
        }
        return root;

    }

    public static int lcaDist(Node root, int n){
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftdist = lcaDist(root.left, n);
        int rightdist = lcaDist(root.right, n);
        if (leftdist == -1 && rightdist == -1) {
            return -1;
        }else if (leftdist == -1) {
            return rightdist+1;
        }else {
            return leftdist+1;
        }

    }

    //find the minimum distance betwween two nodess 
    public static int minDist(Node root, int n1, int n2){
        Node lca = lca2(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);
        return dist1 + dist2;
    }

    public static void main(String[] args) {
         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);

        //  System.out.println(height(root));// 3 --- the tree is height of 3

        //  System.out.println(count(root));//7 --- there are 7 nodes in a tree

        //  System.out.println(sum(root));//28 ---the sum of the nodes is 28

        //  System.out.println(diameter(root));//5 diameter of this tree is 5

        //  int k = 2;
        //  Klevel(root, 1, k); // 2 3  because at level 2 there is only 2 nd 3 present there 

        //from the approach 1
        //  int n1 = 4, n2 = 5;
        //  System.out.println(lca(root, n1, n2).data); // 2 is lca of 4 and 5

        //from the approach 2
        //  int n1 = 4 , n2 = 7;
        //  System.out.println(lca2(root, n1, n2).data);//1 is lca of 4 nd 7

        int n1 = 4, n2 = 7;
        System.out.println(minDist(root, n1, n2));//4 is the min distance between 4 and 7


    }
}
//make seperated file for k level from this 
//also make different file for lowest common ancestor 
//also make different file for lowest common ancestor approach 2 
//also make different file for min distance between two nodes

