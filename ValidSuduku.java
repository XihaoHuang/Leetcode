class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board == null || board.length != 9 || board[0].length != 9)
        return false;
        for(int i=0;i<board.length;i++){
        HashSet<Character> row=new HashSet<>();
        HashSet<Character> col=new HashSet<>();
        HashSet<Character> box=new HashSet<>();
            for(int j=0;j<board.length;j++){
                if(board[i][j]!='.' && !row.add(board[i][j])) return false;
                if(board[j][i]!='.' && !col.add(board[j][i])) return false;
                int box_r=3*(i/3)+j/3;
                int box_c=3*(i%3)+j%3;
                if(board[box_r][box_c]!='.' && !box.add(board[box_r][box_c]))
                    return false;
            }
        }
        return true;
    }
}