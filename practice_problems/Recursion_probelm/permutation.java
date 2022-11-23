import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

public class permutation {
    static public ArrayList<String> permute(String str){
        // Base case
        if(str.length() == 0){
            ArrayList<String> o = new ArrayList<>();
            o.add("");
            return o;
        }
        char curr = str.charAt(0);
        String rem = str.substring(1);
        ArrayList<String> temp = permute(rem);
        ArrayList<String> ans = new ArrayList<>();

        for(String s : temp){
            for(int i=0;i<=s.length();i++){
                StringBuffer sb = new StringBuffer(s);
                sb.insert(i, curr);
                ans.add(sb.toString());
            }   
        }
        return ans;
    }
    public static void main(String[] args) {
        //print all permutation of string
        // I/P = "abc"
        // O/P = ["abc","acb","bca","bac","cab","cba"]
        
        System.out.println(permute("abc"));
    }
}
