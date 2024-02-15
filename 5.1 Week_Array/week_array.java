public class week_array {
    public static void element (int numbers []){
        int size = numbers.length;
        for (int i = 0; i < size ; i++){
            int getElement = numbers[i];
            System.out.println(getElement);
        }
    }

    // Trapped Rain Water
    public static int trappedRianWater (int heights []) {
        // Calulate left maximum height
        int leftMax []= new int[heights.length];
        leftMax[0]= heights[0];
        for (int i = 1; i < heights.length; i++){
            leftMax[i]= Math.max(heights[i], leftMax[i-1]);
        }

        // Showing left maximum array
        System.out.println("Left maximum array");
        for (int i =0 ; i < heights.length; i++){
            System.out.print(leftMax [i] + " ");
        }
        System.out.println();

        // Calculate right maximum height 
        int rightMax []= new int[heights.length];
        rightMax[heights.length-1]= heights[heights.length-1]; // right [last index] = height [last index]
        for (int i = heights.length-2; i >=0; i--){
            rightMax[i]= Math.max(heights[i], rightMax[i+1]);
        }

        // Showing right maximum array
        System.out.println("Right maximum array");
        for (int i =0 ; i < heights.length; i++){
            System.out.print(rightMax [i] + " ");
        }
        System.out.println();

        int tappedWater = 0;
        // loop
        for(int i =0; i<heights.length; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            tappedWater += waterLevel - heights[i];
        }
        return tappedWater;        
    }

    // Inverted array search // int numbers [] = {4, 5, 6, 7, 0, 1, 2};

    // smallest element index
    public static int minSearch (int [] nums){
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left)/ 2;
            if (mid > 0 && nums [mid -1] > nums [mid]){
                return mid;
            }
            else if (nums [left] <= nums [mid] && nums [mid] > nums [right]) {
                left = mid + 1;  
            }
            else {
                right = mid - 1 ;
            }   
        }
        return left;
    }
    public static int invertedSearch (int[] nums, int target){
        // min will have index of mininmum element of nums 
        int min = minSearch(nums);
        // find in sorted left
        if (nums[min] <= target && target <= nums [nums.length-1]){
            return search (nums, min, nums.length-1, target);
        }
        // find in sorted right
        else{
            return search (nums, 0, min, target);
        }         
    }
    // Binary Search to find target in left to right boundary
    public static int search (int []nums, int left, int right, int target){
        int l = left;
        int r = right;
        System.out.println( left + " " + right);
        while (l <= r) {
            int mid = l + (r-l)/ 2 ;
            if (nums [mid] == target){
                return mid;
            }    
            else if (nums [mid] > target) {
                r = mid -1;                
            } 
            else {
                l = mid +1;
            }      
        }
        return -1;
    }

    // Triplet sum //
    public static void trripleSum (int array []){
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                for (int k = j + 1; k < array.length; k++){
                    if (array[i] + array [j] + array[k] == 0 ) {
                        System.out.println(array[i] + " " + array[j] + " " + array[k]);                       
                    }
                }
            }
        }
    }


    public static void main(String[] args) {

        /*int numbers []= {1, 2, 3, 4, 5};
        element(numbers);*/   

    // Trapped Rainwater
        /*int heights[]= {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        // Showing height of building
        System.out.println("Showing the height of building"); 
        for (int i =0; i < heights.length; i++){
            System.out.print(heights[i] + " ");
        }
        System.out.println();

        System.out.println( "the Total Trapped water stored is = " + trappedRianWater(heights));*/

        // There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1  <=  k  <  nums.length)  such that the resulting  array  is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ...,   nums[k-1]] (0-indexed).For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.You must write an algorithm with O(log n) runtime complexity.//

        /*int arrays [] = {4, 5, 6, 7, 0, 1, 2};
        int pos = invertedSearch (arrays, 2);
        System.out.println(pos);*/
        

        /*Given an integer array nums, return all the triplets [nums[i], nums[j],  nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.*/

        int array [] = {-1, 0, 1, 2, -1, -4};
        trripleSum(array);
     






    }
}
