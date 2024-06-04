import java.util.*;

public class StartWithProblem {
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

    //startWithProblem
    public static boolean startWith (String prefix){
        Node curr = root;

        for (int i = 0; i < prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String word [] = {"apple", "app", "mango", "man", "woman"};
        String prefix1 = "app";
        String prefix2 = "moon";
        
        for (int i = 0; i < word.length; i++){
            insert(word[i]);
        }
        System.out.println(startWith(prefix1)); // -> true
        System.out.println(startWith(prefix2)); // -> false
    }
}
