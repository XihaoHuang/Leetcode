class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int n:nums)
            sum+=n;
        if(sum%2!=0) return false;
        sum/=2;
        boolean[] dp=new boolean[sum+1];
        dp[0]=true;
        for(int i=0;i<nums.length && nums[i]<=sum;i++){
            for(int j=sum;j>=0;j--){
                if(dp[j] && nums[i]+j<=sum){
                    dp[nums[i]+j]=true;
                }
            }
        }
        return dp[sum];
    }
}