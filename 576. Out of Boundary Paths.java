class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][] dp=new int[m][n];
        dp[startRow][startColumn]=1;
        int count=0;
        int[][] dirc={{-1,0},{1,0},{0,1},{0,-1}};
        for(int i=1;i<=maxMove;i++){
            int[][] current=new int[m][n];
            for(int r=0;r<m;r++){
                for(int c=0;c<n;c++){
                    for(int[] d:dirc){
                        int x=d[0]+r;
                        int y=d[1]+c;
                        if(x<0 || x>=m || y<0 || y>=n){
                            count=(count+dp[r][c])%((int)Math.pow(10,9)+7);
                        }else{
                            current[x][y]=(current[x][y]+dp[r][c])%((int)Math.pow(10,9)+7);
                        }
                    }
                }
            }
            dp=current;
        }
        return count;
    }
}