class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n/2;i++){
            swap(matrix,i);
        }
        for(int r=0;r<n;r++){
            for(int c=0;c<r;c++){
                int temp=matrix[r][c];
                matrix[r][c]=matrix[c][r];
                matrix[c][r]=temp;
            }
        }
    }
    public static void swap(int[][] m,int i){
        int[] temp=m[i];
        m[i]=m[m.length-1-i];
        m[m.length-1-i]=temp;
    }
}