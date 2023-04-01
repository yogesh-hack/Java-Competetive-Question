// Given two strings, one is a text string and other is a pattern string. The task is to print the indexes of all the occurences of pattern string in the text string. For printing, Starting Index of a string should be taken as 1.

// Input:
// S = "batmanandrobinarebat", pat = "bat"
// Output: 1 18
// Explanation: The string "bat" occurs twice
// in S, one starts are index 1 and the other
// at index 18. 

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
        }
    }
}

class Solution
{
    
    ArrayList<Integer> search(String pat, String S)
    {
        // your code here
        // S = "batman", pat = "bat"
        // 1. s.length = 6 and pat.length = 3
        // List<> result = []
        // 2. calculate hash value shash = 0 phash = 0 prime = 101
        // patHash = 98 * prime^0 + 97 * prime^1 + 116 * prime^2
        // strHash = 98 * prime^0 + 97 * prime^1 + 116 * prime^2
        // if(shash == phash) => then also check character is also equal ?
        //          if(s.charAt(i+j) != p.charAt(j)) = break;
        // if all character match => if(j == patlen) = result.add(i)  
    
        ArrayList<Integer> res = new  ArrayList<Integer>();
            int q =101; // prime
            int d = 26; // weight
            int M = pat.length();  
            int N = S.length();  
            int i, j;  
            int p = 0; // hash value for pattern  
            int t = 0; // hash value for String  
            int h = 1;  
          
            // The value of h would be "pow(d, M-1)%q"  
            for (i = 0; i < M - 1; i++)  {
                h = (h * d) % q;  
            }
          
            // Calculate the hash value of pattern and first window of text  
            for (i = 0; i < M; i++)  
            {  
                p = (d * p + pat.charAt(i)) % q;  
                t = (d * t + S.charAt(i)) % q;  
            }  
          
            // Slide the pattern over text one by one  
            for (i = 0; i <= N - M; i++)  
            {  
          
                // Check the hash values of current window of text  
                // and pattern. If the hash values match then only  
                // check for characters on by one  
                if ( p == t )  
                {  
                    /* Check for characters one by one */
                    for (j = 0; j < M; j++)  
                    {  
                        if (S.charAt(i+j) != pat.charAt(j))  
                            break;  
                    }  
          
                    // if p == t and pat[0...M-1] = txt[i, i+1, ...i+M-1]  
                    if (j == M)  
                        res.add(i+1);  
                }  
          
                // Calculate hash value for next window of text: Remove  
                // leading digit, add trailing digit  
                if ( i < N-M )  
                {  
                    t = (d*(t - S.charAt(i)*h) + S.charAt(i+M))%q;  
          
                    // We might get negative value of t, converting it  
                    // to positive  
                    if (t < 0)  
                    t = (t + q);  
                }  
            }  
            if(res.size()==0)
            res.add(-1);
            return res;
        }
}
