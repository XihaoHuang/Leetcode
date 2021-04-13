class Solution {
    public boolean increasingTriplet(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j] && dp[i]<dp[j]+1)
                    dp[i]=dp[j]+1;
                if(dp[i]>=3) return true;
            }
        }
        return false;
    }
}