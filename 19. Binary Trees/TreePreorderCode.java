import java.util.*;

public class TreePreorderCode {
    static class Node {
        int data;
        Node left;  //LeftSubString
        Node right; //RightSubString

        //Constructor
        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree (int nodes []){
            idx ++;
            if (nodes[idx] == -1) {
                return null;               
            }

            Node newNode = new Node(nodes [idx]);
            newNode.left = buildTree(nodes);    //leftSubstring
            newNode.right = buildTree(nodes);   //rightSubstring

            return newNode;
        }

        
        // Preorder Traversal
        public static void preOrder (Node root){
            if (root == null) {
                return;            
            }
    
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        //Inorder Traversal
        public static void inOrder (Node root){
            if (root == null) {
                return;                
            }

            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        //PostOrder Traversal
        public static void postOrder (Node root){
            if (root == null) {
                return;                
            }

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        //Level Order 
        public static void levelOrder (Node root){
            if (root == null) {
                return;                
            }

            Queue <Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;                        
                    }else {
                        q.add(null);
                    }                    
                }else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);                        
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);                        
                    }
                }
                
            }
        }
    }
    public static void main(String[] args) {
        int nodes [] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);
        System.out.println(root.data);    //1

        Node root = tree.buildTree(nodes);
        tree.preOrder(root);    // 124536

        Node root = tree.buildTree(nodes);
        tree.inOrder(root);    //425136

        Node root = tree.buildTree(nodes);
        tree.postOrder(root);    //4 5 2 6 3 1 

        Node root = tree.buildTree(nodes);    //1
        tree.levelOrder(root);                //2 3
                                              // 4 5 6
        
    }
}
