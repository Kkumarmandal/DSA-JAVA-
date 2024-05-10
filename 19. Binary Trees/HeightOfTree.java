import java.util.*;

public class HeightOfTree {
    static class Node {
        int data;
        Node left, right;

        public Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    public static int height (Node root){
        if (root == null) {
            return 0;            
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    // Count of Nodes
    public static int count (Node root){
        if (root == null) {
            return 0;            
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return (leftCount + rightCount) +1;
    }

    // Sum of Node
    public static int sumOfNode (Node root){
        if (root == null) {
            return 0;            
        }
        int leftSum = sumOfNode(root.left);
        int rightSum = sumOfNode(root.right);
        return leftSum + rightSum + root.data;
    }

    // Diameter of Root Approach 1
    public static int diameter (Node root){
        //base case
        if (root == null) {
            return 0;            
        }

        //calulate left diameter, left height
        int leftDiam = diameter(root.left);
        int leftHt = height(root.left);

        //Calate right diameter, right height
        int rightDiam = diameter(root.right);
        int rightHt = height(root.right);

        int selffDiam = leftHt + rightHt + 1;

        //Comparing
        return Math.max(selffDiam, Math.max(leftDiam, rightDiam));
    }
    
    public static void main(String[] args) {

        /*
               1
            /     \
           2       3
           / \    / \
          4   5   6  7 
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height of Node = " + height(root));    //3

        System.out.println("Count Of Node = " + count(root));    //7

        System.out.println("Sum of Node = " + sumOfNode(root));    //28

         System.out.println("Diameter of node = " + diameter(root));    //5
        
    }
}
