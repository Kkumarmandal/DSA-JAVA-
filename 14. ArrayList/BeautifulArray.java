import java.util.ArrayList;
import java.util.Scanner;

public class BeautifulArray {
    public static ArrayList <Integer> beautifulArray (int n){

        ArrayList <Integer> ans = new ArrayList<Integer>();
        ans.add(1);

        while (ans.size() < n) {
            ArrayList <Integer> temp = new ArrayList<Integer>();
            int ans_size = ans.size();

            for (int i=0; i<ans_size; i++){     // Odd 
                if ((ans.get(i)*2-1) <= n) {
                    temp.add(ans.get(i)*2-1);                    
                }                
            }

            for (int i=0; i<ans_size; i++){     // Even
                if (ans.get(i)*2 <= n) {
                    temp.add(ans.get(i)*2);                    
                }
            }
            ans = temp;
            
        }
        return ans;

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList <Integer> ans = beautifulArray(n);
        
        int ans_size = ans.size();
        for (int i=0; i<ans_size; i++){
            System.out.print(ans.get(i) + " ");
        }        
    }
}
