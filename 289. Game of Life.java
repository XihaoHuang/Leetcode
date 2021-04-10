class Solution {
    public void gameOfLife(int[][] board) {
        int[][] directions={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        int m=board.length;
        int n=board[0].length;
        int[][] result=new int[m][n];
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                    int live=0;
                    for(int[] location: directions){
                        live+=checklive(r+location[0],c+location[1],board)?1:0;
                    }
                    if(board[r][c]==1 && (live==2 || live==3))
                        result[r][c]=1;
                    else 
                        if(board[r][c]==0 && live==3)
                        result[r][c]=1;
            }
        }
        for(int r=0;r<m;r++)
            for(int c=0;c<n;c++)      
                board[r][c]=result[r][c];
                
    }
    public boolean checklive(int r,int c,int[][] board){
        return r>=0 && r<board.length && c>=0 && c<board[0].length && board[r][c]==1;       
    }
}