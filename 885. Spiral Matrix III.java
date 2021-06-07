class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] ans=new int[rows*cols][2];
        int dr=0,dc=1,n=0,tmp;
        for(int i=0;i<rows*cols;n++){
            for(int j=0;j<n/2+1;j++){
                if(rStart>=0 && rStart<rows && cStart<cols && cStart>=0)
                    ans[i++]=new int[]{rStart,cStart};
                rStart+=dr;
                cStart+=dc;
            }
            tmp=dr;
            dr=dc;
            dc=-tmp;
        }
        return ans;
    }
}