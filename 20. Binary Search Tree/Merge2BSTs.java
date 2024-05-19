import java.util.*;

public class Merge2BSTs {
    static class Node {
        int data;
        Node left;
        Node right;

        //constructor
        public Node (int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    //create BST
    public static Node createBST (ArrayList <Integer> arr, int si, int end){
        //base case
        if (si > end) {
            return null;
        }

        int mid = (si + end) / 2;

        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, si, mid-1);
        root.right = createBST(arr, mid + 1, end);
        return root;
    }

    //getInorder
    public static void getInorder (Node root, ArrayList<Integer> arr){
        //base case
        if (root == null) {
            return;
        }

        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    //merge BSTs
    public static Node mergeBST (Node root1, Node root2){
        //step 1
        ArrayList <Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);
        //step 2
        ArrayList <Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);
        //step 3 merge 
        int i = 0, j = 0;
        ArrayList <Integer> finalArr = new ArrayList<>();

        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                finalArr.add(arr1.get(i));
                i++;                
            }else {
                finalArr.add(arr2.get(j));
                j++;
            }            
        }
        //remaining value
        while (i < arr1.size()) {
            finalArr.add(arr1.get(i));            
            i++;
        }

        while (j < arr2.size()) {
            finalArr.add(arr2.get(j));
            j++;
        }

        //step 4 SORTED AL -> balanced BST
        return createBST(finalArr, 0, finalArr.size()-1);
    }

    // preorder
    public static void preorder (Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBST(root1, root2);
        preorder(root); // 3 1 2 9 4 12 
        
        
    }
}
