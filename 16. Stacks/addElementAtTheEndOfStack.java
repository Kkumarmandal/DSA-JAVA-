import java.util.*;

public class addElementAtTheEndOfStack {
    static Stack <Integer> stack;

    public static void pushAtBottom (int data){  // Iterative Approach Tc->O(N) sc-> O(n)
        Stack <Integer> newTempElement = new Stack<>();

        while (!stack.isEmpty()) {  // old data ko pull karo
            int temp = stack.pop();
            newTempElement.push(temp);                     
        }
        stack.push(data);   // empty hine ke baad new data ko push karo
        
        while (!newTempElement.isEmpty()) { // new data push karne ke baad old data ko push karo
            int temp = newTempElement.pop();
            stack.push(temp);            
        }
    }

    public static void printstack (){
        for (int i = 0; i< stack.size(); i++){
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }

    public static void pushAtBottomResursion (int data){    // Resussion Approach SC -> O(N) no space
        if (stack.isEmpty()) {  //if stack is empty toh new data ko push karo nahi toh old data ko pop kar and store into temp
            stack.push(data);           
        } else {
            int temp = stack.pop();
            pushAtBottomResursion(data);
            stack.push(temp);
        }
    }

    public static void main(String[] args) {
        stack = new Stack<>();

        for (int i = 1; i <= 5; i++){
            stack.push(i);
        }
        printstack();   //1 2 3 4 5 

        pushAtBottom(7);
        printstack();   //7 1 2 3 4 5
        pushAtBottomResursion(8);
        printstack();   //8 7 1 2 3 4 5
    }
}
