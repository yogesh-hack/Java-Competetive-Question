// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal 
// substring
//  consisting of non-space characters only.

 

// Example 1:

// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.

class Solution {
    public int lengthOfLastWord(String s) {
        String guk[]=s.split(" ");
        return (guk[guk.length-1].trim().length());
        
    }
}
