public class MinimumPartitioning {
    public static int minPartition (int arr []){
        int n = arr.length;
        // sum Initilize
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        //w = sum/2
        int w = sum/2;

        int dp [][] = new int[n+1][w+1];
        //bottom up
        for (int i = 1; i < n+1; i++){
            for (int j = 1; j < w+1; j++){
                //valid condition
                if (arr [i-1] <= j) {
                    //include
                    dp [i][j] = Math.max(arr [i-1] + dp [i-1][j - arr [i-1]], dp [i-1][j]);
                }else {
                    //exclude
                    dp [i][j] = dp [i-1][j];
                }
            }
        }
        int sum1 = dp [n][w];
        int sum2 = sum - sum1;
        return Math.abs(sum1 - sum2);
        
    }
    public static void main(String[] args) {
        int nums [] = {1, 6, 11, 5};

        System.out.println(minPartition(nums));

    }
}
