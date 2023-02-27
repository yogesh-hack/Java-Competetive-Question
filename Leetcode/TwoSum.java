class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            } else {
                map.put(nums[i], i);
            }

        }
        return new int[]{0,0};
    }
  
  public static void main(String[] args){
    int arr[] = {2,7,11,5};
    int target = 9;
    twoSum(arr,target);
  }

}
