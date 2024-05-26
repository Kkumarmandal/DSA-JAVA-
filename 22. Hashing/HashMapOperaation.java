import java.util.*;

public class HashMapOperaation {
    public static void main(String[] args) {
        HashMap <String, Integer> hm = new HashMap<>();

        //Insert -> O(1) -> undifine Order follow
        hm.put("India", 150);
        hm.put("China", 100);
        hm.put("Us", 50);

        //Print
        System.out.println(hm);

        //GET -> O(1)
        int population = hm.get("China"); //-> 100
        System.out.println(population);

        System.out.println(hm.get("Indonesia")); //-> null

        // containsKey -> True or False 
        System.out.println(hm.containsKey("India")); //-> true

        System.out.println(hm.containsKey("Indonesia")); //-> false

        //Remove -> O(1) 
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        // Size
        System.out.println("Size "+hm.size()); //Size 2

        //isEmpty
        System.out.println("isEmpty = " + hm.isEmpty()); //isEmpty = false

        //clear
        hm.clear();
        System.out.println("isEmpty = " + hm.isEmpty()); //isEmpty = true


        
    }
}
