import java.util.*;

public class nextGreaterElement {

    
    public static void main(String[] args) {
        int arr [] = {6, 8, 0, 1, 3};
        Stack <Integer> s = new Stack<>();

        int nxtGreater [] = new int[arr.length]; // array
        
        for(int i = arr.length-1; i>=0; i--){   // backward loop arr.length = 5 and i = 5-1->4 , i=4 me 3 element hai
            // 1)While      jab tak stack empty nahi ho jata ya chota element ahat nahi jata
            while (!s.empty() && arr[s.peek()] <= arr[i]) { // s.peek me index hai and with help of arr[] fid element
                s.pop();                
            }

            // 2) if-else //if stack is full empty
            if (s.isEmpty()) {
                nxtGreater[i] = -1;               
            }else{
                nxtGreater[i] = arr[s.peek()]; //s.peek me index hai we want element so arr[s.peek()] -> we find index
            }

            //3) push in
            s.push(i); // stack me index ko push kar raha hu
        }
        for (int i = 0; i<nxtGreater.length; i++){
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();        
    }
}
