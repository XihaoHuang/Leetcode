class Solution {
    public int longestLine(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[][][] dp=new int[m][n][4];
        int max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0)
                    continue;
                for(int k=0;k<4;k++)
                    dp[i][j][k]=1;
                //horizontal
                if(j>0 && mat[i][j]==mat[i][j-1])
                    dp[i][j][0]+=dp[i][j-1][0];
                // vertical
                if(i>0 && mat[i][j]==mat[i-1][j])
                    dp[i][j][1]+=dp[i-1][j][1];
                //diagonal
                if(i>0 && j>0 && mat[i][j]==mat[i-1][j-1])
                    dp[i][j][2]+=dp[i-1][j-1][2];
                //anti
                if(i>0 && j<n-1 && mat[i][j]==mat[i-1][j+1])
                    dp[i][j][3]+=dp[i-1][j+1][3];
                max=Math.max(max,Math.max(dp[i][j][0],dp[i][j][1]));
                max=Math.max(max,Math.max(dp[i][j][2],dp[i][j][3]));
            }
        }
        return max;
    }
}