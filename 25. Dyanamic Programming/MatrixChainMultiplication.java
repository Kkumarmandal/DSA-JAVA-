public class MatrixChainMultiplication {
    public static int mcmrecurss (int arr [] , int i , int j){ // Recurssion Method
        // base case
        if (i == j){
            return 0;
        }

        int minCost = Integer.MAX_VALUE;
        for (int k = i; k <= j-1; k++){
            int cost1 = mcmrecurss(arr, i, k); // Ai .. Ak => arr [i-1] * arr [k]
            int cost2 = mcmrecurss(arr, k+1, j); // A i+1 .. Aj => arr [K] * arr [j]
            // resustant size a*b*d
            int cost3 = arr [i-1] * arr [k] * arr [j];
            int finalCaost = cost1 + cost2 + cost3 ;
            
            minCost = Math.min(minCost, finalCaost);
            
        }
        return minCost;
    }

    // Matrix Chian Multiplication Memoization
    public static int mcmMem (int arr [], int i, int j, int dp [][]){
        //base case
        if (i == j) {
            return 0;
        }

        if (dp [i][j] != -1) {
            return dp [i][j];
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j-1; k++){
            int cost1 = mcmMem(arr, i, k, dp);
            int cost2 = mcmMem(arr, k+1, j, dp);
            int cost3 = arr [i-1] * arr [k] * arr [j];
            ans = Math.min(ans, cost1 + cost2 + cost3);
        }
        return dp [i][j] = ans;
    }

    //Matrix Chain Multiplication Tabulation
    public static int mcmTab (int arr []){
        int n = arr.length;
        int dp [][] = new int[n][n];
        //initiliazation
        for (int i = 0; i < n; i++){
            dp [i][i] = 0;
        }
        //bottom up
        for (int len = 2; len <= n-1; len++){
            for (int i = 1; i <= n-len; i++){
                int j = i+len-1;
                dp [i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j-1; k++){
                    int cost1 = dp [i][k];
                    int cost2 = dp [k+1][j];
                    int cost3 = arr [i-1] * arr [k] * arr[j];
                    dp [i][j] = Math.min(dp [i][j], cost1+cost2+cost3);
                }
            }
        }
        print(dp);
        return dp [1][n-1];
    }

    public static void print (int dp [][]){
        for (int i = 0; i < dp.length; i++){
            for (int j = 0; j < dp [0].length; j++){
                System.out.print(dp [i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 3};
        int n = arr.length;

        //System.out.println(mcmrecurss (arr, 1, n-1)); // 30

        int dp [][] = new int[n][n];
        for (int i = 0; i < n; i++){
            Arrays.fill(dp [i], -1);
        }
        System.out.println(mcmMem(arr, 1, n-1, dp)); // 30

        System.out.println(mcmTab(arr)); // 30
    }
}
