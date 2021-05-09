class Solution {
    public int maxCoins(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n+2][n+2];
        int[] c=new int[n+2];
        for(int i=0;i<n;i++)
            c[i+1]=nums[i];
        c[0]=c[n+1]=1;
        for(int l=1;l<=n;l++){
            for(int i=1;i<=n-l+1;i++){
                int j=i+l-1;
                for(int k=i;k<=j;k++) {
                    dp[i][j]=Math.max(dp[i][j],dp[i][k-1]+c[i-1]*c[k]*c[j+1]+dp[k+1][j]);
                }
            }
        }
        return dp[1][n];
    }
}