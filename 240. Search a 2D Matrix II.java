class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rol=0,col=matrix[0].length-1;
        while(col>=0 && rol<matrix.length){
            if(matrix[rol][col]==target)
                return true;
            else if(matrix[rol][col]>target)
                col--;
            else if(matrix[rol][col]<target)
                rol++;
        }
        return false;
    }
}