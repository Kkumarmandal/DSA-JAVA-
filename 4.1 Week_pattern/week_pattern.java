public class week_pattern {
    public static void pyramid (int n){       
        
        for (int i = 1; i <= n; i++){
            for (int j = 0; j < n-i; j++){
                System.out.print("  ");
            }
            for (int j = 0; j < 2*i - 1; j++){
                if (j%2 == 0) {
                    System.out.print(i);                
                } else {
                    System.out.print("   ");
                }                               
            }
            System.out.println();
            }
        }

    


    public static void main(String[] args) {
        pyramid(6);
    }
}

