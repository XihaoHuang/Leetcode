class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int[][] dp=new int[2][n];
        for(int i=0;i<2 && i+1<=n;i++){
            dp[i][1]=nums[i];
            // System.out.println(dp[i][1]);
            for(int j=2;j<n;j++){
                dp[i][j]=Math.max(dp[i][j-1],dp[i][j-2]+nums[i+j-1]);
            }
        }
        return Math.max(dp[0][n-1],dp[1][n-1]);
    }
}