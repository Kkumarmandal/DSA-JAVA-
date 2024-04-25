import java.util.*;

public class validParentheses {
    public static boolean isValid (String str){
        Stack <Character> s = new Stack<>();

        for (int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);

            // Opening
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);                
            }else {
                //Closing
                if (s.isEmpty()) {
                    return false;                    
                }
                if ((s.peek() == '(' && ch == ')') 
                    || (s.peek() == '{' && ch == '}')
                    || (s.peek() == '[' && ch == ']')) {
                        s.pop();                    
                } else {
                    return false;
                }
            }

        }
        if (s.isEmpty()) { // stack me char element hai toh valid nahi hai because opening and closing ke pop() ho jata hai
            return true;   //.pop hone ke baad stack me element raha toh extra opening ya closing parenthesis hai return false 
        } else {
            return false;
        }
    }

    
    public static void main(String[] args) {
        String str = "({})[]";
        System.out.println(isValid(str));
        
    }
}
