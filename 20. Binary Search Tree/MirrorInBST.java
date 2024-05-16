import java.util.*;

import org.w3c.dom.Node;




public class MirrorInBST {
    
        static class Node {
            int data;
            Node left;
            Node right;

            //Construstor
            public Node (int data){
                this.data = data;
                this.left = this.right = null;
            }
        }

        public static Node createMirror(Node root){
            //empty
            if (root == null) {
                return null;
            }

            Node leftMirror = createMirror(root.left);

            Node rightMirror = createMirror(root.right);

            root.left = rightMirror;
            root.right = leftMirror;

            return root;

        }

        //Preorder Sequence
        public static void preorder (Node root){
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }  
    

    public static void main(String[] args) {
        //Mirror a BST
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        root = createMirror(root);
        preorder(root);
        
    }
}
