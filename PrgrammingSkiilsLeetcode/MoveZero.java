// problem : 283

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]


class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length, low = 0, high = 0;
        if(nums == null || len == 1){
            return;
        }
        while(high != len){
            if(nums[low] == 0 && nums[high] != 0){
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
            }
            else if(nums[low] != 0){
                low++;
            }
            high++;
        }
        
    }
}
