// problem : 1502

// Input: arr = [3,5,1]
// Output: true
// Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 
// 2 and -2 respectively, between each consecutive elements.

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        // if arr = [1,2] 
        if(arr.length < 3){
            return true;
        }

        Arrays.sort(arr);

        int diff = arr[0]-arr[1];
        
        for(int i = 2; i < arr.length; i++){
            if(arr[i-1] - arr[i] != diff){
                return false;
            }
        }
        return true;
    }
}
