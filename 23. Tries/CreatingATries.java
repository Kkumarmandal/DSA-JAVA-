import java.util.*;

public class CreatingATries {
    static class Node {
        Node children [] = new Node[26];
        boolean eow = false;

        Node (){
            for (int i= 0; i < 26; i++){
                children [] = null;
            }
        }
    }
    public static Node root = new Node();
    // Insert in tries
    public static void insert (String words){
        Node curr = root;
        // level wise iterate
        for (int level = 0; level < words.length(); level++){
            int idx = words.charAt(level) - 'a'; // idx milega isse

            if (curr.children [idx] == null) {
                curr.children [idx] = new Node();
            }
            curr = curr.children [idx];
        }
        curr.eow = true; // bydefault false 
    }
    public static void main(String[] args) {
        String words [] = {"the" , "there", "their", "any", "three", "a"};

        // INSERT
        for (int i = 0; i < words.length; i++){
            insert(words[i]);
        }
        
    }
}
