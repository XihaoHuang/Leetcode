class Solution {
    public int[][] transpose(int[][] A) {
        int m=A.length;
        int n=A[0].length;
        int[][] B=new int[n][m];
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                B[c][r]=A[r][c];
            }
        }
        return B;
    }
}