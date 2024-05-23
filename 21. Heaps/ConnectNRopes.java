import java.util.*;

public class ConnectNRopes {
    public static void main(String[] args) {
        int ropes [] = {2, 3, 3, 4, 6};

        PriorityQueue <Integer> pq = new PriorityQueue<>();
        //add element into the pq
        for (int i = 0; i < ropes.length; i++){
            pq.add(ropes[i]);
        }

        int cost = 0;
        //jab tak pq me single elment nahi rehta hai 
        //tab tak ropes ko combine karke fir add to ropes array
        //and cost ko update

        while (pq.size() > 1) {
            int min1 = pq.remove();
            int min2 = pq.remove();

            cost += min1 + min2;
            pq.add(min1 + min2);
        }
        System.out.println("cost of connecting n ropes = " + cost);

        
    }
}
