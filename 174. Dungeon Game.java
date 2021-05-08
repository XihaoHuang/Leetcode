class Solution {
    public int calculateMinimumHP(int[][] d) {
        int m=d.length;
        int n=d[0].length;
        int[][] hp=new int[m+1][n+1];
        for(int i=0;i<m+1;i++)
            for(int j=0;j<n+1;j++)
                hp[i][j]=Integer.MAX_VALUE;
        hp[m][n-1]=hp[m-1][n]=1;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                hp[i][j]=Math.max(1,Math.min(hp[i][j+1],hp[i+1][j])-d[i][j]);
            }
        }
        return hp[0][0];
    }
}