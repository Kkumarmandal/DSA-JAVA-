import java.util.*;

public class duplicateParenthesis {
    public static boolean isDuplicate (String str){
        Stack <Character> s = new Stack<>();

        for (int i =0; i< str.length(); i++){
            char ch = str.charAt(i);

            //Closing ko checking
            if (ch == ')') {
                int count = 0;
                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop(); //item ko pop
                    count++;    // count lena hai                 
                }
                if (count < 1) {
                    return true; //duplicate is exist           
                }else {
                    s.pop(); //opening pair is exist toh .pop()
                }
                
            } else {
                //opening pair ko push kar do
                s.push(ch);
            }
        }
        return false;
    }


    public static void main(String[] args) {
        String str = "((a+b))"; // true
        String str2 = "(a-b)"; // false
        System.out.println("Duplicate parenthesis = " + isDuplicate(str));
        System.out.println("Duplicate Parenthesis = " + isDuplicate(str2));


        
    }
}
