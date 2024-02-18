public class week_bubble {
    public static void bubbleSort (int arr []){
        
        for (int turn = 0; turn < arr.length; turn++){
            for(int index = 0; index < arr.length-1; index++ ){ 
                if (arr[index] < arr[index+1]) {
                    //Swap
                    int temp = arr [index+1];
                    arr[index + 1] = arr [index];
                    arr[index]= temp;                    
                }
            }
        } 
    }
    public static void printArr (int arr[]){
        for(int index = 0; index < arr.length; index++ ){
            System.out.print(arr[index] + " ");
        }
    }

    public static void selection_Sort(int arr[]){
        for(int index = 0; index < arr.length; index++){
            int maxElement= arr[index];
            int maxIndex = index;
            for (int j = index+1; j < arr.length; j++){
                if (arr[j] > maxElement) {
                    maxElement = arr[j];
                    maxIndex = j;      
                }
                // swap arr[index], arr[max_index]
                int temp = arr[index];
                arr[index]= arr[maxIndex];
                arr[maxIndex] = temp;   
            }
        }
    }
    public static void printselection (int arr[]){
        for(int index = 0; index < arr.length; index++ ){
            System.out.print(arr[index] + " ");
        }
    }

    public static void insertion_sort (int arr[]){
        for (int index =1; index < arr.length; index++ ){
            int temp = arr[index];
            int previous_index = index-1;
            while (previous_index >= 0 && arr[previous_index] < temp) { // moving element forward
                arr[previous_index+1] = arr[previous_index]; 
                previous_index--;
            }
            arr[previous_index+1]= temp;
        }
    }
    public static void print_insertion (int arr[]){
        for(int index = 0; index < arr.length; index++ ){
            System.out.print(arr[index] + " ");
        }
    }

    // Counting sort
    public static void counting_sort (int arr []){
        int max_element = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){  // Max_Element 
            max_element = Math.max(max_element, arr[i]);
        }
        int freq [] = new int [max_element+1];
        for (int i = 0; i <arr.length; i++){
            freq[arr[i]] += 1;
        }
        
        for(int i = max_element ; i >= 0; i--){
            while (freq[i] > 0) {
                System.out.print(i);
                System.out.print(" ");  
                freq[i]--;                              
            }
        }
    }
    /*public static void print_counting (int arr[]){
        for(int index = 0; index < arr.length; index++ ){
            System.out.print(arr[index] + " ");
        }
    }*/

    public static void main(String[] args) {

        // Use the following sorting algorithms to sort an array in DESCENDING order :
        // a.Bubble Sort
        // b.Selection Sort
        // c.Insertion Sort
        // d.Counting Sort
        // You can use this array as an example :[3,6,2,1,8,7,4,5,3,1]
        
        int arr []= {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        counting_sort(arr);
       // print_counting(arr);
        
    }    
}
