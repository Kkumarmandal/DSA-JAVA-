public class keypad_Combination {
    
    final static char [][] keypad = {
        {},
        {},
        {'a', 'b', 'c'},
        {'d', 'e', 'f'},
        {'g', 'h', 'i'},
        {'j', 'k' ,'l'},
        {'m' , 'n' , 'o'},
        {'p' , 'q', 'r', 's'},
        {'t', 'u', 'v'},
        {'w', 'x', 'y', 'z'},
    };

    public static void letterCombination (String giveString){
        int length = giveString.length();

        if (length == 0) {
            System.out.println("null");            
            return;
        }

        recursive_func(0, length, "", giveString);        
    }
    
    public static void recursive_func (int pos, int length, String outputString, String givenString){
        if (pos == length) {
            System.out.println(outputString);            
        }
        else{
            char [] letters = keypad [givenString.charAt(pos) - '0'];
            for (int i =0; i < letters.length; i++){
                recursive_func(pos+1, length, outputString + letters[i], givenString);
            }
        }
    }


    public static void main(String[] args) {
        letterCombination("234");
        
    }
}
