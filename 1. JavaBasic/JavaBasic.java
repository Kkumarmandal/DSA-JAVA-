import java.util.*;


public class JavaBasic {
    public static void main (String args[]) {
       Scanner sc = new Scanner(System.in);
       
    //    average number
       /* int a = sc.nextInt();
         int a = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c ;
        float average = sum / 3;
        System.out.println (sum); 
        System.out.println (average);  */


    ////  Area of square /////
     /*int side = sc.nextInt();
     int area = side * side ; 
     System.out.println(area);*/


     ///cost of 3 items from the user///
    /* float pencil = sc.nextFloat();
     float pen = sc.nextFloat();
     float earaser = sc.nextFloat();
     float Total = pencil + pen + earaser;
     float gst = Total + 9/50;
     System.out.println (gst);*/

    /*byte b = 4;
    char c = 'a';
    short s = 512;
    int i = 1000;
    float f = 3.14f;
    double d = 99.9954;
    float result = (f * b) + (i % c) - (d * s);*/
  
        // Income Tax
    /*int x = sc.nextInt();
    int tax;
    // int y = sc.nextInt();
    
    if (x < 500000) {
        tax = 0;
    } 
    else if (x >= 500000 && x <= 1000000){
         tax = (int) (x * 0.2) ;  
    } 
    else  {
        tax =(int) (x * 0.3) ;
    }
    System.out.println("Your tax is "+ tax);
    } */
    
    /*int marks = sc.nextInt();

    String result = (marks >= 33)? "Pass" : "Fail";
    System.out.print(result);/ */


    //////CALCULATOR////////
    /*System.out.println("Enter 1 value");
    int a = sc.nextInt();
    System.out.println("Enter 2 value");
    int b = sc.nextInt();
    System.out.println("Enter operator value");
    char operator = sc.next().charAt(0);

    switch (operator) {
        case '+': System.out.println(a + b);           
            break;
        case '-': System.out.println(a - b);
            break;
        case '*': System.out.println(a * b);
            break;
        case '/': System.out.println(a / b);
            break;
        case '%': System.out.println(a % b);    
        default: System.out.println("wrong Command");
            break;
        }*/

        /*int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Positive number");
        } else {System.out.println("Negative number");}*/

        /*double temp = 100.5;
        if (temp <= 100) {
            System.out.println("You don't have fever");
        } else {
            System.out.println("You have fever");
        }*/

        /*System.out.println("Enter your number ");
        int WeekNumber = sc.nextInt();

        switch (WeekNumber) {
            case 1: System.out.println("Monday");                
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday"); 
                break;
            case 4 : System.out.println("Thursday"); 
                break;
            case 5 : System.out.println("Friday");
                break;
            case 6 : System.out.println("Saturday");
                break;
            case 7 : System.out.println("Sunday");    
                break;  
            default: System.out.println("Please Input Correct Number");*/
            
            /////  Leap Year /////
            /*System.out.println("Enter your year");
            int year = sc.nextInt();
            boolean x = (year % 4) == 0;
            boolean y = (year % 100) != 0;
            boolean z = ((year % 100 == 0) && (year % 400 ==0));

            if (x && (y || z)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
                
                        }*/

                  
            //Print number 1 to 10 //
       /*  int number = 1;
        while (number <= 10){
            System.out.println(number);
            number++;
        }*/

            // Print number fom 1 to n ///
       /*  System.out.println("Enter your number");
        int n = sc.nextInt();
        int number = 1;
        while (number <= n) {
            System.out.print(number + " ");
            number ++;
        }*/

            // Sum of first N natural number ///
        /*int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum += i;   // sum = sum + i
            i++;
        };
        System.out.println(sum);*/

        /*int n = 10899 ;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n /= 10;  //n = n/10 //                       
        }*/

        /*int n = 10899 ;
        int reverse = 0;

        while (n > 0) {
            int lastDigit = n % 10 ;
            reverse = (reverse * 10) + lastDigit ;
            n /= 10 ;
        }
        System.out.println(reverse);*/

        /*for (int i=0; i<=5; i++) {
            System.out.println("hello world");
            i+=2;
        }*/

        
      /*   int i = 0 ;
        while (i<5) {
            System.out.println("hello");
            i ++;
            i+=2;
        }*/

        //// Write a program that read a set of integre and print sum of even or odd number /////
        /*int evenNumber = 0;
        int oddNumber = 0;
        int number;
        int choice;

        do {
            System.out.println("Enter your number");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evenNumber += number;
            } else {
                oddNumber += number;
            }

            System.out.println("Do ypu want to continue ? Press 1 for Yes or 0 for No");
            choice = sc.nextInt();                    
        } while (choice == 1);

        System.out.println("Sum of Even number " + evenNumber );
        System.out.println("Sum of Odd number " + oddNumber );*/

        /// Factorial ////
        /*int num ;       
        int fact = 1;
        System.out.println("System any positive number.");
        num = sc.nextInt();
        for(int i = 1; i <= num; i++) {
            fact *= i;  //fact = fact * i;
        }
        System.out.println("Factorial " + fact);*/

        ///Print table //
        
        /*System.out.println("Enter your number");
        int num = sc.nextInt();
        for(int i=1; i <= 10; i++){
            int ans = num * i;
            System.out.println(num + " * " + i + " = " + ans);
        }*/
        
    
           
             

                
        sc.close();
    }
 
       
}