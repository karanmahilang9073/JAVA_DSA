package bst;

import java.util.ArrayList;

public class Bst {//time complexity of BST is -- O(h)
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
        this.data = data;
    }
    }

    public static Node insert(Node root, int val){
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            //insert in left subtree
            root.left = insert(root.left, val);
        }else{
            //insert inn right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root, int key){ //time complexity --O(H)
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val){
        if (root.data < val) {
            root.right = delete(root.right, val);
        }else if (root.data > val) {
            root.left = delete(root.left, val);
        }else{
            //case--1--leaf node
            if (root.left==null && root.right==null) {
                return null;
            }
            //case --2--single child
            if (root.left == null) {
                return root.right;
            }else if (root.right == null) {
                return root.left;
            }
            //case--3--both children
            Node IS  = FindInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node FindInorderSuccessor(Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printrange(Node root, int k1, int k2){
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printrange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printrange(root.right, k1, k2);
        }else  if (root.data < k1) {
            printrange(root.right, k1, k2);
        }else {
            printrange(root.left, k1, k2);
        }
    }

    public static void printpath(ArrayList<Integer> path){
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }

    public static void printRoot2leaf(Node root, ArrayList<Integer> path){
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left ==null && root.right ==null) {
            printpath(path);
        }
        printRoot2leaf(root.left, path);
        printRoot2leaf(root.right, path);
        path.remove(path.size()-1);
    }

    public static boolean isValidBST(Node root,Node min, Node max ){
        if (root == null ) {
            return true;
        }
        if (min != null && root.data <=  min.data) {
            return false;
        }
        if (max != null && root.data >= max.data) {
            return false; 
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);//1 2 3 4 5 7  BST works fine
        System.out.println();

        // if (search(root, 1)) { //target element found
        //     System.out.println("target element found");
        // }else {
        //     System.out.println("not found");
        // }

        // root = delete(root, 1);
        // System.out.println();
        // inorder(root);//2 3 4 5 7 ---1 is deleted

        // printrange(root, 2, 5); //2 3 4 5

        // printRoot2leaf(root, new ArrayList<>());//printed all the paths from roots to leaf

        if (isValidBST(root, null, null)) {//valid tree
            System.out.println("valid tree");
        }else{
            System.out.println("invalid tree");
        }
    }
}
