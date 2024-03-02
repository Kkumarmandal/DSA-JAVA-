public class recursionBasic {
    //Print Decreasing number
    public static void printDec (int n){
        if (n == 1) {
            System.out.println(n);
            return;            
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
    // Print Increasing Number
    public static void printInc (int n){
        if (n == 1) {
            System.out.print(n + " ");
            return;            
        }
        printInc(n-1);
        System.out.print(n + " ");

    }
    // Print Factorial
    public static int factorial (int n){
        if (n == 0) {
            return 1 ;           
        }
        int fnm1 = factorial (n-1);
        int fn = n * factorial (n-1);
        return fn;
    }
    // Print Sum of N Natural Number
    public static int Sum (int n){
        if (n == 1) {
            return 1;            
        }
        int Snm1 = Sum(n - 1);
        int sum = n + Sum(n - 1);
        return sum;
    }
    // claculate nth term of Fibonacci number
    public static int fib (int n){
        if (n == 0 || n == 1 ) {
            return n;            
        }
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }
    // Check if a given array is sorted
    public static boolean isSorted (int arr [], int i){
        if ( i == arr.length-1) {
            return true;
        }
        if (arr [i] > arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }
    // Print First Occurence
    public static int firstOccurence (int arr [], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;            
        }
       return firstOccurence(arr, key, i+1);
    }
    // Print Last Occurence
    public static int lastOccurence (int arr[], int key, int i){
        // base Code
        if (i == arr.length){
            return -1;
        }

        int isFound = lastOccurence(arr, key, i+1);
        if (isFound == -1 && arr[i] == key) {
            return i;            
        }
        return isFound;
    }
    // Print X ^ n
    public static int power (int x, int n){
        // base code
        if (n == 0) {
            return 1;            
        }
        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;
        //return x * power(x, n - 1); // code optimization
    }
    // Print X ^ n Optimised
    public static int optimisedPower (int a, int n){
        if (n == 0) {
            return 1;            
        }
        int halfPower = optimisedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;
        
        //n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;            
        }
        return halfPowerSq;
    }
    // Tiling problem
    public static int tilingProblem (int n){
        //base case
        if (n == 0 || n == 1) {
            return 1;            
        }
        // Kaam
        // Vertical Problem
        int fnm1 = tilingProblem(n-1);

        //Horizontal problem
        int fnm2 = tilingProblem(n - 2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    // Remove duplicate
    public static void removeduplicate (String str, int idx, StringBuilder newstr, boolean map[]){
        // Base Code
        if (idx == str.length()){
            System.out.println(newstr);
            return;
        }

        // Kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // Duplicate
            removeduplicate(str, idx+1, newstr, map);
        } else {
            map[currChar - 'a'] = true;
            removeduplicate(str, idx+1, newstr.append(currChar), map);
        }
    }
    // Friend Pairing Problem
    public static int friendsPairing (int n){
        //Base Choise
        if (n == 1 || n == 2) {
            return n;            
        }
        // Choice
        //Single
        int fm1 = friendsPairing(n-1);
        // Pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;
        // Total Ways
        int totalWays = fm1 + pairWays;
        return totalWays;
    }

    // Priny Binary String
    public static void printBinStrings (int n, int lastPlace, String str){
        // Base Case
        if (n == 0) {
            System.out.println(str);
            return;            
        }
        // Kaam
        printBinStrings(n-1, 0, str+"0");
        if (lastPlace == 0) {
            printBinStrings(n-1, 1, str+"1");            
        }
    }

    public static void main(String[] args) {
        /*int n = 10; 
        printDec(n);*/  

        /*int n = 10;
        printInc(n); */
        
        /*int n = 5;
        System.out.println(factorial(n));*/

        /*int n = 5;
        System.out.println(Sum(n));*/

        /*int n = 5;
        System.out.println(fib(n));*/

        /*int arr [] = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr, 0));*/

        /*int arr [] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(firstOccurence(arr, 5, 0));*/

        /*int arr [] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(lastOccurence(arr, 5, 0));*/

        /*int x = 2;
        int n = 3;
        System.out.println(power(x, n));*/

        /*int a = 2;
        int n = 10;
        System.out.println(optimisedPower(a, n));*/

        /*System.out.println(tilingProblem(3));*/

        /*String str = "appnnacollege";
        removeduplicate(str, 0, new StringBuilder(""), new boolean [26]);*/

        //System.out.println(friendsPairing(3));

        printBinStrings(3, 0, "");
    }
    
}
