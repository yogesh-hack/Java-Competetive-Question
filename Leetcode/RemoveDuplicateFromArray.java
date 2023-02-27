class Solution{
  public int removeDuplicate(int[] num){
    if(nums.length == 0) return 0;
    
    int index = 1;
    for(int i = 1; i < nums.length; i++){
      if(nums[i] != nums[index-1])
        nums[index++] = nums[i];
    }
    return index;
  }
  
  public int void main(String[] args){
    int arr[] = {1,1,2,2,3,4,5};
    removeDuplicate(arr);
  }
}
