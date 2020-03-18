class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid.length==0 ) return 0;
        int[] dp=new int[obstacleGrid[0].length];
        dp[0]=1;
        for(int[] a:obstacleGrid){
            for(int i=0;i<obstacleGrid[0].length;i++){
                if(a[i]==1)
                    dp[i]=0;
                else if(i>0)
                    dp[i]+=dp[i-1];
            }
        }
        return dp[dp.length-1];
    }
}
