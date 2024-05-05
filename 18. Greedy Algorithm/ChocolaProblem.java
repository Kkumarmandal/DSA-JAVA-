import java.util.*;

public class ChocolaProblem {
    public static void main(String[] args) {
        int n = 4 , m = 6;
        Integer costVer [] = {2, 1, 3, 1, 4};
        Integer costHor [] = {4, 1, 2};

        //SORT Decending
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0;

        int hp = 1, vp = 1;
        int cost = 0;

        while (v < costHor.length && v < costVer.length) {
            if (costVer[v] <= costHor[h]) { // Horizontal Cuts
                cost += (costHor[h] * vp);
                hp++;
                h++;                
            }else { // Vertical cut
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
            
        }

        // Remaining Element
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;            
        }
        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;            
        }
        System.out.println("Minimum cost of cuts = " + cost);

    }
}
