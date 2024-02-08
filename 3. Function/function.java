
import java.util.*;


public class function {
    public static void printHelloWorld() {
        System.out.println("HelloWorld");
        System.out.println("Hello World");
        return;
    }
    public static int calculateSum (int a, int b){
        
        int sum = a + b ;
       return sum;
       
    }
    /*public static void sum (int a, int b){
    
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: "+ a);
        System.out.println("b : "+ b);        
    }*/

    public static int multiply (int a, int b){
        int product = a * b;
        return product;
    }
    
    public static int factorial (int n){
        int f = 1;
        for (int i = 1; i <= n; i++){
            f = f * i;
        }
        return f ;
    }

    public static int binFactotorial (int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;

    }
    /// SUM OF TWO INTEGER
    /*public static int sum (int a, int b){
        return a+b;
    }*/
    /// SUM OF THREE INTEGER
    /*public static int sum (int a, int b, int c){
        return a + b + c;
    }*/

    public static int sum (int a, int b){
        return a+b;
    }
    public static float sum (float a, float b){
        return a+b;
    }
        /// CHECK NUMBER IS PRIME ////
    /*public static boolean isPrime (int n) {
        if ( n == 2){
            return true;
        }
        boolean isPrime = true ;
        for (int i = 2; i <= n-1; i++){
            if (n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }*/

    /// CHECK NUMBER IS PRIME IN OPTIMISED ////

    public static boolean isPrime (int n) {
        if ( n == 2){
            return true;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            
            }
        }
        return true;
    }
    public static void primeInRange (int n){
        for (int i = 2; i <= n; i++){
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
        /// BINARY TO DECIMAL ////
    public static void binToDec (int binNum){
        int pow = 0;
        int decNum = 0;
        int myNum = binNum;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow ++;
            binNum = binNum / 10;            
        }
        System.out.println("Decimal of " + myNum + " = " + decNum);
    }
        /// DECIMAL TO BINARY ///
    public static void dectoBin (int n){
        int pow = 0;
        int binNum = 0;
        int myNum = n;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
    
            pow ++;
            n = n/2;            
        }
            System.out.println("Decimal of " + myNum + " = " + binNum);
        }
        /// AVERAGE OF THREE NUMBER ///
        public static int average(int a, int b, int c){            
            int averagenum = (a+b+c)/3;
            return averagenum;
        }
        /// CHECKING NUMBER IS EVEN ////
        public static boolean isEven (int n){
            if (n % 2 == 0){
                return true;
            }
            return false; 
                 
        }
        /// CHECKING PALINDROME///

        public static boolean palin(int n){
            int palindrome = n;
            int rev = 0;
            while (palindrome > 0) {
                int lastDigit = palindrome % 10;         
                rev = (rev *10) + lastDigit;   
                palindrome = palindrome /10; 
            }
            if (n == rev ) {
               return true;                 
            }
            return false;
        }
        /// CHECKING SUM OF DIGITS IN AN INTEGER///
        public static int sumDigits(int n){
            int sumofDigits = 0;
            while (n > 0) {
                int lastDigit = n % 10;
                sumofDigits += lastDigit;   /// sumofDigits = sumOfdigits + lastdigit;
                n /= 10;              /// n = n/10;  
            }
            return sumofDigits;
        }     
      
    public static void main (String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("sum: "+ sum);*/   
         
            /// CALL BY VALUE///

        Scanner sc = new Scanner(System.in);
        /*int a = sc.nextInt();
        int b = sc.nextInt();

        sum(a, b);  // Call by value

        System.out.println("a: "+ a);  // Call the original
        System.out.println("b : "+ b);  // call the original*/

        /*int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = multiply(a, b);
        System.out.println("multiply value: " + prod);*/

        /*int b = sc.nextInt();
        System.out.println(factorial(b));*/

        //System.out.println(binFactotorial(5, 2));

        /*System.out.println(sum(5, 3));
        System.out.println(sum(5.0f, 3.0f));*/

        //System.out.println(isPrime(5));

        //primeInRange(100);

        //binToDec(101);
        
        //dectoBin(5);

        //System.out.println(average(5, 5, 6));
       // System.out.println("The number is : " + isEven(12));

       //int n = sc.nextInt();
        //System.out.println(palin(n));
        System.out.println(sumDigits(55));
       
        sc.close();
       

    }

  
}