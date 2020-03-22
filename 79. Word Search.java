class Solution {
    public boolean exist(char[][] board, String word) {
      			boolean[][] mark=new boolean[board.length][board[0].length];
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(exist(board,word,i,j,0,mark))
					return true;
				
			}
		}
		return false;
	}

    private static boolean exist(char[][] board, String word,int r,int c,int start, boolean[][] mark) {
		if(start==word.length())
		return true;	
	if(r<0 || r>=board.length || c<0 || c>=board[0].length || board[r][c]!=word.charAt(start) || mark[r][c])
			return false;
	
		
	
	mark[r][c]=true;
	
	boolean res=exist(board,word,r+1,c,start+1,mark) || exist(board,word,r-1,c,start+1,mark) || exist(board,word,r,c+1,start+1,mark) || exist(board,word,r,c-1,start+1,mark);
	mark[r][c]=false;
	return res;
	}


}