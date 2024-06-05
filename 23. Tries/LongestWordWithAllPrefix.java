import java.util.*;

public class LongestWordWithAllPrefix {
    static class Node {
        Node children [] = new Node[26];
        boolean eow = false;

       public Node (){
            for (int i= 0; i < 26; i++){
                children [i] = null;
            }
        }
    }
    public static Node root = new Node();

    // Insert in tries
    public static void insert (String word){
        Node curr = root;
        for (int level = 0; level < word.length(); level++){
            int idx = word.charAt(level)-'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    /*public static void insert (String words){
        int level = 0;
        int len = words.length();
        int idx = 0;

        Node curr = root;
        // level wise iterate
        for (; level < len; level++){
            idx = words.charAt(level) - 'a'; // idx milega isse
            if (curr.children [idx] == null) {
                curr.children [idx] = new Node(); 
            }

            curr = curr.children [idx];
        }
        curr.eow = true; // bydefault false 
    }*/

    // search in tries
    public static boolean search (String key){
        int level = 0;
        int len = key.length();
        int idx = 0;

        Node curr = root;
        //levelwise iterate
        for (; level < len; level++){
            idx = key.charAt(level) - 'a';

            if (curr.children [idx] == null) {
                return false;
            }
            curr = curr.children [idx];
        }
        return curr.eow == true;
    }

    //Longest Word with all prefix
    public static String answer ="";

    public static void longestWord (Node root, StringBuilder temp){
        //base case
        if (root == null) {
            return;
        }

        for (int i = 0; i < 26; i++){ //i -> level
            if (root.children[i] != null && root.children[i].eow == true) {
                char ch = (char)(i+'a');
                temp.append(ch);

                if (temp.length() > answer.length()) {
                    answer = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);  //backtrack
            }
        }
    }
    public static void main(String[] args) {
        String words [] = {"a", "banana", "app", "appl", "apple", "apply"};
        
        for (int j = 0; j < words.length; j++){
            insert(words[j]);
        }

        longestWord(root, new StringBuilder(""));
        System.out.println(answer);
    }
}
