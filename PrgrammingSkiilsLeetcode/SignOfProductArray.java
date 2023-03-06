class Solution {
    public int arraySign(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0)
                return 0;
            else if(nums[i] < 0)
                count++;
        }
        // if negative is even => positive
        // if negative is odd => negative
        if(count % 2 == 0)
            return 1;
        return -1;
    }
}
