class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int[][] dp=new int[m][n];
        int[][] t=new int[m+1][n+1];
        for(int i=1;i<m+1;i++)
            for(int j=1;j<n+1;j++)
                t[i][j]=t[i-1][j]+t[i][j-1]+mat[i-1][j-1]-t[i-1][j-1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int rr=Math.min(m,i+k+1);
                int cr=Math.min(n,j+k+1);
                int rl=Math.max(0,i-k);
                int cl=Math.max(0,j-k);
                dp[i][j]=t[rr][cr]-t[rr][cl]-t[rl][cr]+t[rl][cl];
            }
        }
        return dp;
    }
}