
// Given a matrix of size N x N. Print the elements of the matrix in the snake like pattern depicted below.


// Snake Pattern
              // -> 45 -> 48 -> 54
              // 21 <- 89 <- 87 ↩
              //  ↳ 70 -> 78 -> 15

// Input:
// N = 3 
// matrix[][] = {{45, 48, 54},
//              {21, 89, 87}
//              {70, 78, 15}}
// Output: 45 48 54 87 89 21 70 78 15 
// Explanation:
// Matrix is as below:
// 45 48 54
// 21 89 87
// 70 78 15
// Printing it in snake pattern will lead to 
// the output as 45 48 54 87 89 21 70 78 15.

//{ Driver Code Starts
//Initial Template for Java

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
            int n = sc.nextInt();
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.snakePattern(matrix);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here 
        ArrayList<Integer> result = new ArrayList<>();
        int row = matrix.length;
        
        for(int i = 0; i < row ;i++){
            if(i % 2 == 0){
                for(int j = 0; j < row; j++){
                    result.add(matrix[i][j]);
                }
            }
            else{
                for(int j = row - 1; j >= 0; j--){
                    result.add(matrix[i][j]);
                }
            }
        }
        return result;
    }
}
