class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[][] markarray=new boolean[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0)
                    mark(markarray,i,j);
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(markarray[i][j])
                    matrix[i][j]=0;
                
            }
        }
    }
    public void mark(boolean[][] mark,int i,int j){
        for(int r=0;r<mark.length;r++)
            mark[r][j]=true;
        for(int c=0;c<mark[0].length;c++)
            mark[i][c]=true;
    }
}