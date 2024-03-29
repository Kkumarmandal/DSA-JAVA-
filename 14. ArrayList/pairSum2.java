import java.util.*;


public class pairSum2 {
    public static boolean rotatedSum (ArrayList <Integer> list, int target){
        // Global Varaible
        int bp = -1; //-> breaking point
        int n = list.size();

        for (int i =0; i < list.size(); i++){
            if (list.get(i) > list.get(i+1)) {
                bp = i;
                break;                
            }
        }

        int lp = bp+1;  //-> smallest
        int rp = bp;    //-> largest

        while (lp != rp) {
            // case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;                
            }
            //case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp +1) % n;                
            } else {
                // case 3
                rp = (n + rp -1) % n;
            }
            
        }
        return false;
        
    }


    public static void main(String[] args) {
        // 11, 15, 6, 8, 9, 10; sorted and roated Array
        
        ArrayList <Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(rotatedSum(list, target));


        
    }
}
