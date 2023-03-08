// Problem : 1672

// Input: accounts = [[1,2,3],[3,2,1]]
// Output: 6
// Explanation:
// 1st customer has wealth = 1 + 2 + 3 = 6
// 2nd customer has wealth = 3 + 2 + 1 = 6
// Both customers are considered the richest with a wealth of 6 each, so return 6.



class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int bestWealth = 0;

        // Navigate through the rows
        for (int i = 0; i < accounts.length; i++) {

            int temp = 0;

            // Navigate through the columns of one row
            for (int j = 0; j < accounts[0].length; j++) {

                temp += accounts[i][j];
            }

            // Check if the value found is the best
            if (temp > bestWealth)
                bestWealth = temp;
        }

        return bestWealth;
    }
}
