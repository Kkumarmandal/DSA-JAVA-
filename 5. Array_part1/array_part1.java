import java.util.*;

public class array_part1 {
    public static void update (int marks []){
        for (int i = 0; i < marks.length; i++){
            marks[i]= marks[i] + 1; 
        }
    }
    // LINEAR SEARCH //
    public static int linearSearch (int numbers[], int key){
        for (int i = 0; i<numbers.length; i++){
            if (numbers[i] == key) {
                return i;               
            }          
        }
        return -1;
    }
    // LARGEST NUMBER //
    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i<numbers.length; i++){
            if (largest < numbers[i]){
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];               
            }
        }
        System.out.println("The smallest value: " + smallest);
        return largest;        
    }
    //  BINARY SAEARCH CODE //
    public static int binarySearch (int umBinSear[], int binKey){
        int start = 0 , end = umBinSear.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (umBinSear[mid] == binKey) {
                return mid;
            }
            if (umBinSear[mid] < binKey) {
                start = mid + 1;                
            } else {
                end = mid -1;
            }
            
        }
        return -1;
    }

    // REVRESE SEARCH //
    public static void reverse (int numbers[]){
        int first = 0 , last = numbers.length - 1;
        // SWAP //
        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            
            first ++;
            last --; 
        }
    }

    // PAIRS IN ARRAYS //
    public static void printPair (int numbers[]){
        int tp = 0;
        for (int i = 0; i < numbers.length; i++){
            int curr = numbers[i];
            for (int j = i+1; j < numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ") ");
                tp++;
            }
            System.out.println();            
        }
        System.out.println(" The Total no of pair = " + tp );
    }
    
    // PRINT SUBARRAYS //
    public static void printSubarrays (int numbers[]){
        int ts = 0; // Total array pair
        for (int i = 0; i < numbers.length; i++ ){
            int start = i;
            for (int j = i; j < numbers.length; j++){
                int end = j;
                for (int k = start; k <= end; k++){ // PRINT //
                    System.out.print( numbers[k] + " ");
                }
                ts ++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total no of Subarrays : " + ts);
    }

    // PRINT SUM  {Subarray} Brute force 
    public static void maxSubArray (int numbers[]){ //  Print Max Sum and Min Sum
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++){
            int start = i;
            for (int j = i; j < numbers.length; j++){
                int end = j;
                currSum = 0;
                for (int k = start; k <= end ; k++){
                    // Subarrya Sum //
                    currSum += numbers[k];
                }
                System.out.print(currSum + ", ");
                if (maxSum < currSum) {
                    maxSum = currSum;                    
                }
                if (minSum > currSum) {
                    minSum = currSum;                   
                } 
            }
        } 
        System.out.println();
        System.out.println("Max Sum = " + maxSum );
        System.out.println("Min Sum = " + minSum );
    }

    // PRINT SUBARRAY {PREFIX}
    public static void prefixValue (int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix []= new int[numbers.length];

        prefix [0] = numbers[0];
        // Calculate Prefix array
        for (int i = 1; i < numbers.length; i++){
            prefix[i] = prefix [i-1] + numbers[i];
        }

        for (int i = 0 ; i< numbers.length; i++){
            int start = i;
            for (int j = i; j < numbers.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix [end] - prefix [start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;                    
                }
            }
        }
        System.out.println();
        System.out.println("The max value : " + maxSum);
    }

    // KADANES ALGORITHM //
    public static void kadanes (int numbers []){
        int cs = 0;     //current sum
        int ms = Integer.MIN_VALUE;     // maximum sum

        for(int i = 0; i < numbers.length; i++){
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;                
            }
            ms = Math.max(cs, ms);
        }
        System.out.println(" Our max subarray sum is : " + ms);
    }

    // Trapping Rain-Water //  int height []= {4, 2, 0, 6, 3, 2, 5};
    public static int trappedrianWater (int height[]){
        int n = height.length;

        // Calculate left max boundary - array
        int leftMax[]= new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i <n; i++){
            leftMax[i]= Math.max(height[i], leftMax[i-1]);
        }

        // Calculate right max boundaty - array
        int rightMax[]= new int[n];
        rightMax[n-1]= height[n-1];
        for (int i = n-2; i >= 0; i--){
            rightMax[i]= Math.max(height[i], rightMax[i+1]);
        }

        int trappedwater = 0;
        // Loop 
        for (int i =0; i<n; i++){
            // waterlevel = min (left max Boundary , right max boundary) 
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = water level - height[i]
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;
    }

    // Buy and sell stock //  int prices []= {7, 1, 5, 3, 6, 4}
    public static int buyAndSellStock (int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++){
            if (buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }


    public static void main(String[] args) {
        //int marks [] = new int[50];

        Scanner sc  = new Scanner(System.in);
        
    // INPUT //
        /*marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2]= sc.nextInt();*/

    // OUTPUT //        
        /*System.out.println("phy: "+ marks[0]);
        System.out.println("chem: "+ marks[1]);
        System.out.println("math: "+ marks[2]);*/

    // UPDATE //
        /*marks[2]= marks[2] + 2;
        System.out.println("Update math: "+ marks[2]);*/

    // PERCENTAGE //
        /*int percentage = (marks[0] + marks [1] + marks [2])/3;
        System.out.println( "the percentage : " + percentage + "%");*/

    // LENGTH OF ARRAY //
        /*System.out.println("length of array = "+ marks.length);*/

        /*int marks [] = {97, 98, 99, 100, 101};
        update(marks);*/ // it will update the marks and it will become permanent //

    // Print our marks //
        /*for(int i = 0; i<marks.length; i++){
            System.out.print(marks[i]+ " "); // output will => be 98, 99, 100, 101, 102
        }
        System.out.println();*/

    // linear search //
        /*int numbers[]= {2, 4, 6, 8, 9, 10, 11, 12};
        int key = 11;
        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Not Found");            
        }else {
            System.out.println("Key is at index : " + index);
        }*/

    // LARGEST NUMBER //
        /*int numbers []={1, 2, 3, 4, 5, 6};
        System.out.println("The largest number : " + getlargest(numbers));*/

    // BINARY SEARCH //
        /*int numBinSear[]= {2, 4, 6, 8, 10, 12, 14, 20};
        int binKey = 21;
        System.out.println("Index for key is : " + binarySearch(numBinSear, binKey));*/

    // REVERSE SEARCH //
        /*int numbers []= {2, 4, 6, 8, 10};
        reverse(numbers);
           // PRINT 
        for (int i =0; i <numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();*/

    // PAIRS IN ARRAY //
        /*int numbers []= {2, 4, 6, 8, 10};
        printPair(numbers);*/

    // PRINT SUBARRAYS //
        /*int numbers []= {2, 4, 6, 8, 10,};
        printSubarrays(numbers);*/

    // PRINT MAX and MIN SubArrays
        /*int numbers []= {2, 4, 6, 8, 10};
        maxSubArray(numbers);*/

    // Print Max value in Prefix method
        /*int numbers []= {2, 4, 6, 8, 10};
        prefixValue(numbers);*/

    // KADANES NUMBER //
        /*int numbers []= {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);*/

    // Traping rainwater //
        /*int height []= {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedrianWater(height));*/
    // Buy and sell Stock //
        int prices []= {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStock(prices));
    







        sc.close();
    }

}
