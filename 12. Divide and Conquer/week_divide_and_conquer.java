

public class week_divide_and_conquer {
    public static void mergeSort (String arr[], int left, int right){
        // Base case
        if (left >= right) {
            return;            
        }

        //middle elment
        int mid = left + (right - left) /2;

        mergeSort(arr, left, mid); // Left side
        mergeSort(arr, mid+1, right); // Right side

        merge(arr, left, mid, right);      
    }
    public static void merge (String arr[], int left, int mid, int right){
       int p1 = left , p2 = mid +1, p3 = 0 ;
       String res [] = new String[right - left +1];
       
        while (p1 <= mid && p2 <= right) {
            if (arr[p1].compareTo(arr[p2]) <= 0) {
                res[p3] = arr[p1];      
                p1++; p3 ++;      
            } else {
                res[p3] = arr[p2];
                p2++; p3++;
            }
        
        }
        while (p1 <= mid) {
            res[p3] = arr[p1];
            p1++; p3++;            
        }

        while (p2 <= right) {
            res[p3] = arr[p2];
            p2++; p1++;            
        }

        for (int idx= 0; idx < res.length; idx++){
            arr[idx + left]= res[idx];
        }

    }

    // Majority Element
    public static int majorityElement (int [] nums){
        int winner = nums[0], lead =1;

        for(int indx = 1; indx < nums.length; indx++){
            if (nums[indx] == winner) {
                lead++;                
            } else if (lead > 0){
                lead--;
            } else {
                winner = nums[indx];
                lead = 1;
            }
        }
        return winner;
    }

    // Print SubString
    public static void printSubstrings (String str, int st){
        // base case
        if (st == str.length()) {
            return;            
        }

        //Kaam
        StringBuilder sb = new StringBuilder();
        for (int end = st ; end < str.length(); end++){
            sb.append(str.charAt(end));
            System.out.print(sb + " ");
        }
        printSubstrings(str, st+1);
    }

    // Quick Sort
    public static void quickSort (int nums[], int left, int right){
        if (left >= right){
            return;
        }
        int pivot = partision (nums, left, right);
        quickSort(nums, left, pivot -1);
        quickSort(nums, pivot+1, right);
    }

    public static int partision (int nums[], int left, int right){
        // < j indices -> <= pivot
        // >= j indices -> > pivot

        // ramdom quick Sort
        int random =  (int)(Math.random() * (right - left +1)) + left;
        swap(nums, random, right);

        int pivot = nums[right];
        int j = left;
        for (int i = left; i <= right; i++){
            if (nums[i] <= pivot) {
                swap(nums, i, j);
                j++;                                
            }
        }
        return (j - 1);
    }
    public static void swap (int [] nums, int i, int j){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
    public static void printArr (int [] nums){
        for(int i = 0; i< nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    // Inversion count
    

    public static void main(String[] args) {
        /*String [] arr = {"sun", "earth", "mars", "mercury", "jupiter", "saturn", "uranus"};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        int [] nums = {1, 1, 2, 2, 2, 3}; 
        System.out.println(majorityElement(nums));
        printSubstrings("hello", 0);*/

        int [] nums = {10, 20, 70, 40, 50, 60, 30};
        quickSort(nums, 0, nums.length-1);
        printArr(nums);
       

        
    }
    
}
