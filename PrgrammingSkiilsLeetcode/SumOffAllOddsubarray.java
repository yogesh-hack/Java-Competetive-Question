// Problem : 1588

// Input: arr = [1,4,2,5,3]
// Output: 58
// Explanation: The odd-length subarrays of arr and their sums are:
// [1] = 1
// [4] = 4
// [2] = 2
// [5] = 5
// [3] = 3
// [1,4,2] = 7
// [4,2,5] = 11
// [2,5,3] = 10
// [1,4,2,5,3] = 15
// If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58

// brute force Approach

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
       
        int win=1,ans=0;
        while(win<=arr.length){
            for(int i=0;i<=arr.length-win;i++){
                for(int j=i;j<i+win;j++){
                    ans+=arr[j];
                }
            }
            win+=2;
        }
        return ans;
    }
}


// Good Approach

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
       
        int sum=0;
        int n = arr.length;
        for(int i=0; i<arr.length; i++)
        {
            int left = i+1; // elements on left side of index i
            int right = n-i; // elements on right side of index i
            int k = left * right; // total subarrays
            int odd = (k+1)/2; // number of odd length subarrays

            sum = sum + odd*arr[i]; // odd*arr[i] -> sum of a particular elements present in all odd length subarrays.
        }

        return sum;
    }
}
