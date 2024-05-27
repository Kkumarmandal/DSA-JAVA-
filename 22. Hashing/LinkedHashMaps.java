import java.util.*;
public class LinkedHashMaps {
    public static void main(String[] args) {
        LinkedHashMap <String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 100);
        lhm.put("Canada", 150);
        lhm.put("China", 150);
        lhm.put("Russia", 158);

        System.out.println(lhm); //{India=100, Canada=150, China=150, Russia=158} SORTED WAY
        
    }
}
