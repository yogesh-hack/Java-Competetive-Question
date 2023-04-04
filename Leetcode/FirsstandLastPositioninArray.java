// Problem : 34

// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 1 && nums[0] == target){
            return new int[]{0,0};
        }

        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            if(nums[left] < target) left++;
            if(nums[right] > target) right--;
            if(nums[left] == target && nums[right] == target) return new int[] {left, right};
        }

        return new int[]{-1,-1};
    }
}
