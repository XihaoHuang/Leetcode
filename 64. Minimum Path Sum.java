class Solution {
    public int minPathSum(int[][] grid) {
        int[] dp=new int[grid[0].length];
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				if(i==0) {
					if(j==0) dp[j]=grid[i][j];
					else dp[j]=dp[j-1]+grid[i][j];
				}
				else {
					if(j==0) dp[j]+=grid[i][j];
					else {
                        if(dp[j-1]>dp[j]) 
							dp[j]+=grid[i][j];
						else 
							dp[j]=grid[i][j]+dp[j-1];
						}
                    }
			            
				}
			}
		
		
		return dp[dp.length-1];
    }
}