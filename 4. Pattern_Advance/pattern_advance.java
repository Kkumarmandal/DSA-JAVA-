public class pattern_advance {
    /// Hollow Rectangle ///
    public static void hollow_rectangle (int totlRows, int tolCols) {
        /// OUTER LOOP ///
        for (int i=1; i <= totlRows; i++){
            /// INNER - COLOUMN //
            for(int j=1; j <= tolCols; j++){
                // cell (i,j) //
                if (i == 1 || i == totlRows || j == 1 || j == tolCols){
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();    
        }
    }
    /// Invertd_half Pyramid
    public static void invertd_halfpyramid (int n ){
        /// NEXT LINE
        for (int i = 1; i <= n; i++){
            // PRINT SPACE
            for (int j = 1; j <= (n-i); j++){
                System.out.print("   ");
            }
            /// PRINT STARS
            for (int j = 1; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    /// Inverted_Half_Pyramid
    public static void inverted_Half_Pyramid(int n){
        /// NEXT LINE ///
        for (int i = 1; i <= n; i++){
            /// PRINT NUMBER
            for (int j = 1; j <= (n-i+1); j++){

                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    // floyds_triangl //
    public static void floyds_triangle (int n){
        int counter = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    // zero_one_triangle //
    public static void zero_one_triangle (int n){
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        
    }
    // Butterfly Pattern //
    public static void butterfly (int n){
        for (int i = 1; i <= n; i++){
            /// PRINT STAR ///
            for (int j = 1; j <= i; j++ ){
                System.out.print("* ");
            }
            /// PRINT SPACE ///
            for (int j = 1; j <= 2*(n-i); j++){
                System.out.print("  ");
            }
            /// PRINT STAR ///
            for (int j = 1; j <= i; j++ ){
                System.out.print("* ");
            }
            System.out.println();       
        }

        for (int i = n; i >= 1; i--){
            /// PRINT STAR ///
            for (int j = 1; j <= i; j++ ){
                System.out.print("* ");
            }
            /// PRINT SPACE ///
            for (int j = 1; j <= 2*(n-i); j++){
                System.out.print("  ");
            }
            /// PRINT STAR ///
            for (int j = 1; j <= i; j++ ){
                System.out.print("* ");
            }
            System.out.println();       
        }
        
    }
    // SOLID RHOMBUS //
    public static void solid_rhombus (int n){
        /// outerloop //
        for(int i =1; i<= n; i++){
            // space //
            for (int j= 1; j<= n-i; j++){
                System.out.print("  ");
            }
            // star //
            for (int j = 1; j <=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // HOLLOW RHOMBUS //
    public static void hollow_rhombus(int n){
        for(int i =1; i<= n; i++){
            for (int j= 1; j<= n-i; j++){
                System.out.print("  ");
            }
            // hollow rectangle - star //
            for (int j = 1; j <= n; j++){
                if (i == 1 || i == n ||j== 1|| j == n){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }               
    }
    // Diamond Pyramid //
    public static void diamond (int n){
        // FOR 1 HALF //
        for (int i=0; i <= n; i++){
            for(int j = 1; j<= (n-i); j++){
                System.out.print("  ");                
            }
            for (int j =1; j<= 2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        /// FOR SECOND HALF ///
        for (int i=n; i >= 1; i--){
            for(int j = 1; j<= (n-i); j++){
                System.out.print("  ");                
            }
            for (int j =1; j<= 2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        
        hollow_rectangle(4, 5);
        
        invertd_halfpyramid(7);
        
       inverted_Half_Pyramid(7);
       
       floyds_triangle(6);
       
       zero_one_triangle(5);
       
       butterfly(4);
       
       solid_rhombus(5);
       
       hollow_rhombus(5);
       
       diamond(5);
        
    }
}

    



