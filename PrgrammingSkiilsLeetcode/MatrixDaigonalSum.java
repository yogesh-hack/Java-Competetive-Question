// Problem : 1572

// Input: mat = [[1,2,3],
//               [4,5,6],
//               [7,8,9]]
// Output: 25
// Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
// Notice that element mat[1][1] = 5 is counted only once


class Solution {
    public int diagonalSum(int[][] mat) {
        int len = mat.length;
        int sum =0;
        for(int i = 0;i<len;i++){
            int ele1 = mat[i][i];
            int ele2 = mat[i][len-i-1];
            sum+=ele1+ele2;
        }
        if(len%2==0) return sum;
        else return sum - mat[len/2][len/2];
    }
}
