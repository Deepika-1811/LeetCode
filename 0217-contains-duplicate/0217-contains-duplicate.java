class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for(int i=0;i<nums.length;i++){
        numSet.add(nums[i]);
    }
    return !(numSet.size() == nums.length);
}
}