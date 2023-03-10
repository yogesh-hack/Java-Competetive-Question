// Problem : 1768

// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
// Explanation: The merged string will be merged as so:
// word1:  a   b   c
// word2:    p   q   r
// merged: a p b q c r


class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();

        String ans = "";
        
        int len = Math.max(n1,n2);
        for(int i = 0; i < len; i++){
            if(i < n1){
                ans += "" + word1.charAt(i);
            }
            if(i < n2){
                ans += "" + word2.charAt(i);
             }
        } 
        return ans;
    }
}
