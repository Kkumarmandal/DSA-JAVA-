import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;



public class lonelyNumber {
    public static ArrayList<Integer> findLonely (ArrayList<Integer> nums){

        ArrayList <Integer> result = new ArrayList <Integer>();
        int n = nums.size();

        Collections.sort(nums);

        System.out.println("Sorted Array "+ nums);

        for (int i = 0; i< n; i++){
            if (i != 0 && (nums.get(i-1) == (nums.get(i)-1) || nums.get(i-1) == nums.get(i))) {
                continue;                
            }

            if (i != n-1 && (nums.get(i+1) == (nums.get(i)+1) || nums.get(i+1) == nums.get(i))) {
                continue;                
            }
            result.add(nums.get(i));
            
        }
        return result;
    }


    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        System.out.println("Size of an Array = " + n);

        ArrayList <Integer> arr = new ArrayList<Integer>();

        for (int i= 0; i<n; i++){
            int num = input.nextInt();
            arr.add(num);
        }


        ArrayList <Integer> ans = findLonely(arr);
        int ans_size = ans.size();
        for (int i=0; i< ans_size; i++){
            System.out.print(ans.get(i) + " ");
        }
    }
}
