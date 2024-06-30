public class RodCutting {
    public static int rodCutting (int length[], int price [], int totRod){
        int n = price.length; //price.length or lenght.lenght 
        int dp [] [] = new int[n+1][totRod +1];

        for (int i = 0; i < n+1; i ++){  // intilization
            for (int j = 0; j < totRod+1; j++){
                if (i == 0 || j == 0) {
                    dp [i][j] = 0;
                }
            }
        }

        for (int i = 1; i < n+1; i++){
            for (int j = 1; j <= totRod; j++){
                // valid codition
                if (length [i-1] <= j) { // price ki lenght <= totrod
                    //comparing include and exclude
                    //dp [i][j] = Math.max(val [i-1] + dp[i][j] - length [i-1], dp [i-1][j]);
                    
                    dp [i][j] = Math.max(price [i-1] + dp [i][j - length [i-1]], dp [i-1][j]);
                }else {
                    //exclude
                    dp [i][j] = dp [i-1][j];
                }
            }
        }
        print(dp);
        return dp [n][totRod];
    }

    public static void print (int dp [][]){
        for (int i = 0; i < dp.length; i++){
            for (int j = 0; j < dp[0].length; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int length [] = {1, 2, 3, 4, 5, 6, 7 ,8};
        int price [] = {1, 5, 8, 9, 10, 17, 17, 20};
        int totRod = 8;

        System.out.println(rodCutting(length, price, totRod));

        /*
         * 0 0 0 0 0 0 0 0 0 
        0 1 2 3 4 5 6 7 8
        0 1 5 6 10 11 15 16 20
        0 1 5 8 10 13 16 18 21
        0 1 5 8 10 13 16 18 21
        0 1 5 8 10 13 16 18 21
        0 1 5 8 10 13 17 18 22
        0 1 5 8 10 13 17 18 22
        0 1 5 8 10 13 17 18 22

            22
         */
    }
}
