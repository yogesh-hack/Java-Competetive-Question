class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(); // hash set of unique elements
    for (int num : nums) {
        if (set.contains(num)) { // num is already in the set, so it's a duplicate
            return true;
        }
        set.add(num); // add num to the set
    }
    return false; // no duplicates found
    }
}
