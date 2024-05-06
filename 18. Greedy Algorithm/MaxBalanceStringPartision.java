import java.util.*;

public class MaxBalanceStringPartision {
    public static int maxBalStrPart (String str){
        int n = str.length();

        int lCount = 0;
        int RCount = 0;
        int ans = 0;

        for (int i =0; i < n; i++){
            char ch = str.charAt(i);
            if (ch == 'L') {
                lCount++;                
            }else {
                RCount++;
            }
            if (lCount == RCount) {
                ans++;                
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        System.out.println(maxBalStrPart(str));
        
    }
}
