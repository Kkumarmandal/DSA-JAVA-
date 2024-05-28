import java.util.*;

public class HashSets {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(2);
        set.add(4);

        System.out.println(set); //[1, 2, 4] unique value

        set.remove(2);

        System.out.println(set); //[1, 4]  2 is removed

        if (set.contains(2)) {
            System.out.println("Set contains 2");
        }
        if (set.contains(5)) {
            System.out.println("set contains 5");
        }

        System.out.println(set.size());
        set.clear();
        System.out.println(set);
        
        System.out.println(set.isEmpty());
    }
}
