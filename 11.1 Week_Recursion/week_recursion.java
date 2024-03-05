public class week_recursion {
    // Fibonacci Series
    public static int fibonacci (int n){
        if (n == 0 || n == 1) {
            return n;            
        }
        int fnm1 = fibonacci(n-1);
        int fnm2 = fibonacci(n-2);
        return fnm1+fnm2;
    }
    // linaer Search
    public static void linaerSearch (int arr [], int target, int ind){
        if (ind == arr.length) {
            return;            
        }
        if (arr[ind] == target) {
            System.out.print(ind + " ");            
        }
        linaerSearch(arr, target, ind+1);
    }
    // Tower of Hanoi
    public static void towerOfHanoi (int n, String src, String help, String dest){
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from "+ src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, help);
        System.out.println("Transfer disk " + n + " from "+ src + " to " + dest);
        towerOfHanoi(n-1, help, dest, src);
    }
    



    public static void main(String[] args) {
        /*int n = 20;
        System.out.println("Fibonacci Series of "+ n + " is " + fibonacci(n));*/

        /*int arr []= {3, 2, 4, 5, 6, 2, 7, 2, 2};
        linaerSearch(arr, 2  , 0);*/

        int n = 3;
        towerOfHanoi(n, "S", "H", "D");

        
    }
    
}
