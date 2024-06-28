public class Knapsack {
    public static int knapsackRecursion (int val[], int wt[], int W, int n ){ // n -> item 
        if (W == 0 || n == 0) {
            return 0;
        }
        if (wt [n -1] <= W) { //valid
            //include
            int ans1 = val [n -1] +knapsackRecursion(val, wt, W-wt[n-1], n-1);
            //exclude
            int ans2 = knapsackRecursion(val, wt, W, n-1);

            return Math.max(ans1, ans2);
        } else { // not valid
            return knapsackRecursion(val, wt, W, n-1);
        }
    }

    public static int knapsakMemoization (int val[], int wt[], int W, int n, int dp [][] ){ // n -> item 
        if (W == 0 || n == 0) {
            return 0;
        }
        if (dp [n][W] != -1) {
            return dp [n][W];
        }
        if (wt [n -1] <= W) { //valid
            //include
            int ans1 = val [n-1] + knapsakMemoization(val, wt, W-wt[n-1], n-1, dp);
            //exclude
            int ans2 = knapsakMemoization(val, wt, W, n-1, dp);
            dp [n][W] = Math.max(ans1, ans2);
            return dp [n][W];
        } else { // not valid
            dp[n][W] = knapsakMemoization(val, wt, W, n-1, dp);
            return dp [n][W];
        }
    }

    public static void print (int dp [][]){
        for (int i = 0; i < dp.length; i++){
            for (int j = 0; j < dp[0].length; j++){
                System.out.print(dp [i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int KnapsackTab (int val [], int wt [], int W){
        int n = val.length;
        int dp [][] = new int[n+1][W+1];
        
        for (int i = 0; i < dp.length; i++){ // initilize 0th col
            dp [i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++){ // initilize 0th row
            dp [0][j] = 0;
        }

        for (int i = 1; i < n+1; i++){
            for (int j = 1; j < W+1; j++){
                int v = val[i-1]; //ith item val
                int w = wt [i-1]; // ith item wt
                if (w <= j) { //valid
                    int incProfit = v + dp[i-1][j-w];
                    int excProfit = dp [i-1][j];
                    //comparing
                    dp [i][j] = Math.max(incProfit, excProfit);                    
                } else { //invalid
                    int excProfit = dp [i-1][j];
                    dp [i][j] = excProfit;
                }
            }
        }
        print(dp);
        return dp [n][W];
    }
    public static void main(String[] args) {
        // recursion
        int val [] = {15, 14, 10, 45, 30};
        int wt [] = {2, 5, 1, 3, 4};
        int W = 7;

        int dp [] [] = new int[val.length+1][W+1];

        for (int i = 0; i < dp.length; i++){
            for (int j = 0; j < dp[0].length; j++){
                dp [i][j] = -1;
            }
        }

        System.out.println(knapsackRecursion(val, wt, W, val.length));

        System.out.println(knapsakMemoization(val, wt, W, val.length, dp)); //-> 75

        System.out.println(KnapsackTab(val, wt, W));

        /*
        0 0 0 0 0 0 0 0 
        0 0 15 15 15 15 15 15
        0 0 15 15 15 15 15 29
        0 10 15 25 25 25 25 29
        0 10 15 45 55 60 70 70
        0 10 15 45 55 60 70 75

        75
        */

    }

    }
}
