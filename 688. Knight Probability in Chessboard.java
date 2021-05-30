class Solution {
    public double knightProbability(int n, int k, int row, int column) {
        int[][] direc={{-1,-2},{-2,-1},{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2}};
        double[][] board=new double[n][n];
        board[row][column]=1;
        for(int s=0;s<k;s++){
            double[][] dp=new double[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(board[i][j]>0){
                        for(int [] d:direc){
                            if(i+d[0]>=0 && i+d[0]<n && j+d[1]>=0 && j+d[1]<n)
                                dp[i+d[0]][j+d[1]]+=board[i][j];
                        }
                    }
                }
            }
            board=dp;
        }
        double sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum+=board[i][j];
                // System.out.print(board[i][j]+" ");
            }
            // System.out.println();
        }
        return sum/Math.pow(8,k);
    }
}