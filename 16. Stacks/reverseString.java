import java.util.*;

public class reverseString {
    public static String reverseString (String str){ //str = "abc"
        Stack <Character> s = new Stack<>();
        int idx = 0; 

        while (idx < str.length()) {
            s.push(str.charAt(idx)); // Stack me push kar dege
            idx++;            
        }

        StringBuilder result = new StringBuilder(""); //intilize with empty 
        while (!s.isEmpty()) {
            char curr = s.pop(); // character ko bahar nikalna 
            result.append(curr); // result pe store kar dege         
        }
        return result.toString(); // string builder ka datatype alag rehta hai toh .tostring        

    }

    public static void main(String[] args) {
        String str = "abcd";
        System.out.println( "String = " + str);

        String result = reverseString(str);
        System.out.println("Reverse String = " + result); //"dcba"
        
    }
}
