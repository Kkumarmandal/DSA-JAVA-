public class BuiltBTS {
    static class Node {
        int data;
        Node left;
        Node right;

        //constructor
        Node (int data){
            this.data = data;
            // bydefault left subtee and right subtree null hai
        }
    }

    //Built BTS
    public static Node insert (Node root, int val){
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            //Insert left subtree
            root.left = insert(root.left, val);
        }else {
            // insert right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Inorder traversal
    public static void inorder (Node root){
        //base case
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //Search 
    public static boolean search (Node root, int key){
        if (root == null) {
            return false;
        }
        //root == key
        if (root.data == key) {
            return true;
        }
        //left subtree
        if (root.data > key) {
            return search(root.left, key);
        } else {
            //right subtree
            return search(root.right, key);
        }
    }

    //delete
    public static Node delete (Node root, int val){
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            //voila
            //case 1 -> leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            //case 2 -> single child
            if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }
            //case 3 -> both children
            Node IS = FindInorderSucccessor (root.right);

            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node FindInorderSucccessor (Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Print in range
    public static void printInRange (Node root, int k1, int k2){
        //base case
        if (root == null) {
            return;
        }

        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");

            printInRange(root.right, k1, k2);
            

        }else if (root.data < k1) {
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }
    }

    //Root to leaf path
    public static void printInPath (ArrayList <Integer> path){
        for (int i = 0; i< path.size(); i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }

    public static void printRoot2Leaf (Node root, ArrayList <Integer> path){
        if (root == null) {
            return;
        }

        path.add(root.data);
        if (root.left == null && root.right == null){
            printInPath (path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);

        //remove
        path.remove (path.size () - 1);
    }
    //Validate BST
    public static boolean isValidBST (Node root, Node min,Node max){
        if (root == null) {
            return true;
        }
        
        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }

        return isValidBST(root.left, min, max) && isValidBST(root.right, min, max);

    }


    public static void main(String[] args) {
        int values [] = {5, 1, 3, 4, 2, 7};
        int values [] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        

        for (int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        if (search(root, 6)) {
            System.out.println("Found");            
        } else {
            System.out.println("Not found");
        }

        //delete node
        inorder(root);
        System.out.println(); //1 3 4 5 6 8 10 11 14

        root = delete(root, 1);
        System.out.println(); //3 4 5 6 8 10 11 14

        inorder(root);

         //Priny in range
        printInRange(root, 5, 12); //5 6 8 10 11

        //Root to leaf Path
        printRoot2Leaf(root, new ArrayList<>());
        /*
        8->5->3->1->Null
        8->5->3->4->Null
        8->5->6->Null
        8->10->11->14->Null
        */

        //Validate BST
        if (isValidBST(root, null, null)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }

    


    }
}
