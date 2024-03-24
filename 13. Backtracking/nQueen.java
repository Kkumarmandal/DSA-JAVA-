public class nQueen {
    public static void nQueens (char board [][], int row){
        //base case
        if (row == board.length) {
            printBoard (board);
            count ++; // count total ways
            return;            
        }

        //coloumn loop
        for (int j = 0; j < board.length; j++){
            if (isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueens(board, row+1);  //Function call
                board [row][j] = 'X';   //Backtracking Step
            }
        }
    }

    // Check if problem can br solve & print only one solution
    /*public static boolean nQueens (char board [][], int row){ 
        //base case
        if (row == board.length) {
            //printBoard (board);
            count ++; // count total ways
            return true;            
        }

        //coloumn loop
        for (int j = 0; j < board.length; j++){
            if (isSafe(board, row, j)){
                board[row][j] = 'Q';
                if (nQueens(board, row+1)){
                    return true;
                }
                board [row][j] = 'X';   //Backtracking Step
            }
        }
        return false;
    }*/


    public static void printBoard (char board [][]){
        System.out.println("---------- Chessboard ----------");
        for (int i = 0; i < board.length ; i++){
            for (int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe (char board [][], int row, int col){
        // vertical up
        for (int i = row-1; i>= 0; i--){
            if (board[i][col] == 'Q') {
                return false;                
            }
        }
        // diagonal left up
        for (int i = row-1, j = col-1; i>= 0 && j>= 0; i--, j--){
            if (board[i][j] == 'Q') {
                return false;                
            }
        }
        // diagonal right up
        for (int i = row-1, j = col+1; i>= 0 && j< board.length; i--, j++){
            if (board[i][j] == 'Q') {
                return false;                
            }
        }
        return true;
    }
    static int count = 0; // Count total ways
    public static void main(String[] args) {
         // nQueens
         int n = 4;
         char board [][] = new char[n][n];
         // initialize
         for (int i = 0; i < n; i++){
             for(int j = 0; j < n; j++){
                 board[i][j] = 'X';
             }
         }
         //nQueens(board , 0);
         //System.out.println("Total ways to solve n queens = " + count); // Count total ways
         
         /*if (nQueens(board, 0)) {
            System.out.println("Solution is Possible");
            printBoard(board);            
         }else {
            System.out.println("Solutiom is not Possible ");
         }*/
        
    }
}
