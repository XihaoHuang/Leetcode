class Solution {
    public int minCost(int[][] costs) {
        int m=costs.length;
        int n=costs[0].length;
        int[][] dp=new int[m][n];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0){
                    dp[i][j]=costs[i][j];     
                }else{
                    dp[i][j]+=Math.min(dp[i-1][(j+3-1)%3],dp[i-1][(j+3+1)%3])+costs[i][j];
                }
                if(i==m-1)
                    min=Math.min(min,dp[i][j]);
            }                
        }
        return min;
    }
}