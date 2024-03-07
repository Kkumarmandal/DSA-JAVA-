public class divide_and_conquer {

    // Merge Sort

    // Print function
    /*public static void printArr (int arr []){  
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr [i] + " ");
        }
        System.out.println();
    }
    
    public static void mergeSort (int arr [], int si, int ei){
        // Base case
        if (si >= ei) {
            return;            
        }
        // Kaam
        // Calculate Middle
        int mid = si + (ei - si)/2;

        mergeSort(arr, si, mid);    // Left Side
        mergeSort(arr, mid+1, ei);   // Right Side
        merge(arr, si, mid, ei);     // Dono ko merge karna hai alag sa merge function
    }
    public static void merge (int arr [], int si, int mid, int ei){
        int temp [] = new int [ei - si +1];
        int i = si; // iteratetor for left side
        int j = mid +1; // iterator for right side
        int k = 0; // iterator for temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++ ; 
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // Left Over Part
        // Left over element for first sorted part
        while (i <= mid) {
            temp [k++] = arr[i++];            
        }

        // Left over element for Second sorted part
        while (j <= ei) {
            temp [k++] = arr [j++];            
        }

        // Copy temp to my original array
        for (k=0, i=si; k < temp.length; k++, i++){
            arr[i] = temp [k];
        }        

    }*/

    // Quick Sort
    /*public static void printArr(int arr []){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quicksort (int arr [], int si, int ei){

        // Base Case
        if (si >= ei) {
            return;            
        }

        // Select Pivot -> last element
        int pIdx = partition (arr, si ,ei);
        quicksort(arr, si, pIdx-1);     // Left side
        quicksort(arr, pIdx+1, ei);     // Right side
    }

    public static int partition (int arr[], int si, int ei){
        int pivot = arr[ei];    // pivot = 5
        int i = si - 1;  // to make place for els smaller than pivot

        for(int j = si; j < ei; j++){  // current elemnt < pivot
            if (arr[j] <= pivot) {  
                i ++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;                
            }
        }
        // Pivot ko sahi jaga pe dall dete hai
        i++;
        int temp = pivot;
        arr [ei] = arr[i];
        arr[i] = temp;
        return i;
    }*/

    public static int search (int arr[], int tar, int si, int ei ){
        // Base case
        if (si > ei) {
            return -1;            
        }
        // kaam
        // To findout the mid value
        int mid = si + (ei - si)/2;  // (si + ei)/2

        // case FOUND 
        if (arr[mid] == tar) {
            return mid;            
        }
        // mid lie on L1
        if (arr[si] <= arr[mid]) {
            //case a : left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid-1);                
            } else {
                // case b : right
                return search(arr, tar, mid+1, ei);
            }
        }

        // mid on L2
        else{
            // case c : right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid+1, ei);                
            } else {
                // case d : left
                return search(arr, tar, si, mid-1);
            }
        }
    }




    public static void main(String[] args) {
        // MergeSort
        /*int arr [] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length-1);  // arr.length = 6 -1 = 5 zero base index
        printArr(arr);*/

        // Quick Sort
        /*int arr [] = {6, 3, 9, 8, 2, 5};
        quicksort(arr, 0, arr.length-1);
        printArr(arr);*/

        // Modified Binary Search {Rotated Sorted array}
        int arr [] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0; // output -> 4
        int tarInd = search(arr, target, 0, arr.length-1);
        System.out.println(tarInd);


        
    }
    
}
