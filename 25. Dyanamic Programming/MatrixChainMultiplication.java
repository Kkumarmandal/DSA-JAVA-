public class MatrixChainMultiplication {
    public static int mcmrecurss (int arr [] , int i , int j){ // Recurssion Method
        // base case
        if (i == j){
            return 0;
        }

        int minCost = Integer.MAX_VALUE;
        for (int k = i; k <= j-1; k++){
            int cost1 = mcm(arr, i, k); // Ai .. Ak => arr [i-1] * arr [k]
            int cost2 = mcm(arr, k+1, j); // A i+1 .. Aj => arr [K] * arr [j]
            // resustant size a*b*d
            int cost3 = arr [i-1] * arr [k] * arr [j];
            int finalCaost = cost1 + cost2 + cost3 ;
            
            minCost = Math.min(minCost, finalCaost);
            
        }
        return minCost;
    }


    
    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 3};
        int n = arr.length;

        System.out.println(mcmrecurss (arr, 1, n-1));
    }
}
