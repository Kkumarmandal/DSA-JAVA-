import java.util.*;

public class TreeMaps {
    public static void main(String[] args) {
        TreeMap <String, Integer> tm = new TreeMap<>();

        tm.put("India", 100);
        tm.put("Afghanistan", 99);
        tm.put("Canada", 450);
        tm.put("Us", 180);
        
        HashMap <String, Integer> hm = new HashMap<>();
        
        hm.put("India", 100);
        hm.put("Afghaistan", 99);
        hm.put("Canada", 450);
        hm.put("Us", 180);

        System.out.println( "Hashmap = " + hm); // Hashmap = {Canada=450, Afghaistan=99, Us=180, India=100}
        System.out.println("TreeMap = " + tm); // TreeMap = {Afghanistan=99, Canada=450, India=100, Us=180}
        
    }
}
