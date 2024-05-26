import java.util.*;

public class IterationOnHashMaps {
    public static void main(String[] args) {
        HashMap <String, Integer> hm = new HashMap<>();

        hm.put("India", 50);
        hm.put("China", 100);
        hm.put("USA", 20);
        hm.put("Nepal", 5);

        //iterative
        Set <String> keys = hm.keySet();
        System.out.println(keys); //[USA, China, Nepal, India]

        for (String k : keys) {
            System.out.println("Key = " +k+ ", value = " +hm.get(k));
        }
        /*
            Key = USA, value = 20
            Key = China, value = 100
            Key = Nepal, value = 5
            Key = India, value = 50
         */

        
    }
}
