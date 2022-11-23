import java.util.ArrayList;

public class subsequence {
    static ArrayList<String> sequence(String str){
        // Base case
        if(str.length() == 0){
            ArrayList<String> output = new ArrayList<String>();
            output.add("");
            return output;
        }
        // it store first charcter from string
        char curr = str.charAt(0);
        // store the remaining string.
        String rem = str.substring(1);
        // Start recursion with remainning string and store in temp array.
        ArrayList<String> temp = sequence(rem);

        ArrayList<String> ans = new ArrayList<String>();
        for(String s : temp){
            ans.add(s);
            ans.add(curr + s);
        }
        return ans;

    }
    public static ArrayList<String> solve(String str, String ans){
        
    }
    public static void main(String[] args) {
        // print all subsequence of string
        // i/p = str => "yogesh"
        // o.p = "","y","o","g","e","s","h","yo",.......
        // System.out.println(sequence("ravi"));
        System.out.println(solve("abc", ""));
    }
}
