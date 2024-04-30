import java.util.*;

public class QueueUsingDeque {
    static class Queue {
        Deque <Integer> deqeue = new LinkedList<>();
        
        //Add
        public void add(int data){
            deqeue.addLast(data);
        }

        //remove
        public int remove(){
            return deqeue.removeFirst();
        }

        //Peek
        public int peek(){
            return deqeue.getFirst();
        }
        
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Peek = " + q.peek());

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
