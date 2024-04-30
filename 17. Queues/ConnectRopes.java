import java.util.*;

public class ConnectRopes {
    public static int connectingRopes (int arr []){
        int profit = 0;
        PriorityQueue <Integer> pq = new PriorityQueue<>();

        for (int i=0; i < arr.length; i++){
            pq.add(arr[i]);
        }

        while (pq.size() >= 2) {
            int p1 = pq.poll();
            int p2 = pq.poll();

            int p = p1 + p2;
            pq.add(p);
            profit = profit + p;           
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr1 [] = {4, 3, 2, 6};
        int ans1 = connectingRopes(arr1);
        System.out.println(ans1);

    }
}
