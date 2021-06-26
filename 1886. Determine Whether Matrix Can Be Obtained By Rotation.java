class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n=mat[0].length;
        for(int t=0;t<4;t++){
            for(int r=0;r<n/2;r++){
                for(int c=r;c<n-r-1;c++){
                    int temp=mat[r][c];
                    mat[r][c]=mat[c][n-1-r];
                    mat[c][n-1-r]=mat[n-1-r][n-1-c];
                    mat[n-1-r][n-1-c]=mat[n-1-c][r];
                    mat[n-1-c][r]=temp;
                }
            }
            if(check(mat,target))
                return true;
        }
        return false;
    }
    public boolean check(int[][] mat,int[][] t){
        for(int i=0;i<t.length;i++)
            for(int j=0;j<t[0].length;j++)
                if(mat[i][j]!=t[i][j])
                    return false;
        return true;
    }
}