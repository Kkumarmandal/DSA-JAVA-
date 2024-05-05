import java.util.*;

public class MinAbsoluteDifferencePair {
    public static void main(String[] args) {
        //int a [] = {1, 2, 3};
        int a [] = {1, 4, 7, 8};
        //int b [] = {2, 1, 3};
        int b [] = {2, 3, 5, 6};

        //Sorting
        Arrays.sort(a);
        Arrays.sort(b);

        int minDiff = 0; //intilize Minimum Difference with 0

        for (int i = 0; i < a.length; i++){
            minDiff += Math.abs(a[i] - b[i]);

        }
        System.out.println("Minimum Absolute Difference of pairs =  " + minDiff);        
    }
}
