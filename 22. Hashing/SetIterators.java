import java.util.*;

public class SetIterators {
    public static void main(String[] args) {
        HashSet <String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        Iterator it = cities.iterator();

        while (it.hasNext()) {
            System.out.println(it.next()); 
            /*
                Delhi
                Bengaluru
                Noida
                Mumbai
             */
        }   
        System.out.println();
        
        //Advance ForEach Loop

        for (String city : cities) {
            System.out.println(city);
        }

        /*
            Delhi
            Bengaluru
            Noida
            Mumbai
         */
    }
}
