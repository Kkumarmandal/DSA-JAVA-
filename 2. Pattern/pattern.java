import java.util.Scanner;

public class pattern {
    public static void main (String args []){
    Scanner sc = new Scanner(System.in);

    // Print star Pattern //
    
    /*for (int line= 1; line <= 4; line++){
        for (int star = 4; star <= line; star++){
            System.out.print("*");
        }
        System.out.println();
    }*/


    /// Inverted Print Star Pattern //
    
    /*int n = 10;
    for (int line = 1; line <= n; line++){
        for(int star = 1; star<= n-line+1; star ++){
            System.err.print(" * ");
        }
        System.out.println();
    }*/

    /// PRINT HALF PYRAMID ///

    /*int n = 5;
    for (int line = 1; line <= n; line ++){
        for (int number = 1; number <= line; number++){
            System.out.print(number);
        }
        System.out.println();
    }*/

    /// PRINT CHARACTER PATTERN ///

    /*int n = 4;
    char ch = 'A';
    // OUTER LOOP //
    for(int line = 1; line <= n; line++) {
    // INNER LOOP //    
        for(int chars = 1; chars <= line; chars++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }*/

    /// PRINT STAR//
    
    /*System.out.println("Enter you number :");
    int n = sc.nextInt();
    int st = 1;
    int sp = n-1;

    int number_of_line = 1;
    while (number_of_line < n) {

        // PRINT STAR //
        for(int j = 0; j < st; j++ ){
            System.out.print("* ");
        }

        //PRINT SPACE //

        for (int j = 0; j < sp; j++){
            System.out.print("sp ");
        }

        //PREPARE FOR NEXT LINE//

        System.out.println();
        st ++;  // st = st +1
        sp --;  // sp = sp +1
        number_of_line ++; // number_of_line = number_of_line + 1
        
    }*/

    ///PRINT STAR SIDEWISE///
    /*int n = sc.nextInt();
    int st = 1;
    int sp = n - 1;
    int number_of_line = 1;

    while (number_of_line < n) {
        //PRINT SPACES//
        for(int j = 0; j < sp; j ++){
            System.out.print("sp ");
        }
        //PRINT STAR//
        for(int j = 0; j < st; j ++){
            System.out.print("* ");
        }
        //PREPARED FOR NEXT LINE //
        System.out.println();
        sp--;
        st++;
        number_of_line++;
        
    }*/

    // PRINT BOX BRACKET //

    /*int n = sc.nextInt();
    int number_of_line = 1;
    int st = n;
    int sp = n -2;

    while (number_of_line <= n-1) {
        if (number_of_line == 1 || number_of_line == n-1){
            for (int i = 0; i < st; i++){
                System.out.print("* ");
            }
        } else {
            // System.out.print("* ");
            for (int i = 0; i < 1; i++){
                System.out.print("* ");
            }
            for (int i =0; i < sp; i++){
                System.out.print("  ");
            }
            // System.out.print("* "); 
            for (int i = 0; i < 1; i++){
                System.out.print("* ");
            }       
        }
        System.out.println();
        number_of_line++; 
    }*/

    /// Print Butterfly //

    /*int n = sc.nextInt();
    int number_of_line = 1;
    int st = 1;
    int sp = 2*n-2;

    while (number_of_line <= 2*n) {
        // PRINT STAR
        for(int i = 0; i < st; i++){
            System.out.print("* ");
        }
        // PRINT SPACES
        for(int i = 0; i < sp; i++){
            System.out.print("  ");
        }
        //PRINT STAR
        for(int i = 0; i < st; i++){
            System.out.print("* ");
        }
        //PRINT NEXT LINE       

        if (number_of_line < n){
            st ++;
            sp = sp -2;
        } else if (number_of_line > n){
            st--;
            sp = sp + 2;
        }
        System.out.println();
        number_of_line ++;
        }*/        
        
        /// DIAMOND PATTERN
        /*int n = sc.nextInt();
        int number_of_line = 1;
        int st = 1;
        int sp = n-1;

        while (number_of_line <= 2*n-1) {
            //  print space

            for (int i = 0; i < sp; i ++){
                System.out.print("  ");
            }

            //  print star

            for (int i = 0; i < st; i ++){
                System.out.print("* ");
            }

            // next line
            if (number_of_line < n){
                st = st + 2;
                sp --;
            } else{
                st = st - 2;
                sp ++;
            }
            System.out.println();
            number_of_line++;
            
        }*/

        /// PRINT RHOMBUS

        /*int n = sc.nextInt();

        int number_of_line = 1;
        int osp = n-1;
        int isp = n -2;

        while (number_of_line <= n) {
            if (number_of_line == 1 || number_of_line == n){
                for(int i = 0; i < osp; i++){
                    System.out.print("  ");
                }
                for (int i = 0; i < n; i++){
                    System.out.print("* ");
                }
            } else {
                // Print outer space
                for(int i = 0; i < osp; i++){
                    System.out.print("  ");
                }
                // Print star

                System.out.print("* ");

                // Print inner Space
                for(int i = 0; i < isp; i++){
                    System.out.print("  ");
                }
                // Print Star
                System.out.print("* ");

            } 
            System.out.println();
            osp--;
            number_of_line++;
            
        }*/

        /// PRINT NUMBER PATTERN  (Number Pyramid)
        /*int n = sc.nextInt();
        
        int number_of_line =1;
        int space = n-1;
        int star = 1;

        while (number_of_line <= n) {
            //Print Space

            for (int i = 0; i < space; i++){
                System.out.print("  ");
            }
            // Print Star

            for (int i = 0; i < star; i++){
                System.out.print(number_of_line + "   ");
            }

            // Next Line
            System.out.println();
            number_of_line++;
            space--;
            star++;
            
        }*/

        /// Pallindrome Pattern

        int n = sc.nextInt();
        
        int number_of_line =1;
        int space = n-1;
        int star = 1;

        while (number_of_line <= n) {
            //Print Space

            for (int i = 0; i < space; i++){
                System.out.print("  ");
            }
            // Print Star --> Replace with number

            /*for (int i = 0; i < star; i++){
                System.out.print("* ");git
            }*/

            int current_number = number_of_line;
            for (int i = 0; i < star; i++){
                System.out.print(current_number + " ");
                if (i < star/2) {
                    current_number--;                    
                } else {
                    current_number ++;
                }
            }

            // Next Line
            System.out.println();
            number_of_line++;
            space--;
            star = star +2;
            
        }








    sc.close();
    }
}
    
