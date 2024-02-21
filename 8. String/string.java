import java.util.*;

public class string {
    public static void printLetters (String fullname){
        for (int i = 0; i < fullname.length(); i++){
            System.out.print(fullname.charAt(i) + " ");
        }
        System.out.println();
    }

    // Check for Palindrome    
    public static boolean isPalindrome (String str){
        for (int i = 0; i < str.length()/2; i++){
            int n = str.length();
            // not a Palindrome
            if (str.charAt(i) != str.charAt(n-1-i)) {
                return false;               
            }
        } 
        return true;       
    }
    // Shortst path 
    public static float printShortestPath (String path){
        int x = 0, y = 0;
        for (int i = 0 ; i < path.length(); i++){
            char dir = path.charAt(i);
            //south
            if (dir == 'S') {
                y--;                
            }
            // north
            else if (dir == 'N') {
                y++;                
            }
            // west
            else if (dir == 'W') {
                x--;                
            }
            // east
            else if (dir == 'E') {
                x++;                
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return(float)Math.sqrt(X2 + Y2);
    }

    // Substring
    public static String printSubstring (String str, int si, int ei){
        String substr = "";
        for (int i = si; i < ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    // convert into lowercase
    public static String toUpperCase (String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++){
            if (str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));

            }
        }
        return sb.toString();

    }

    // String compression
    public static String compression (String str){
        String newstr = " ";
        for (int i = 0; i < str.length(); i++){
            Integer count = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count ++;
                i++;                
            }
            newstr += str.charAt(i);
            if (count > 1) {
                newstr += count.toString();                
            }
        }
        return newstr;
    }

    // string compression using string builder
    public static String compressionString (String str){
        StringBuilder newstr = new StringBuilder(" ");
        for (int i = 0; i < str.length(); i++){
            Integer count = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newstr.append(str.charAt(i));
            if (count > 1) {
                newstr.append(count.toString());              
            }           
        }
        return newstr.toString();

    }


    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        // One word print
        /*String name;
        name = sc.next();
        System.out.println("My name is : "+name);*/   

        // Full line print
        /*String fullName; 
        fullName = sc.nextLine();
        System.out.println("My name is : " + fullName);*/
        
        // Length
        //String fullName = "tony stark";
        //System.out.println(fullName.length());  // output = 10

        // Concatenate
        //String firstName = "Kishan";
        //String lastName = "Mandal";
        //String fullName = firstName + " " + lastName;
        // System.out.println(fullName);
        // System.out.println(fullName.length());
        // System.out.println(fullName.charAt(0));
        //printLetters(fullName);

        /*String str = "noon";
        System.out.println(isPalindrome(str));*/

        /*String path ="WNEENESENNN";
        System.out.println(printShortestPath(path));*/


        // EQUALITY
        /*String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if(s1 == s2){
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }

        if(s1 == s3){
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }

        if (s1.equals(s3)) {
            System.out.println("String are equal");            
        } else {
            System.out.println("String are not equal");
        }*/

        //String str = "HelloWorld";
        //System.out.println(printSubstring(str, 0, 4));

        //System.out.println(str.substring(0, 5));

        /*String fruits[] = {"apple","banana","watermelon","mango"};

        String largest = fruits[0];
        for (int i = 1; i< fruits.length; i++){
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);*/

        /*StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);*/
       
        // Lower case
        /*String str = "hi, i am kishan kumar ";
        System.out.println(toUpperCase(str));*/

        // String compression
        String str = "aaabbbcccddd";
        System.out.println("Compression string : " + compression(str));
        System.out.println("Compression String using stringBuilder : " + compressionString(str));







    }
   
    
}
