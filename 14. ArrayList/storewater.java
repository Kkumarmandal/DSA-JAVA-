import java.util.*;

//Brute Force Approach
public class storewater {
    /*public static int storewaterContainer (ArrayList <Integer> height){
        // Global variable
        int maxWater = 0;

        //brute force
        for (int i = 0; i < height.size(); i++){
            for (int j = i+1; j < height.size(); j++){
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;

                int currentWater = ht * width;

                maxWater = Math.max(maxWater, currentWater);
                
            }
        }
        return maxWater;


    }*/

// Two point Approach
    public static int storewaterTwoPinter (ArrayList <Integer> height ){
        int maxwater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while (lp < rp) {
            // Calculate water area

            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currentwater = ht * width;
            maxwater = Math.max(maxwater, currentwater);

            // Update

            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else{
                rp--;
            }
            
        }
        return maxwater;
    }

    
    
    public static void main(String[] args) {
        ArrayList <Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        //System.out.println(storewaterContainer(height));

        System.out.println(storewaterTwoPinter(height));
        
        


    }
}
