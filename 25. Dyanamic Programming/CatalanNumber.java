public class CatalanNumber {
    public static int catalanRec (int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        int ans = 0; // Cn
        for (int i = 0; i <= n-1 ; i++){
            ans += catalanRec(i) * catalanRec(n-i-1);
        }
        return ans;       
    }


    public static void main(String[] args) {
        int n = 4;

        System.out.println(catalanRec(n)); // -> 14
    }
}
