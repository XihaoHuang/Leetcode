class Solution {
    public int trap(int[] height) {
        if(height.length==0) return 0;
        int[][] dp=new int[2][height.length];
        dp[0][0]=height[0];
        dp[1][height.length-1]=height[height.length-1];
        int res=0;
        for(int i=1;i<height.length;i++){
            dp[0][i]=Math.max(dp[0][i-1],height[i]);
        }
        for(int i=height.length-2;i>=0;i--){
            dp[1][i]=Math.max(dp[1][i+1],height[i]);
            res+=Math.min(dp[0][i],dp[1][i])-height[i];
        }
        return res;
    }
}