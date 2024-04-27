import java.util.*;

public class QueuesArrays {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue (int n){
            arr = new int[n];
            size = n;
            rear =-1;
        }

        // isEmpty
        public static boolean isEmpty (){
            return rear == -1;
        }

        // add O(1)
        public static void add (int data){
            if (rear == size-1) {
                System.out.println("Queue is full");
                return;                
            }
            rear = rear +1;
            arr[rear] = data;
        }

        // remove O(n)
        public static int remove (){
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;                
            }
            int front = arr[0]; // fixed hai front change nahi hoga
            //remove karne ke liye element ko shift karte hai
            for (int i =0; i< rear; i++){
                arr[i] = arr[i+1];
            }
            rear = rear -1;
            return front;
        }

        // Peek
        public static int peek (){
            if (isEmpty()) {
                System.out.println("Empty Queue");                
                return -1;
            }
            return arr[0];
        }
    }    

    
    
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();            
        }

        

        
        
    }
}
