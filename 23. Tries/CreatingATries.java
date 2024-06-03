import java.util.*;

public class CreatingATries {
    static class Node {
        Node children [] = new Node[26];
        boolean eow = false;

        Node (){
            for (int i= 0; i < 26; i++){
                children [i] = null;
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

     // search in tries
    public static boolean search (String key){
        Node curr = root;
        //levelwise iterate
        for (int level = 0; level < key.length(); level++){
            int idx = key.charAt(level) - 'a';

            if (curr.children [idx] == null) {
                return false;
            }
            curr = curr.children [idx];
        }
        return curr.eow == true;
    }

    public static void main(String[] args) {
        String words [] = {"the" , "there", "their", "any", "three", "a"};

        // INSERT
        for (int i = 0; i < words.length; i++){
            insert(words[i]);
        }

        //SEARCH
        System.out.println(search("there")); //true
        System.out.println(search("thee")); // false
        
    }
}
