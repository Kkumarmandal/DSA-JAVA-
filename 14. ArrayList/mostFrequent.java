import java.util.ArrayList;
import java.util.Scanner;

public class mostFrequent {
    public static int maxFrequency (ArrayList <Integer> nums, int key){
        int [] count = new int[15];

        for (int i = 0; i < nums.size()-1; i++){
            if (nums.get(i) == key) {
                count[nums.get(i+1)]++;                
            }
        }  

        
        int maxValue = 0;
        int target = 0;
        for (int i = 0; i < count.length; i++){
            if (count[i] > maxValue) {
                target = i;
                maxValue = count[i];                
            }
        }
        System.out.println("MaxValue = " + maxValue);

        return target; 
        
    }

    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // int k = input.nextInt();
        // int n = input.nextInt();

        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(12);
        arr.add(1);
        arr.add(13);
        arr.add(5);
        arr.add(8);
        arr.add(1);
        arr.add(12);
        arr.add(1);
        arr.add(9);
        int k = 1;
        System.out.println(arr);


        // for (int i = 0; i < n; i++){
        //     int num = input.nextInt();
        //     arr.add(num);

        // }
        int ans = maxFrequency(arr, k);
        System.out.println(ans);
        
    }
}
