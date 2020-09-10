class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        boolean odd=A.length%2==0?false:true;
        int m=A[0].length;
        for(int r=0;r<A.length;r++){
            for(int c=0;c<m/2;c++){
                int temp=A[r][c];
                A[r][c]=(A[r][m-1-c]==0)?1:0;
                A[r][m-1-c]=(temp==0)?1:0;
            }
            if(odd) A[r][m/2]=(A[r][m/2]==0)?1:0; 
        }
        return A;
    }
}