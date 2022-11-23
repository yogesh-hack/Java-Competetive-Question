public class dicecount {
    //! USING RECURSION
    public static int solve(int dice, int faces, int target){
        // base case
        if (target < 0)
            return 0;
        // dice is not available
        if(dice == 0 && target != 0)
            return 0;
        // not ways to make sum 0 
        if(target == 0 && dice != 0){
            return 0;
        }
        // only one way to achieve this
        if(dice == 0 && target == 0){
            return 1;
        }
        int ans = 0;
        for(int i = 1; i <= faces; i++){
            ans = ans + solve(dice - 1, faces, target-i);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solve(3, 6, 12));
    }
}

/*
 class Solution {
public:
    long long solve(int dice, int faces, int target,vector<vector<long long>>& dp){
        // ! base case
        int mod = pow(10, 9) + 7;
        if (target < 0)
            return 0;
        //! dice is not available
        if(dice == 0 && target != 0)
            return 0;
        //! not ways to make sum 0 
        if(target == 0 && dice != 0){
            return 0;
        }
        //! only one way to achieve this
        if(dice == 0 && target == 0){
            return 1;
        }
        if(dp[dice][target] != -1){
            return dp[dice][target];
        }
        
        long long ans = 0;
        for(int i = 1; i <= faces; i++){
            ans = ans + solve(dice - 1, faces, target-i,dp);
            ans = ans%mod;
        }
        return dp[dice][target] = ans;
    }
    
    int numRollsToTarget(int n, int k, int target) {
        //! Dp solution
        // ! only two parameter change in recurion so, used 2D Dp
        vector<vector<long long>> dp(n+1, vector<long long>(target+1, -1));
        return solve(n,k,target,dp);
    }
};
 */