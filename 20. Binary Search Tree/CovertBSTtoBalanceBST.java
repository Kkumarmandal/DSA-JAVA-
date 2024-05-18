import java.util.*;

import org.w3c.dom.Node;

public class CovertBSTtoBalanceBST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node (int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    //Preorder
    public static void preorder (Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    //get Inorder Sequence
    public static void getInorder (Node root, ArrayList <Integer> inorder){
        if (root == null) {
            return;            
        }

        getInorder(root.left, inorder);

        inorder.add(root.data);

        getInorder(root.right, inorder);        
    }

    //create BST
    public static Node createBST (ArrayList <Integer> inorder, int st, int end){
        if (st > end) {
            return null;
        }
        //middle node
        int mid = (st + end) / 2;
        Node root = new Node(inorder.get(mid));
        //left subtree
        root.left = createBST(inorder, st, mid -1);
        //right subtree
        root.right = createBST(inorder, mid + 1, end);

        return root;
    }

    //Balance BST
    public static Node balanceBST (Node root){
        //Inorder Sequence
        ArrayList <Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        //Sorted inorder -> balaced BST
        root = createBST(inorder, 0, inorder.size() - 1);
        return root;
        
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root = balanceBST(root);
        preorder(root);
        
        
    }
}
