public class LexiSmallestString {
    public static String Lixicographically (int n, int k){
        StringBuilder sb = new StringBuilder();

        int total_char = n; // total Character
        int Csum = k; //current sum

        while (total_char > 0) {
            //is it possible to fill 'a' here
            if ((total_char - 1) * 26 >= (Csum - 1)) {
                sb.append('a');
                Csum--;                
            }else{
                int position = Csum % 26;
                if (position == 0) {
                    sb.append('z');
                    Csum-=26;                    
                }else {
                    sb.append ((char) (position - 1 + 'a'));
                    Csum -= position;
                }
            }
            total_char--;
            
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int n = 3;
        int k = 25;
        System.out.println(Lixicographically(n, k));
        
    }
}
