// Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).

// Input: low = 3, high = 7
// Output: 3
// Explanation: The odd numbers between 3 and 7 are [3,5,7].


class Solution {
    public int countOdds(int low, int high) {
        int i;
        int count = 0;
        for(i=low;i<=high;i++){
            if(i%2 != 0){
                count++;
            }
        }
        return count;        
    }
}


// the count of odd numbers between 1 and n is (n + 1) / 2
// the count of odd numbers between 1 and low - 1 is low / 2
// the count of odd numbers between 1 and high is (high + 1 ) / 2


class Solution {
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }
}
