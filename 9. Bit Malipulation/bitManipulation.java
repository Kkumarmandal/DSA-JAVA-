public class bitManipulation {

    // Check If number is Odd or even
    public static void oddOrEven (int n){
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even Number");            
        }else {
            System.out.println("Odd Number");
        }
    }

    // Get Ith Bit
    public static int getIthBit (int n, int i){
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;            
        } else {
            return 1;
        }
    }

    // Set Ith Bit
    public static int setIthBit (int n , int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // Clear Ith Bit
    public static int cleaIthBit (int n, int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    // Update Ith Bit
    public static int updateIthBit (int n, int i, int newBit){
        /*if (newBit == 0) {
            return cleaIthBit(n, i);            
        } else {
            return setIthBit(n, i);
        }*/

        int m = cleaIthBit(n, i);
        int bitMask = newBit << i;
        return m | bitMask;
    }

    // Clear last Ith bit
    public static int clearLastIthBit (int n, int i){
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    // Clear range of bit
    public static int clearRangeIbit (int n, int i, int j){
        int a = ((~0) << (j+1));
        int b = (1 << i)-1;
        int bitMask = a | b;
        return n & bitMask ;

    }
    // Power of 2 or not
    public static boolean isPowerOfTwo (int n){
        return (n & n-1) == 0;
    }

    // Count Set bit
    public static int countSetBit (int n){
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count ++;                
            }
            n = (n >> 1);            
        }
        return count;
    }

    // Fast epotential
    public static int fastExpo (int a, int n){
        int ans = 1; 

        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;                
            }            
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }


    public static void main(String[] args) {
        // System.out.println(" AND operator " + (5 & 6));

        // System.out.println(" OR operator " + (5 | 6));

        // System.out.println(" XOR operator " + (5 ^ 6));

        // System.out.println(" One's Complement (NOT Operator) operator " + (~ 5));

        // System.out.println(" Binary left Shift operator " + (5 << 2));

        // System.out.println(" Binary Right Shift operator " + (6 >> 1));

        // Check If Odd or Even
        /*oddOrEven(3);
        oddOrEven(90);
        oddOrEven(91);*/

        // Get Ith Bit
        //System.out.println(getIthBit(10, 3));

        // Set Ith Bit
        //System.out.println( "Set Ith Bit : "+setIthBit(10, 2));

        //cLear Ith Bit
        //System.out.println(cleaIthBit(10 , 1));

        // Update Ith Bit
        //System.out.println(updateIthBit(10, 2, 1));

        // clarLastIthBits
        //System.out.println(clearLastIthBit(15, 2));

        // Clear range Ith Bit
        //System.out.println(clearRangeIbit(10, 2, 4));

        // Is Power is 2 or not
        //System.out.println(isPowerOfTwo(16));

        // Count the Set bit in number
        //System.out.println( "Count : " +countSetBit(10));

        // Fast expotential
        System.out.println(fastExpo(3, 5));




    }    
}
