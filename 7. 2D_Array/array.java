import java.util.*;
public class array {  // 2D Array
    /*public static boolean search(int matrix[][], int key){
        for (int row = 0; row < matrix.length; row++){
            for (int coloumn = 0; coloumn < matrix[0].length; coloumn++){
                if (matrix[row][coloumn] == key) {
                    System.out.println("Found at cell {" + row + "," + coloumn + "}" );
                    return true;                               
                }
            }
        }
        System.out.println("Key not found");
        return false;     
    }*/

    public static void printsprial (int matrix [][]){
        int startRow = 0;
        int statcol = 0;

        int endrow = matrix.length-1;
        int endCol = matrix.length-1;

        while (startRow <= endrow && statcol <= endCol) {
            // top
            for (int j = statcol; j <= endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }
            //right
            for (int i = startRow + 1 ; i <= endrow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }
            // bottom 
            for (int j = endCol -1; j >= statcol; j --){
                if (startRow == endrow) {
                    break;                    
                }
                System.out.print(matrix[endrow][j] + " ");
            }
            // left
            for (int i = endrow -1; i >= startRow+1; i--){
                if (statcol == endCol) {
                    break;                    
                }
                System.out.print(matrix[i][statcol] + " ");
            }
            statcol++;
            startRow++;
            endCol--;
            endrow--;
        }
        System.out.println();
    }
    
    public static int diagonalSum (int matrix [] []){  // O(n^2)
        //primary
        int sum =0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (i == j){
                    sum += matrix[i][j];
                } else if (i + j  == matrix.length-1) { // Secondary
                    sum += matrix[i][j];                    
                }
            }
        }
        return sum;
    }
    
    public static int diagonalSumOptimised (int matrix [] []){
        int sum = 0;
        for (int i = 0 ; i < matrix.length; i++){
            // Primary diagonal
        sum += matrix [i][i];
        // seconday diagonal
        if (i != matrix.length -1-i) {
            sum += matrix [i][matrix.length-1-i];            
        }
        }
        return sum;
    }

    public static boolean StaircaseMatrix (int stairmatrix[][], int key){
        int row = 0 , col = stairmatrix[0].length -1 ;

        while (row < stairmatrix.length && col >= 0) {
            if (stairmatrix[row][col] == key) {
                System.out.println("Found Key at "+ "{" + row + "," + col + "}");
                return true;               
            }
            else if (key < stairmatrix[row][col]) {
                col--;                
            }
            else {
                row ++;
            }
        }
        System.out.println();
        return false;
    }

    public static void main(String[] args) {
        /*int matrix [][]= new int[3][3];
        
        // Input
        Scanner sc = new Scanner(System.in);
        for (int row = 0; row < matrix.length; row++){
            for(int coloumn = 0; coloumn < matrix[0].length; coloumn++){
                matrix[row] [coloumn] = sc.nextInt();
            }
        }

        // Output 
        for (int row = 0; row < matrix.length; row++){
            for (int coloumn = 0; coloumn < matrix[0].length; coloumn++){
                System.out.print(matrix[row] [coloumn]+ " ");
            }
            System.out.println();
        }

       // search(matrix, 5); */
        
       int matrix [] [] = {{1, 2, 3, 4},
                         {5, 6, 7, 8},
                         {9, 10, 11, 12},
                         {13, 14, 15, 16}};   

        //printsprial(matrix);    
        
        //System.out.println(diagonalSum(matrix));
        //System.out.println(diagonalSumOptimised(matrix));

        int stairmatrix [] [] = {{10, 20, 30, 40},
                         {15, 25, 35, 45},
                         {27, 29, 37, 48},
                         {32, 33, 39, 50}}; 
        int key = 33;
        StaircaseMatrix(stairmatrix, key);

        

        //sc.close(); 
        
        

       
    


        
    }
    

}
