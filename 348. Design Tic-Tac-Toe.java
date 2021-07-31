class TicTacToe {
    int[][] board;
    boolean win;
    /** Initialize your data structure here. */
    public TicTacToe(int n) {
        board=new int[n][n];
    }
    
    /** Player {player} makes a move at ({row}, {col}).
        @param row The row of the board.
        @param col The column of the board.
        @param player The player, can be either 1 or 2.
        @return The current winning condition, can be either:
                0: No one wins.
                1: Player 1 wins.
                2: Player 2 wins. */
    public int move(int r, int c, int player) {
        if(board[r][c]==0){
            board[r][c]=player;
        }
        int n=board.length;
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        for(int i=0;i<n;i++){
            if(board[i][c]==player)
                count1++;
            if(board[r][i]==player)
                count2++;
            if(board[i][i]==player)
                count3++;
            if(board[i][n-1-i]==player)
                count4++;
        }
        
        if(count1==n || count2==n || count3==n || count4==n) return player;
        return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */