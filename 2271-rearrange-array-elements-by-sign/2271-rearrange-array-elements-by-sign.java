class Solution {
    public int[] rearrangeArray(int[] nums) {
        int nums1[] = new int[nums.length];
        int even =0;
        int odd =1;
        for(int i=0;i<nums.length;i++){
           if(nums[i]>0){
            nums1[even] = nums[i];
            even+=2;
           }
           else{
            nums1[odd] = nums[i];
            odd+=2;
           }
        }
        return nums1;
    }
}