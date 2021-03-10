class Solution {
    public void solve(char[][] board) {
        if(board.length<2 || board[0].length<2)
            return ;
        for(int i=0;i<board.length;i++){
            if(board[i][0]=='O')
                dfs(board,i,0);
            if(board[i][board[0].length-1]=='O')
                dfs(board,i,board[0].length-1);
        }
        for(int i=0;i<board[0].length;i++){
            if(board[0][i]=='O')
                dfs(board,0,i);
            if(board[board.length-1][i]=='O')
                dfs(board,board.length-1,i);
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O')
                    board[i][j]='X';
                if(board[i][j]=='*')
                    board[i][j]='O';
            }
        }
    }
    public void dfs(char[][] board,int r,int c){
        if(r<0 || r==board.length || c<0 || c==board[0].length)
            return;
        if(board[r][c]=='O'){
            board[r][c]='*'; 
            dfs(board,r+1,c);
            dfs(board,r-1,c);
            dfs(board,r,c+1);
            dfs(board,r,c-1);
        }
        
    }
}