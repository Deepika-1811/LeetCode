class Solution {
    public int deleteAndEarn(int[] nums) {
        if(nums.length==0 || nums == null){
            return 0;
        }
        Map<Integer,Integer> PointsMap = new HashMap<>();
        int maxNum = 0;
        for(int num : nums){
            PointsMap.put(num, PointsMap.getOrDefault(num,0)+num);
            maxNum = Math.max(maxNum,num);
        }
        int[] dp = new int[maxNum+1];
        dp[0] = 0;
        dp[1] = PointsMap.getOrDefault(1,0);
        for(int i=2;i<=maxNum;i++){
            int gain = PointsMap.getOrDefault(i,0);
            dp[i] = Math.max(dp[i-1],dp[i-2]+gain);
        }
     return dp[maxNum];
    }
}