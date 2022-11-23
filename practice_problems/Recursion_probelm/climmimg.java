public class climmimg {
    public static int solve(int n){
        if(n == 1 || n == 2){
            return n;
        }
        return solve(n-1) + solve(n-2);

    }
    public static void main(String[] args) {
        System.out.println(solve(3));
    }
}
