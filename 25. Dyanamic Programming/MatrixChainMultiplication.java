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
    
    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 3};
        int n = arr.length;

        //System.out.println(mcmrecurss (arr, 1, n-1)); // 30

        int dp [][] = new int[n][n];
        for (int i = 0; i < n; i++){
            Arrays.fill(dp [i], -1);
        }
        System.out.println(mcmMem(arr, 1, n-1, dp)); // 30
    }
}
