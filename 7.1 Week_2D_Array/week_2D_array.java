import java.util.Scanner;

public class week_2D_array {
    public static void same_number (int nums[][], int key){
        int sameNumber = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j= 0; j < nums[0].length; j++){
                if (nums[i][j] == key) {
                 sameNumber ++;                                  
                } 
            }
        }
           System.out.println("the count of 7 is : " + sameNumber); 
    }

    /*Print out the sum of the numbers inthe second row of the “nums” array.
    Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
    Output - 1 */

    public static void question2 (int queNums[][]){
        int sum = 0;
        // sum of 2 Row
            for (int j = 0; j < queNums[0].length; j++){
                 sum += queNums[1][j];
            }
            System.out.println("Sum : " + sum);        
    }
       
    public static void printMatrix (int matrix [][]){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.println(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int nums [][] = {{4, 7, 8}, {8, 8, 7}};
        int key = 7;
        same_number(nums, key);

        int queNums [][] ={{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        question2(queNums);

        // question 2//
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt() , m = sc.nextInt();
        int a [][]= new int[n][m];
        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){

                a [i][j] = sc.nextInt();

            }
        }
        int k = sc.nextInt();
        int sum = 0;
        for (int j = 0; j < m; j++){
            sum += a [k][j];
        }
        System.out.println(sum);   
        sc.close();

        // Tranpose
        int row = 2 , column = 3;
        int matrix [][]= {{2 , 3, 7},{5, 6, 7}};
        // Display original matrix
        printMatrix(matrix);

        // Tranpose the matrix
        int tranpose [] [] = new int [row][column];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++) {
                tranpose[j][i]= matrix[i][j];
            }           
        }
        printMatrix(tranpose);
    }
    
}
