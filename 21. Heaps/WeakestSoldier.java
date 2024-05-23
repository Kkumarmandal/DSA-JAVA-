import java.util.*;

public class WeakestSoldier {
    static class Row implements Comparable <Row> {
        int SoldierCount;
        int idx;

        public Row (int SoldierCount, int idx){
            this.SoldierCount = SoldierCount;
            this.idx = idx;
        }

        @Override
        public int compareTo (Row r2){
            if (this.SoldierCount == r2.SoldierCount) {
                return this.idx - r2.idx; // idx se compare karo
            }else {
                return this.SoldierCount - r2.SoldierCount; // nahi toh jitna soldier se count karo
            }
        }
    }
    public static void main(String[] args) {
        int army [] [] = {{1, 0, 0, 0 },
                          {1, 1, 1, 1},
                          {1, 0, 0, 0},
                          {1, 0, 0, 0}};
        int k = 2;

        PriorityQueue <Row> pq = new PriorityQueue<>();

        for (int i = 0; i < army.length; i++){
            // row ke liye soldier ko count kar leta hu
            int count = 0;
            for (int j = 0; j < army[0].length; j++){
                count += army[i][j] == 1 ? 1 : 0 ;
            }
            pq.add(new Row(count, i));
        }
        //k weakest print
        for (int i = 0; i < k; i++){
            System.out.println("R" + pq.remove().idx);
        }
        
    }
}
