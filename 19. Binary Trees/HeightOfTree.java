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

    // Diameter of Node Approach 2
    static class Info {
        int diam;
        int ht;

        public Info (int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter2 (Node root){
        //base case
        if (root == null) {
            return new Info(0, 0);            
        }

        //left Info
        Info leftInfo = diameter2(root.left);
        //right Info
        Info rightInfo = diameter2(root.right);
        // Self Info
        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);

        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

        // SubTree of another Tree

    public static boolean isIndentical (Node node, Node subroot){
        if (node == null && subroot == null) {
            return true;            
        }else if (node == null || subroot == null || node.data != subroot.data) {
            return false;            
        }

        if (! isIndentical(node.left, subroot.left)) {
            return false;            
        }
        if (! isIndentical(node.right, subroot.right)) {
            return false;            
        }
        return true;
    }

    public static boolean isSubtree (Node root, Node subroot){
        // Base Case
        if (root == null) {
            return false;            
        }

        if (root.data == subroot.data) {
            if (isIndentical (root, subroot)) {
                return true;                
            }            
        }

        return isSubtree(root.left,subroot) || isSubtree(root.right, subroot);
    }

     // Kth Level
    public static void kLevel (Node root, int level, int k){
        if (root == null) {
            return;            
        }

        if (level == k) {
            System.out.print(root.data + " ");
            return;            
        }

        kLevel(root.left, level + 1, k); // Left SubTree
        kLevel(root.right , level + 1, k); // Right SubTee
    }

    // Lowest Common Ancestor -> Apporach 1

    public static boolean getPath (Node root, int n, ArrayList <Node> path){
        //base case
        if (root == null) {
            return false;            
        }

        path.add(root);
        //compare with root
        if (root.data == n) {
            return true;            
        }
        //Compare with subtree
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if (foundLeft || foundRight) {
            return true;            
        }

        //If left Subtree nahi mila and right subtree me nahi mila change the root
        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca (Node root, int n1, int n2){
        //Path Find Out
        ArrayList <Node> path1 = new ArrayList<>();
        ArrayList <Node> path2 = new ArrayList<>();

        getPath (root, n1, path1);
        getPath (root, n2, path2);

        //Last Common Ancestor
        int i =0;
        for (; i < path1.size() && i < path2.size(); i++){
            if (path1.get(i) != path2.get(i)) {
                break;                
            }
        }
        //Last equal node -> i-1
        Node lca = path1.get(i - 1);
        return lca;
    }

    //Last Common Ancestor -> Aproach 2
    public static Node lca2 (Node root, int n1, int n2){
        if (root == null) {
            return null;            
        }
        //compare with root
        if (root.data == n1 || root.data == n2) {
            return root;            
        }
        //compare with left Subtree
        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        //LeftLca = valid   rightLca = null
        if (rightLca == null) {
            return leftLca;            
        }
        //LeftLca = null    rightLca = valid
        if (leftLca == null) {
            return rightLca;            
        }
        //ek subtree me n1 hai and dusara me n2 hai
        return root;
    }

    // Minimum distance between two nodes
    public static int lcaDist (Node root, int n){
        //Base Case
        if (root == null) {
            return -1;            
        }

        if (root.data == n) {
            return 0;            
        }
        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if (leftDist == -1 && rightDist == -1) {
            return -1;            
        } else if (leftDist == -1) {
            return rightDist+1;            
        } else {
            return leftDist+1;
        }
    }

    public static int minDist (Node root, int n1, int n2){
        Node lca = lca2(root, n1, n2);
        int  dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);

        return dist1 + dist2;
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

         System.out.println(diameter2(root).diam);    //5
         System.out.println(diameter2(root).ht);    //3    

               // New node
            /*
                  2
                /  \
               4    5
             */
            Node subroot = new Node(2);
            subroot.left = new Node(4);
            subroot.right = new Node(5);

            System.out.println(isSubtree(root, subroot));
    
            int k = 3;
            kLevel(root, 1, k);

        //Last common Ancestor  -> Apporach 1
            int n1 = 4 , n2 = 6;
            System.out.println("Last common Ancestor " + lca(root, n1, n2).data); // 1

        // Last common Ancestor -> Approach 2
            int n1 = 5, n2 = 7;
            System.out.println("Last common Ancestor " + lca2(root, n1, n2).data); // 1

        // Min Dist Between two node
            int n1 = 4, n2 = 6;
            System.out.println(minDist(root, n1, n2)); // 4
    }
}
