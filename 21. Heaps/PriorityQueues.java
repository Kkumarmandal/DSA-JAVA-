import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueues {

    public static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue<>(); // 1 3 4 7 

        //PriorityQueue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //7 4 3 1 

        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.remove();            
        }
        
    }
    
}
