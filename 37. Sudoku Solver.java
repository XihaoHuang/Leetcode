class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][] board){
        for(int r=0;r<board.length;r++){
            for(int c=0;c<board[0].length;c++){
                if(board[r][c]=='.'){
                    for(char i='1';i<='9';i++){
                        if(check(r,c,board,i)){
                            
                            board[r][c]=i;
                        if(solve(board))
                            return true;
                        else
                            board[r][c]='.';
                        }
                    }
                return false;
                }
            }
        }
        return true;
    }
    public boolean check(int r,int c,char[][] board,char val){
        for(int i=0;i<9;i++){
            if(board[r][i]==val) return false;
            if(board[i][c]==val) return false;
            if(board[r/3*3+i/3][c/3*3+i%3]==val) return false;
        }
        return true;
    }
}