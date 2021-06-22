class Solution {
    public int deleteAndEarn(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int[] dp=new int[nums[n-1]+1];
        for(int i=0;i<n;i++)
            dp[nums[i]]+=nums[i];
        for(int i=2;i<dp.length;i++){
            dp[i]=Math.max(dp[i-1],dp[i]+dp[i-2]);
        }
        return dp[dp.length-1];
    }
}