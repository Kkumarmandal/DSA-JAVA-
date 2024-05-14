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

    public static void main(String[] args) {
        int values [] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        

        for (int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

    }
}
