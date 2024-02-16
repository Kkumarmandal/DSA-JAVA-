import java.util.Arrays;
import java.util.*;
import java.util.Collections;

public class bubble_sort {
    // Bubble Sort
    /*public static void bubblesort(int arr[]) {
        for(int turn = 0; turn < arr.length - 1; turn++){
            int swap = 0;
            for (int j = 0; j < arr.length -1 - turn; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr [j + 1];
                    arr [ j + 1] = temp;
                    swap++;
                }
            }  
            System.out.println("the swap value : " + swap);            
        }         
    }
    public static void printArr (int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }*/

    // Selection sort
    public static void selectionSort (int arr []){
        for (int i = 0; i < arr.length -1; i++){
            int minPos = i;
            for ( int j = i + 1; j < arr.length; j++){
                if (arr[minPos] > arr[j]) {
                    minPos = j;                   
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Insertion Slot
    public static void insertionslot (int arr []){
        for (int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i -1;

            // Finding out the correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;                
            }
            // Insertion
            arr[prev + 1] = curr;
        }       
    }
    public static void printArr1(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Reverse order import
    public static void insertionslot (Integer arr []){
        for (int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i -1;

            // Finding out the correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;                
            }
            // Insertion
            arr[prev + 1] = curr;
        }       
    }
    public static void printArr1(Integer arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Counting sort 
    public static void countingSort (int arr []){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count [] = new int [largest + 1];

        for (int i = 0; i < arr.length; i++){
            count[arr[i]] ++;
        }

        // SORTING
        int j = 0;
        for (int i = 0; i < count.length; i++){
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i] --;                               
            }
        }
    }
    // Printing
    public static void printArr2(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*int arr []= {5, 4, 1, 3, 2};
        bubblesort(arr);
        printArr(arr);*/

        // selection Sort
        
        /*int arr [] = {5, 4, 1, 3, 2};
        selectionSort(arr);
        printArr(arr);*/

        // Insertion Slot 
        //Integer arr []= { 5, 4, 1, 3, 2};
        //insertionslot(arr); //1 2 3 4 5

        //Arrays.sort(arr);
        //Arrays.sort(arr, 0, 3); //1,4,5,3,2

        //Arrays.sort(arr, Collections.reverseOrder());  // 5 4 3 2 1 

        //Arrays.sort(arr, 0, 3, Collections.reverseOrder());  // 5 4 1 3 2 

        int arr []= {1, 4, 1, 3, 2, 4, 3, 7};
        countingSort(arr);
        printArr2(arr);
    }
    
}
