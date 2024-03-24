public class backtracking {
    // Change Arrays
    public static void changeArr (int arr [], int i, int val){
        // base case
        if (i == arr.length) {
            printArr(arr); // [1, 2, 3, 4, 5]
            return;            
        }

        // Resurssion
        arr[i]= val;
        changeArr(arr, i+1, val+1);
        arr[i]= arr[i] - 2;

    }
    // Print Arrays
    public static void printArr (int arr []){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Find Subsets
    public static void findSubsets (String str, String ans, int i){
        // base case
        if (i == str.length()) {
            System.out.println(ans);
            return;            
        }

        // Alternative method if to remove blankspace with null
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");                
            } else {
                System.out.println(ans);
            }
            return;
        }
        //Recurssion
        //Yes Choice
        findSubsets(str, ans+str.charAt(i), i+1);
        // No choice
        findSubsets(str, ans, i+1);
    }

    // Find Permutations
    public static void findPermutation (String str, String ans){
        // Base Case
        if (str.length() == 0) {
            System.out.println(ans);
            return;            
        }
        // recursion
        for (int i = 0; i < str.length(); i++){
            // current value ko store
            char curr = str.charAt(i);
            // remove
            //"abcde" = "ab" + "de" e is remove
            String newstr = str.substring(0, i) + str.substring(i+1);
            findPermutation(newstr, ans+curr);

        }
    }



   

    public static void main(String[] args) {
        /*int arr [] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr); // [-1, 0, 1, 2, 3]*/
        
        /*String str = "abc";
        findSubsets(str, "", 0);*/

        /*String str = "abc";
        findPermutation(str, "");*/

       


    }
    
}
